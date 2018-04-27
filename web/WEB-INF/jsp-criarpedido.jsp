<%@page import="pacote.trabalho.ItemPedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css" />
        <title>Novo Pedido</title>
    </head>
    <body>
        <header>
            <p id="centro">Novo pedido</p>
            <nav id="nav">
                <p id="navp"><a href="index.html">Página Inicial</a> | <a href="pedido.html">Gerenciar Pedidos</a></p>
            </nav>
        </header><hr/>
        <form method="post">
            <label id="simples">Número da mesa: <input name="mesa" required="required"/></label><br/>
            <input type="submit"/>
            <input type="reset"/>
        </form>
        <p><a href="pedido.html">Cancelar</a></p>
    </body>
</html>