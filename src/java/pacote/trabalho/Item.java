package pacote.trabalho;

public class Item {

    String nome;
    Double preco;

    public Item(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Item() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
