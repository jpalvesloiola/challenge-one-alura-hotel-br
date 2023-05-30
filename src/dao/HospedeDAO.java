package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Hospede;

public class HospedeDAO {
	private Connection connection;

	public HospedeDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Hospede hospede) {
		String sql = " INSERT INTO `hotel`.`hospedes` (`hospedes`.`nome`, `hospedes`.`sobrenome`, `hospedes`.`data_nascimento`, `hospedes`.`nacionalidade`, `hospedes`.`telefone`, `hospedes`.`id_reserva`) VALUES ( ?, ?, ?, ?, ?, ?);";
		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, hospede.getNome());
			pstm.setString(2, hospede.getSobrenome());
			pstm.setDate(3, hospede.getDataNascimento());
			pstm.setString(4, hospede.getNacionalidade());
			pstm.setString(5, hospede.getTelefone());
			pstm.setInt(6, hospede.getReservaId());

			System.out.println(pstm.executeUpdate());

			try (ResultSet rs = pstm.getGeneratedKeys()) {
				System.out.println(rs);
				if (rs.next()) {
					hospede.setId(rs.getInt(1));
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Hospede> listar() {
		List<Hospede> hospedes = new ArrayList<>();
		String sql = "SELECT `hospedes`.`id`, `hospedes`.`nome`, `hospedes`.`sobrenome`, `hospedes`.`data_nascimento`, `hospedes`.`nacionalidade`, `hospedes`.`telefone`, `hospedes`.`id_reserva` FROM `hotel`.`hospedes`; ";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ResultSet rs = pstm.executeQuery()) {
			while (rs.next()) {
				hospedes.add(new Hospede(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return hospedes;
	}
}
