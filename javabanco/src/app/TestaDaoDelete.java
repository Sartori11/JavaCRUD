package app;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;

public class TestaDaoDelete {

	public static void main(String[] args) {
		System.out.println("Digite o ID do Contato a ser deletado: ");
		Scanner sc = new Scanner(System.in);
		Long id = (sc.nextLong());
		
		
		
		ContatoDao dao;
		try {
			dao = new ContatoDao();
			dao.deleta(id);
			System.out.println("Delete feita com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
