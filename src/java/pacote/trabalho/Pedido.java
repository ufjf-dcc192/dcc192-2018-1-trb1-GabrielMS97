package pacote.trabalho;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Integer mesa;
    private Integer numPedido;
    private Boolean status;
    private Double valor;
    private List<Item> itens;
    private String horaAbertura;
    private String horaFechamento = "-";

    public Pedido(Integer numPedido, Integer mesa) {
        this.numPedido = numPedido;
        this.mesa = mesa;
        this.status = true;
        this.valor = 0.0;
        this.itens = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String str = fmt.format(data);
        this.horaAbertura = str;
    }
    
    public Pedido(Integer numPedido) {
        this.numPedido = numPedido;
        this.mesa = mesa;
        this.status = true;
        this.valor = 0.0;
        this.itens = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String str = fmt.format(data);
        this.horaAbertura = str;
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

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        if (horaFechamento == null) {
            this.horaFechamento = "-";
        } else {
            this.horaFechamento = horaFechamento;
        }
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

}
