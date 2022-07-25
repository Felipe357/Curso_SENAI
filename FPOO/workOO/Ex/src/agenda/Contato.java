package agenda;

import java.util.Scanner;

public class Contato {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite quantos contatos deseja cadastrar?");
		int qntCont = scan.nextInt();
		
		for(int i = 0; i < qntCont; i++) {
			System.out.println("Digite o id do contato");
			int ide = scan.nextInt();
			System.out.println("digite o nome do contato");
			String no = scan.next();
			System.out.println("Digite o telefone do contato");
			String tel = scan.next();
		}
		
		System.out.println("");

		int menu = 0;
		while(menu != 5) {
			System.out.println("1.Mostrar Todos\n 2.Buscar por Id\n 3.Buscar por Nome\n 4.Buscar por Telefone\n 5.Sair");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Bye, bye.");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
	
	public static class Bem{
			
			public int id;
			public String nome;
			public String telefone;
			
			Bem() {}
			Bem(int ide, String no, String tel){
				id = ide;
				nome = no;
				telefone  = tel;
			}
	}
}
