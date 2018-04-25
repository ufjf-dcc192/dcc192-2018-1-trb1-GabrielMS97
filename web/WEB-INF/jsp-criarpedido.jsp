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
            <label>Escolha o item:</label>
            <div class="row">
                <div class="col">
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="item">
                        <%for (int i = 0; i < ItemPedido.getItens().size(); i++) {%>
                        <option value="<%=i%>"><%=i + 1 + " - " + ItemPedido.getItens().get(i).getNome() + " R$ " + ItemPedido.getItens().get(i).getPreco()%></option>
                        <%}%>
                    </select>
                </div>
                <div class="col">
                    <input name="quantidade" type="number" class="form-control" placeholder="Quantidade" required="required">
                </div>
            </div><br/>
            <button class="btn btn-primary" type="submit">Concluir</button>
        </form>
        <p><a href="pedido.html">Cancelar</a></p>
    </body>
</html>