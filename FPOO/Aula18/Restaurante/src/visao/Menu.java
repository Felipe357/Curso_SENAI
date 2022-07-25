package visao;

import java.util.Scanner;

import modelo.Prato;


public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Prato[] prato = new Prato[10];
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		while (menu !=3) {
			System.out.println("1-Cadastrar Aparelho\n2-Listar Aparelho\n3-Sair");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				
				cadastrarPrato();
				
				break;
				
			case 2:
				
				listarPratos();
				
				break;
				
			case 3:
				
				System.out.println("Tchau");
				
				break;

			default:
				break;
			}
		}

	}
	
	private static void cadastrarPrato() {
		if (prato[9] == null) {
			for (int i = 0; i < prato.length; i++) {
				if (prato[i] == null) {
					int codPrato = i+1;
					
					System.out.println("Digite o tipo do Prato");
					String tipo = scan.next();
					
					System.out.println("Digite o nome do Prato");
					String nome = scan.next();
					
					System.out.println("Digite a descrição do Prato");
					String descricao = scan.next();
					
					System.out.println("Digite o preço do Prato");
					float preco = scan.nextFloat();
					
					prato[i] = new Prato(codPrato, tipo, nome, descricao, preco);
					
					System.out.println("\n\nPrato Cadastrado com SUCESSO!");
					break;
				}
			}
		} else {
			System.out.println("Limite Excedido");
		}
	}
	
	private static void listarPratos() {
		if (prato[0] != null) {
			System.out.println("COD\tTIPO\tNOME\tDESC\tPREÇO");
			for (int i = 0; i < prato.length; i++) {
			
				if (prato[i] != null) {
					System.out.println(prato[i].paraString());
				}
			}
		} else {
			System.out.println("Nenhum prato cadastrado\n\n");
		}
	}

}


