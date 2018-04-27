<%@page import="pacote.trabalho.ItemPedido"%>
<%@page import="pacote.trabalho.Item"%>
<%@page import="pacote.trabalho.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Pedido pedido = (Pedido) request.getAttribute("pedido");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Itens</title>
    </head>
    <body>
        <h1>Lista de Itens</h1>
        <table border="2">
            <thead>
                <tr>
                    <th>Item</th>
                    <th>Preço Unitário</th>
                    <th>Quantidade</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (ItemPedido item : pedido.getItens()) {
                %> 
                <tr>
                    <td><%=item.getItem().getNome()%></td>
                    <td><%=item.getItem().getPreco()%></td>
                    <td><%=item.getItem().getQuantidade()%></td>
                </tr>
                <%}%>
                <tr>
                    <td><a href="adicionarItem.html?pedido=<%=pedido.getNumPedido()%>">Adicionar Item</a></td>  
                </tr>
            </tbody>
        </table>
        <p><a href="pedido.html">Voltar para os pedidos</a></p>
    </body>
</html>
