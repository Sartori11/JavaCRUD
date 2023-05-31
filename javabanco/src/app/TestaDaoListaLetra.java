package app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaDaoListaLetra {

	public static void main(String[] args) {
		try {
			ContatoDao cdao = new ContatoDao();
			System.out.println("Contatos que começam com qual letra: ");
			Scanner sc = new Scanner(System.in);
			String letra = (sc.nextLine());
			
			List<Contato> contatos  = cdao.getListaLetra(letra);
			
			for (Contato contato: contatos) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Endereco: " + contato.getEndereco());
				System.out.println("----------------------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	}


