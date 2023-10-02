package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private Integer idReserva;
    private Date dataEntrada;
    private Date dataSaida;
    private Double valor;
    private String formaPagamento;
    

    public Reserva(Date dataEntrada, Date dataSaida, Double valor, String formaPagamento) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Date getDataEntrada() {
        return this.dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataEntradaFormatada() {
        SimpleDateFormat padrao = new SimpleDateFormat("yyyy-MM-dd");
        return padrao.format(this.dataEntrada);
    }
    public String getDataSaidaFormatada() {
        SimpleDateFormat padrao = new SimpleDateFormat("yyyy-MM-dd");
        return padrao.format(this.dataSaida);
    }
    @Override
	public String toString() {
		return String.format("A reserva : %tD, %tD", this.dataEntrada, this.dataSaida, + this.valor + this.formaPagamento);
	}
}
