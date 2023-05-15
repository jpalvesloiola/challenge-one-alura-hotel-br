package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}

	public boolean consulta(Usuario user) {
		String sql = "SELECT ID, USUARIO, SENHA FROM USUARIOS WHERE SENHA = ? AND USUARIO = ?";
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setString(1, user.getSenha());
			pstm.setString(2, user.getUsuario());
			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {
				if (rst.next()) {
					
					return true;
				}else {
					return false;
				}
				
			}
		}catch(SQLException e){
			throw new RuntimeException(e);			
		}
	}


}

