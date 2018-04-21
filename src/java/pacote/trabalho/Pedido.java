package pacote.trabalho;

import java.util.List;

public class Pedido {
    Boolean status;
    Double valor;
    List<Item> itens;

    public Pedido(Boolean status, Double valor, List<Item> itens) {
        this.status = status;
        this.valor = valor;
        this.itens = itens;
        itens.add(new Item("Hamburgão", 3.50));
        itens.add(new Item("Batata-Frita", 1.75));
        itens.add(new Item("Coca-Cola 500ml", 3.00));
    }

    public Pedido() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    
}
