<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="pacote.trabalho.Pedido"%>
<%@page import="pacote.trabalho.ListaPedidos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedidos</title>
    </head>
    <body>
        <h1>Pedidos</h1>
        <table border="2">
            <thead>
                <tr>
                    <th>Número do pedido</th>
                    <th>Mesa</th>
                    <th>Valor deste pedido</th>
                    <th>Status do pedido</th>
                    <th>Aberto em</th>
                    <th>Fechado em</th>
                    <th>Gerenciar/Ver Itens</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < ListaPedidos.getInstance().size(); i++) {
                        Pedido pedido = ListaPedidos.getInstance().get(i);
                %> 
                <tr>
                    <td><a>Pedido </a><%=pedido.getNumPedido()%></td>
                    <td><a>Mesa </a><%=pedido.getMesa()%></td>
                    <td><a>R$ </a><%=pedido.valorFormatado()%></td>
                    <td><a href="fecharPedido.html?codigo=<%=i%>&pedido=<%=pedido.getNumPedido()%>"><%=pedido.getStatus() ? "Aberto" : "Fechado"%></td>
                    <td><%=pedido.getHoraAbertura()%></td>
                    <td><%=pedido.getHoraFechamento()%></td>
                    <td><a href="listarItens.html?pedido=<%=pedido.getNumPedido()%>">Itens<a></td>
                </tr>
                <%}%>
                <tr>
                    <td><a href="novoPedido.html">Registrar Pedido</a></td>  
                </tr>
            </tbody>
        </table>
    </body>
    <p><a href="index.html">Voltar ao início</a></p>
</html>
