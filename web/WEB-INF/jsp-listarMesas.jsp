<%@page import="pacote.trabalho.Mesa"%>
<%@page import="pacote.trabalho.ListaMesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciamento de Mesas</title>
    </head>
    <body>
        <h1>Gerenciamento de Mesas</h1>
        <table border = "2">
            <tbody>   
                <%
                    for (int i = 0; i < ListaMesas.getInstance().size(); i++) {
                        Mesa mesa = ListaMesas.getInstance().get(i);
                %>  
                <tr>
                    <td><a href="">Mesa <%=mesa.getNumero()%></a></td>
                    <td><a href="excluirMesa.html?linha=<%=i%>">Excluir</a></td>
                </tr>
                <%}%>
            </tbody>
            <tfoot>
                <tr>
                    <td><a href="novaMesa.html">Adicionar nova mesa</a></td>
                </tr>
            </tfoot>
        </table>
        <p><a href="index.html">Voltar ao início</a></p>
    </body>
</html>
