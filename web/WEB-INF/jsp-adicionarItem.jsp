<%@page import="pacote.trabalho.ItemPedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css" />
        <title>Novo Item</title>
    <a href="jsp-criarpedido.jsp"></a>
    </head>
    <body>
        <header>
            <p id="centro">Novo Item</p>
            <nav id="nav">
                <p id="navp"><a href="index.html">Página Inicial</a> | <a href="pedido.html">Gerenciar Pedidos</a></p>
            </nav>
        </header><hr/>
        <form method="post" >
            <label id="simples">Escolha um item:</label>
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="item">
                        <%for (int i = 0; i < ItemPedido.getItens().size(); i++) {%>
                        <option value="<%=i%>"><%=i + 1 + " - " + ItemPedido.getItens().get(i).getNome() + " R$ " + ItemPedido.getItens().get(i).getPreco()%></option>
                        <%}%>
                    </select><br/>
            <label id="simples">Determine a quantidade desse item:</label>
            <input name="quantidade" type="number" class="form-control" placeholder="Quantidade" required="required"><br/>
            <button class="btn btn-primary" type="submit">Concluir</button>
            <br/>
            <input type="hidden" value="novoItem" name="novoItem"/>
        </form>
        <p><a href="pedido.html">Cancelar</a></p>
    </body>
</html>
