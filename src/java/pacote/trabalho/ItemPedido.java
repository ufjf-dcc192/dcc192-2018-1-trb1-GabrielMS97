package pacote.trabalho;

import java.util.ArrayList;

public class ItemPedido {

    private Item item;
    private Integer qtd;
    private static ArrayList<Item> itens;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.qtd = quantidade;
    }
    

    public static ArrayList<Item> getItens() {
        if (itens == null) {
            itens = new ArrayList<>();
            itens.add(new Item("Hamburguer", 3.50, 1));
            itens.add(new Item("X-Burguer", 4.50, 1));
            itens.add(new Item("X-Frango", 5.00, 1));
            itens.add(new Item("X-Bacon", 5.00, 1));
            itens.add(new Item("X-Pernil", 6.00, 1));
            itens.add(new Item("X-Tudo", 6.50, 1));
            itens.add(new Item("Coca-Cola 500ml", 3.50, 1));
            itens.add(new Item("Coca-Cola 750ml", 4.50, 1));
            itens.add(new Item("Pepsi 500ml", 3.00, 1));
            itens.add(new Item("Sprite 500ml", 3.00, 1));
            itens.add(new Item("Suco Natural 500ml", 2.50, 1));
            itens.add(new Item("Sorvete Casquinha", 2.00, 1));
            itens.add(new Item("Milk Shake Pequeno", 3.00, 1));
            itens.add(new Item("Milk Shake Médio", 4.00, 1));
            itens.add(new Item("Milk Shake Grande", 5.00, 1));
            itens.add(new Item("Sundae", 3.50, 1));
        }
        return itens;
    }

    public static void setItens(ArrayList<Item> itens) {
        ItemPedido.itens = itens;
    }
    
    

}
