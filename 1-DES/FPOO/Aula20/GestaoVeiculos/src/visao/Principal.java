package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Moto;

public class Principal {

	private static ArrayList<Carro> carro = new ArrayList<Carro>();
	private static ArrayList<Moto> moto = new ArrayList<Moto>();

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		while(menu!=5) {
			System.out.println("1-Cadastrar Moto\t2-Cadastrar Carro\n3-Listar Moto\t4-Listar Carro\n5-Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				
				cadastrarMoto();
				
				break;
			case 2:
				
				cadastrarCarro();
				
				break;
			case 3:
				
				listarMoto();
				
				break;
			case 4:
				
				listarCarro();
				
				break;
			
			case 5:
				System.out.println("Até uma próxima");
				break;
			default:
				System.out.println("Digite uma das opções rapa");
				break;
			
			}
		}
	}
	
	private static void cadastrarCarro() {
		
		System.out.println("----------Cadastro de Carros----------");
		
		System.out.println("Digite a placa");
		String placa = scan.next();
		
		System.out.println("Digite o Ano do modelo");
		int anoModel = scan.nextInt();
		
		System.out.println("Digite o Ano de fabricação");
		int anoFabri = scan.nextInt();
		
		System.out.println("Digite o modelo");
		String modelo = scan.next();
		
		System.out.println("Digite a marca");
		String marca = scan.next();
		
		System.out.println("Digite o tipo");
		String tipo = scan.next();
		
		System.out.println("Digite a quantidade de passageiros que consegue levar");
		int pass = scan.nextInt();
		
		System.out.println("Digite o valor");
		double valor = scan.nextDouble();
		
		carro.add(new Carro(tipo, pass, placa, anoModel, anoFabri, modelo, marca, valor));
		
	}
	
	private static void cadastrarMoto() {
		
		System.out.println("Digite a placa");
		String placa = scan.next();
		
		System.out.println("Digite o Ano do modelo");
		int anoModel = scan.nextInt();
		
		System.out.println("Digite o Ano de fabricação");
		int anoFabri = scan.nextInt();
		
		System.out.println("Digite o modelo");
		String modelo = scan.next();
		
		System.out.println("Digite a marca");
		String marca = scan.next();
		
		System.out.println("Digite a cilindradas");
		int cili = scan.nextInt();
		
		System.out.println("Digite o valor");
		double valor = scan.nextDouble();
		
		moto.add(new Moto(cili, placa, anoModel, anoFabri, modelo, marca, valor));
		
	}
	
	private static void listarMoto() {
		
		if (moto.size() < 1) {
			System.out.println("Nenhuma moto");
		} else {
			for (Moto mo : moto) {
				System.out.println(mo.toString());
			}
		}
		
	}
	
	private static void listarCarro() {
		
		if (carro.size() < 1) {
			System.out.println("Nenhum carro");
		} else {
			for (Carro car : carro) {
				System.out.println(car.toString());
			}
		}
		
	}

}
