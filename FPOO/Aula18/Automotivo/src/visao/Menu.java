package visao;

import modelo.Veiculo;
import java.util.Scanner;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Veiculo[] veiculos = new Veiculo[10];
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		while (menu != 3) {
			System.out.println("1-Cadastrar Veiculos\n2-Listar Veiculos\n3-Sair");
			menu = scan.nextInt();
		
			switch (menu) {
			case 1:
				
				cadastrarVeiculo();
				
				break;
				
			case 2:
				
				listarVeiculo();
				
				break;
				
			case 3:
				System.out.println("Tchau");
				break;
			default:
				break;
			}
		}

	}
	
	private static void cadastrarVeiculo() {
		
		int qnt;
		do {
			System.out.println("Quantos veiculos deseja cadastrar: (max:10)");
			qnt = scan.nextInt();
			
			if (qnt > 10) {
				System.out.println("Tá torto aí");
			} else {
				
				System.out.println("Digite: Placa - Marca - Modelo - Ano do Modelo - Ano de Fabricação - Cor");
				
				for (int i = 0; i < qnt; i++) {
					for (int j = 0; j < veiculos.length; j++) {
						if (veiculos[j] == null) {
							veiculos[j] = new Veiculo();
							veiculos[j].placa = scan.next();
							veiculos[j].marca = scan.next();
							veiculos[j].modelo = scan.next();
							veiculos[j].anoModelo = scan.nextInt();
							veiculos[j].anoFabricacao = scan.nextInt();
							veiculos[j].cor = scan.next();
							break;
						}
					}
				}
			}
			
		} while (qnt > 10);
	}
	
	private static void listarVeiculo() {
		
		System.out.println("Placa - Marca - Modelo - Ano do Modelo - Ano de Fabricação - Cor");
		for (int i = 0; i < veiculos.length; i++) {
			if (veiculos[i] != null) {
				System.out.print(veiculos[i].paraString());
			}
			
		}
		
	}

}
