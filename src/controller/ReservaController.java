package controller;

import java.sql.Date;
import modelo.Reserva;

public class ReservaController {

	private Reserva reserva;

	public String calculaValorReserva(String dataEntrada, String dataSaida) {
		reserva = new Reserva();
		reserva.calculaValorReserva(dataEntrada, dataSaida);
		return reserva.getValor();
	}

}
