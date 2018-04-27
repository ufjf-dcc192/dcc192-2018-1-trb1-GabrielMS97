<%@page import="pacote.trabalho.ItemPedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Item</title>
    </head>
    <body>
        <h1>Novo Item</h1>
        <form method="post" >
            <label>Escolha um item:</label>
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="item">
                        <%for (int i = 0; i < ItemPedido.getItens().size(); i++) {%>
                        <option value="<%=i%>"><%=i + 1 + " - " + ItemPedido.getItens().get(i).getNome() + " R$ " + ItemPedido.getItens().get(i).getPreco()%></option>
                        <%}%>
                    </select><br/>
            <label>Determine a quantidade desse item:</label>
            <input name="quantidade" type="number" class="form-control" placeholder="Quantidade" required="required"><br/>
            <button class="btn btn-primary" type="submit">Concluir</button>
            <br/>
            <input type="hidden" value="novoItem" name="novoItem"/>
        </form>
        <p><a href="pedido.html">Cancelar</a></p>
    </body>
</html>
