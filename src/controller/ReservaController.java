package controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaController {
	private ReservaDAO reservaDAO;
	private Reserva reserva;

	public ReservaController() {
		this.reserva = new Reserva();
		this.reservaDAO = new ReservaDAO(new ConnectionFactory().recuperaConexao());
	}

	public void salvar(Date dateEntrada, Date dateSaida, String valor, String formaPagamento) {
		this.reserva = new Reserva(dateEntrada, dateSaida, valor, formaPagamento);
		reservaDAO.salvar(this.reserva);
	}
	
	public List<Reserva> listar() {
		return reservaDAO.listar();
	}
	
//	public String calculaValor(String dataEntrada, String dataSaida) {
//		
//			this.reserva.calculaValor(dataEntrada, dataSaida);
//			return this.reserva.getValor().toString();
//	}
	
	public int getIdReserva() {
		return reserva.getId();
	}

}
