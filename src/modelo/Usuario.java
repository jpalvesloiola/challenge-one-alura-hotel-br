package modelo;

public class Usuario {
	private Integer id;
	private String usuario;
	private String senha;

	public Usuario( String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
}
