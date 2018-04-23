package pacote.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Integer numPedido;
    Boolean status;
    Double valor;
    List<Item> itens;

    public Pedido(Integer numPedido ,Boolean status) {
        this.numPedido = numPedido;
        this.status = status;
        this.valor = 0.0;
        this.itens = new ArrayList<>();
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
    
    public Integer getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Integer numPedido) {
        this.numPedido = numPedido;
    }
}
