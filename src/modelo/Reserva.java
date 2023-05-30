package modelo;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	
	private int id;
	
	private Date dataEntrada;
	
	private Date dataSaida;
	
	private String valor;
	
	private String formaPagamento;

	public Reserva(int id, Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public Reserva(Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

//	public void calculaValor(String dataEntrada, String dataSaida) {
//		LocalDate dataEntra = LocalDate.parse(dataEntrada);
//		LocalDate dataSai = LocalDate.parse(dataSaida);
//		
//		this.valor = ChronoUnit.DAYS.between(dataEntra, dataSai);
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public String getValor() {
		return valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	
}
