package controller;

import dao.UsuarioDAO;
import factory.ConnectionFactory;
import modelo.Usuario;

public class UsuarioController {
	private UsuarioDAO userDAO;

	public UsuarioController() {
		this.userDAO = new UsuarioDAO(new ConnectionFactory().recuperaConexao());
	}
	
	public boolean consulta(String usuario, String senha) {
		return this.userDAO.consulta(new Usuario( usuario, senha));
	}
}
