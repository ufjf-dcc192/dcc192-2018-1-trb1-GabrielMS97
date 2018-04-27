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
    "/listarPedidos.html", "/pedido.html", "/excluirPedido.html", "/novoPedido.html", "/fecharPedido.html", "/listarItens.html", "/adicionarItem.html"})
public class LanchoneteServlet extends HttpServlet {

    Integer pedido = 2;

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
        } else if ("/fecharPedido.html".equals(request.getServletPath())) {
            fecharPedido(request, response);
        } else if ("/listarItens.html".equals(request.getServletPath())) {
            listarItens(request, response);
        } else if ("/adicionarItem.html".equals(request.getServletPath())) {
            adicionarItem(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("novoItem".equals(request.getParameter("novoItem"))) {
            Pedido pedido = ListaPedidos.getInstance().get(Integer.parseInt(request.getParameter("pedido")));
            int i = Integer.parseInt(request.getParameter("item"));
            ItemPedido itemPedido = new ItemPedido(ItemPedido.getItens().get(i), Integer.parseInt(request.getParameter("quantidade")));
            pedido.getItens().add(itemPedido);
            pedido.setValor(itemPedido.getQtd() * itemPedido.getItem().getPreco());
            response.sendRedirect("pedido.html");
        } else {
            Integer mesa = Integer.parseInt(request.getParameter("mesa"));
            ListaPedidos.getInstance().add(new Pedido(++pedido, mesa));
            response.sendRedirect("pedido.html");
        }

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
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-criarpedido.jsp");
        despachante.forward(request, response);
    }

    private void fecharPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        ListaPedidos.getInstance().get(codigo).setStatus(!ListaPedidos.getInstance().get(codigo).getStatus());
        response.sendRedirect("pedido.html");
    }

    private void listarItens(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pedido pedido = ListaPedidos.getInstance().get(Integer.parseInt(request.getParameter("pedido")));
        request.setAttribute("pedido", pedido);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-listarItens.jsp");
        despachante.forward(request, response);
    }

    private void adicionarItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pedido pedido = ListaPedidos.getInstance().get(Integer.parseInt(request.getParameter("pedido")));
        request.setAttribute("pedido", pedido);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-adicionarItem.jsp");
        despachante.forward(request, response);
    }
}
