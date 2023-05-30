package modelo;

import java.sql.Date;

public class Hospede {
	
	private int id;
	
	private String nome;
	
	private String sobrenome;
	
	private Date dataNascimento;
	
	private String nacionalidade;
	
	private String telefone;
	
	private int reservaId;
	
	public Hospede() {
		
	}

	public Hospede(int id, String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone,
			int reservaId) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.reservaId = reservaId;
	}

	public Hospede(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone,
			int reservaId) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.reservaId = reservaId;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getReservaId() {
		return reservaId;
	}

	public void setReservaId(int reservaId) {
		this.reservaId = reservaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
	
	
	
}

