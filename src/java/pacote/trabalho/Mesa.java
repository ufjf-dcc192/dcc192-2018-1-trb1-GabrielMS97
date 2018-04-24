package pacote.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private Integer numero;
    private List<Pedido> pedidos;
    
    public Mesa(Integer numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
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
