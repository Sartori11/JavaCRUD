package app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaDaogetContatoID {
	
	public static void main(String[] args) {
		try {
			ContatoDao cdao = new ContatoDao();
			System.out.println("Digite o ID do Contato: ");
			Scanner sc = new Scanner(System.in);
			Long id = (sc.nextLong());
			List<Contato> contatos  = cdao.getContatoId(id);
			
			for (Contato contato: contatos) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Endereco: " + contato.getEndereco());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
