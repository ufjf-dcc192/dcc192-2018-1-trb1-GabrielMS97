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
        <link rel="stylesheet" href="css/estilo.css" />
        <title>Lista de Itens</title>
    </head>
    <body>
        <header>
            <p id="centro">Lista de Itens</p>
            <nav id="nav">
                <p id="navp"><a href="index.html">Página Inicial</a> | <a href="pedido.html">Gerenciar Pedidos</a></p>
            </nav>
        </header><hr/>
        <%
            if (pedido.getStatus() == false) {
        %>
        <table>
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
                    <td>R$ <%=item.getItem().precoFormatado()%></td>
                    <td><%=item.getQtd()%></td>
                </tr>
                <%linha++;
                    }%>
                <%
                    if (pedido.getStatus() == false) {
                %>
            <p>O pedido está fechado</p>
            <%} else {%>
            <tr>
                <td><a href="adicionarItem.html?pedido=<%=pedido.getNumPedido()%>">Adicionar Item</a></td>  
            </tr>
            <%}%>
        </tbody>
    </table>
    <%} else {%>
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
            <%linha++;
                    }%>
        </tbody>
    </table>
    <%
        if (pedido.getStatus() == false) {
    %>
    <p id="simples">O pedido está fechado</p>
    <%} else {%>
    <p id="simples"><a href="adicionarItem.html?pedido=<%=pedido.getNumPedido()%>">Adicionar Item</a></p>  
    <%}%>
    <%}%>
</body>
</html>
