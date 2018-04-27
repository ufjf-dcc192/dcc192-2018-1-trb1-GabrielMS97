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
        <%
            if(pedido.getStatus() == false) {
        %>
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
                    int linha = 0;
                    for (ItemPedido item : pedido.getItens()) {
                %> 
                <tr>
                    <td><%=item.getItem().getNome()%></td>
                    <td><%=item.getItem().precoFormatado()%></td>
                    <td><%=item.getQtd()%></td>
                </tr>
                <%linha++;}%>
                <%
                    if(pedido.getStatus() == false) {
                %>
                <p>O pedido está fechado</p>
                <%}else{%>
                <tr>
                    <td><a href="adicionarItem.html?pedido=<%=pedido.getNumPedido()%>">Adicionar Item</a></td>  
                </tr>
                <%}%>
            </tbody>
        </table>
        <%}else{%>
        <table border="2">
            <thead>
                <tr>
                    <th>Item</th>
                    <th>Preço Unitário</th>
                    <th>Quantidade</th>
                    <th>Excluir Item</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int linha = 0;
                    for (ItemPedido item : pedido.getItens()) {
                %> 
                <tr>
                    <td><%=item.getItem().getNome()%></td>
                    <td>R$ <%=item.getItem().precoFormatado()%></td>
                    <td><%=item.getQtd()%></td>
                    <td><a href="excluirItem.html?linha=<%=linha%>&pedido=<%=pedido.getNumPedido()%>&item=<%=item%>">Excluir</a></td>
                </tr>
                <%linha++;}%>
                <%
                    if(pedido.getStatus() == false) {
                %>
                <p>O pedido está fechado</p>
                <%}else{%>
                <tr>
                    <td><a href="adicionarItem.html?pedido=<%=pedido.getNumPedido()%>">Adicionar Item</a></td>  
                </tr>
                <%}%>
            </tbody>
        </table>
        <%}%>    
        <p><a href="pedido.html">Voltar para os pedidos</a></p>
    </body>
</html>
