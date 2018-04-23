package pacote.trabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LanchoneteServlet", urlPatterns = {"/LanchoneteServlet.html", "/mesa.html", "/excluirMesa.html", "/novaMesa.html", "/listarPedidos.html"})
public class LanchoneteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/mesa.html".equals(request.getServletPath())) {
            listarMesas(request, response);
        } else if ("/excluirMesa.html".equals(request.getServletPath())) {
            excluirMesas(request, response);
        } else if ("/novaMesa.html".equals(request.getServletPath())) {
            criarMesas(request, response);
        } else if ("/listarPedidos.html".equals(request.getServletPath())) {
            listarPedidos(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numero = request.getParameter("numero");
        Mesa novaMesa = new Mesa(Integer.parseInt(numero));
        ListaMesas.getInstance().add(novaMesa);
        response.sendRedirect("mesa.html");
    }

    private void listarMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Mesa> mesas = ListaMesas.getInstance();
        request.setAttribute("mesas", mesas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-listarMesas.jsp");
        despachante.forward(request, response);
    }

    private void excluirMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaMesas.getInstance().remove(linha);
        response.sendRedirect("mesa.html");
    }

    private void criarMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Mesa> mesas = ListaMesas.getInstance();
        request.setAttribute("mesas", mesas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-novaMesa.jsp");
        despachante.forward(request, response);
    }
    
    private void listarPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numeroMesa = Integer.parseInt(request.getParameter("numeroMesa"));
        request.setAttribute("numeroMesa", numeroMesa);
        List<Mesa> mesa = ListaMesas.getInstance();
        List<Pedido> pedidos = mesa.get(numeroMesa).getPedidos();
        request.setAttribute("pedidos", pedidos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/jsp-listarPedidos.jsp");
        despachante.forward(request, response);
    }

}
