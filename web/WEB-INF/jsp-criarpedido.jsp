<%@page import="pacote.trabalho.ItemPedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Pedido</title>
    </head>
    <body>
        <h1>Novo Pedido</h1>
        <form method="post">
            <label>Número da mesa: <input name="mesa" required="required"/></label><br/>
            <input type="submit"/>
            <input type="reset"/>
        </form>
        <p><a href="pedido.html">Cancelar</a></p>
    </body>
</html>