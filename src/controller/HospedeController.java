package controller;

import java.sql.Date;
import java.util.List;
import dao.HospedeDAO;
import factory.ConnectionFactory;
import modelo.Hospede;

public class HospedeController {
	private HospedeDAO hospedeDAO;
	private Hospede hospede;

	public HospedeController() {
		this.hospede = new Hospede();
		this.hospedeDAO = new HospedeDAO(new ConnectionFactory().recuperaConexao());
	}

	public void salvar(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone,
			int reservaId) {
		this.hospede = new Hospede(nome, sobrenome, dataNascimento, nacionalidade, telefone, reservaId);
		hospedeDAO.salvar(this.hospede);
	}
	
	public List<Hospede> listar() {
		return hospedeDAO.listar();
	}
	
//	public String calculaValor(String dataEntrada, String dataSaida) {
//		
//			this.hospede.calculaValor(dataEntrada, dataSaida);
//			return this.hospede.getValor().toString();
//	}
	
	public int getIdHospede() {
		return hospede.getId();
	}

}
