package pacote.trabalho;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {

    private static List<Pedido> pedidos;
    private static int i = 1;

    public static List<Pedido> getInstance() {
        if (pedidos == null) {
            pedidos = new ArrayList<>();
            pedidos.add(new Pedido(i, 3));
            pedidos.add(new Pedido(++i, 1));
            pedidos.add(new Pedido(++i, 4));
        }
        return pedidos;
    }
}
