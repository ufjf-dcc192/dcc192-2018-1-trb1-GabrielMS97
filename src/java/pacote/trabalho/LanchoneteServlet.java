package pacote.trabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LanchoneteServlet", urlPatterns = {"/LanchoneteServlet.html", 
    "/listarPedidos.html", "/pedido.html", "/excluirPedido.html", "/novoPedido.html", "/fecharPedido.html"})
public class LanchoneteServlet extends HttpServlet {

    Integer pedido = 3;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/listarPedidos.html".equals(request.getServletPath())) {
            listarPedidos(request, response);
        } else if ("/pedido.html".equals(request.getServletPath())) {
            listarPedidos(request, response);
        } else if ("/excluirPedido.html".equals(request.getServletPath())) {
            excluirPedidos(request, response);
        } else if ("/novoPedido.html".equals(request.getServletPath())) {
            novoPedido(request, response);
        }else if ("/fecharPedido.html".equals(request.getServletPath())) {
            fecharPedido(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numero = request.getParameter("numero");
        Pedido novoPedido;
        novoPedido = new Pedido(++pedido);
        novoPedido.setMesa(Integer.parseInt(numero));
        ListaPedidos.getInstance().add(novoPedido);
        response.sendRedirect("pedido.html");
    }

    private void listarPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pedido> pedido = ListaPedidos.getInstance();
        request.setAttribute("pedido", pedido);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-listarPedidos.jsp");
        despachante.forward(request, response);
    }

    private void excluirPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaPedidos.getInstance().remove(linha);
        response.sendRedirect("pedido.html");
    }

    private void novoPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ListaPedidos.getInstance().add(new Pedido(++pedido));
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-criarpedido.jsp");
        despachante.forward(request, response);
    }
    
    private void fecharPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        ListaPedidos.getInstance().get(codigo).setStatus(!ListaPedidos.getInstance().get(codigo).getStatus());
        response.sendRedirect("pedido.html");
    }
}
