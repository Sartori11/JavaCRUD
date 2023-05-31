package app;

import java.util.Scanner;

public class TestaTudo {

	public static void main(String[] args) {
	int opcao = 1;
	while (opcao != 6) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma das opções:\n 1 - Inserir Contato\n 2 - Deletar Contato\n 3 - Selecionar Contato por ID\n 4 - Selecionar Contatos pela Primeira Letra\n 5 - Para Listar todos os contatos\n 6 - Finalizar ");
		opcao = (sc.nextInt());
		
		switch (opcao) {
		  case 1:
			  TesteDaoInsere.main(args);
			  break;
		  case 2:
			  TestaDaoDelete.main(args);
			  break;
		  case 3:
			  TestaDaogetContatoID.main(args);
			  break;
		  case 4:
			  TestaDaoListaLetra.main(args);
			  break;
		  case 5:
			  TestaDaoLista.main(args);
			  break;
			   
		  case 6:
			  System.out.println("FIM");
			  sc.close();
			  break;	  
}
		
	
}
	
	}
}