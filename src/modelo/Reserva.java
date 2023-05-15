package modelo;

import java.math.BigDecimal;
import java.sql.Date;

public class Reserva {
	
	private final BigDecimal VALOR_RESERVA = new BigDecimal(299.99);
	
	private int id;
	
	private Date dataEntrada;
	
	private Date dataSaida;
	
	private String valor;
	
	private String formaPagamento;

	public Reserva() {
		
	}
	
	public void calculaValorReserva(String dataEntrada, String dataSaida) {
		this.dataEntrada = java.sql.Date.valueOf(dataEntrada);
		this.dataSaida = java.sql.Date.valueOf(dataSaida);
//		BigDecimal totalDiarias = new BigDecimal(this.dataEntrada.(this.dataSaida));
//		this.valor = VALOR_RESERVA.multiply(totalDiarias).toString();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dataEntrada
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	/**
	 * @return the dataSaida
	 */
	public Date getDataSaida() {
		return dataSaida;
	}

	/**
	 * @param dataSaida the dataSaida to set
	 */
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the formaPagamento
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
