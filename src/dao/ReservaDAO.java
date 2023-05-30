package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Reserva;

public class ReservaDAO {
	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Reserva reserva) {
		String sql = " INSERT INTO `hotel`.`reservas` (`data_entrada`, `data_saida`, `valor`, `forma_pagamento`) VALUES ( ?, ?, ?, ?);";
		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setDate(1, reserva.getDataEntrada());
			pstm.setDate(2, reserva.getDataSaida());
			pstm.setString(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaPagamento());

			System.out.println(pstm.executeUpdate());

			try (ResultSet rs = pstm.getGeneratedKeys()) {
				System.out.println(rs);
				if (rs.next()) {
					reserva.setId(rs.getInt(1));
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Reserva> listar() {
		List<Reserva> reservas = new ArrayList<>();
		String sql = "SELECT id, data_entrada, data_saida, valor, forma_pagamento  FROM reservas;";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ResultSet rs = pstm.executeQuery()) {
			while (rs.next()) {
				reservas.add(new Reserva(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5)));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return reservas;
	}
}
