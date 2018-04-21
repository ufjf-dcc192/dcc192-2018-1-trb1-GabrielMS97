package pacote.trabalho;

import java.util.List;

public class Mesa {
    Integer numero;
    List<Pedido> pedidos;

    public Mesa(Integer numero, List<Pedido> pedidos) {
        this.numero = numero;
        this.pedidos = pedidos;
    }
    
    public Mesa(Integer numero) {
        this.numero = numero;
    }

    public Mesa() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
