package app;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TesteDaoInsere {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		contato1.setNome(sc.nextLine());
		
	
		System.out.println("Digite seu email: ");
		contato1.setEmail(sc.nextLine());

		System.out.println("Digite seu endereco: ");
		contato1.setEndereco(sc.nextLine());
		
		
	
		ContatoDao dao;
		try {
			dao = new ContatoDao();
			dao.adiciona(contato1);
			System.out.println("Gravação feita com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
