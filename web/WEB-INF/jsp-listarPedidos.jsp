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
        <link rel="stylesheet" href="css/estilo.css" />
        <title>Pedidos</title>
    </head>
    <body>
        <header>
            <p id="centro">Pedidos</p>
            <nav id="nav">
                <p id="navp"><a href="index.html">Página Inicial</a> | <a href="pedido.html">Gerenciar Pedidos</a></p>
            </nav>
        </header><hr/>
        <table>
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
                    <td>Pedido <%=pedido.getNumPedido()%></td>
                    <td>Mesa <%=pedido.getMesa()%></td>
                    <td>R$ <%=pedido.valorFormatado()%></td>
                    <td><a href="fecharPedido.html?codigo=<%=i%>&pedido=<%=pedido.getNumPedido()%>"><%=pedido.getStatus() ? "Aberto" : "Fechado"%></td>
                    <td><%=pedido.getHoraAbertura()%></td>
                    <td><%=pedido.getHoraFechamento()%></td>
                    <td><a href="listarItens.html?pedido=<%=pedido.getNumPedido()%>">Itens<a></td>
                </tr>
                <%}%>
            </tbody>
        </table>
        <p id="simples"><a href="novoPedido.html">Registrar Pedido</a></p>  
    </body>
</html>
