package main;

import factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) {
		System.out.println(new ConnectionFactory().recuperaConexao());
	}

}
