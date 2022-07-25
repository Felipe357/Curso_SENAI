package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Visao {
	
	private static Scanner scan = new Scanner(System.in);
	private static Arquivos entrada = new Arquivos();
	private static Arquivos saida = new Arquivos();

	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1-Soma\t2-Multiplicação\t3-Divisão\t4-Subtração\t0-Sair");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				soma();
				break;
			case 2:
				mult();
				break;
			case 3:
				div();
				break;
			case 4:
				sub();
				break;
			case 0:
				System.out.println("HDSkhD");
				break;
			default:
				System.out.println("DJhkdf");
				break;
			}
			
		} while (menu !=0);

	}
	
	private static void soma() {
		
		ArrayList<String> infoFile = entrada.ler("Entrada");
		
		String saida = "";
		
		for (String l : infoFile) {
			String[] temp = l.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])) + "\r\n";
		}
		
		entrada.agrupar(saida, "Saida", false);
		
		System.out.println("djklf");
		
	}
	
	private static void mult() {
		
		ArrayList<String> infoFile = entrada.ler("Entrada");
		
		String saida = "";
		
		for (String li : infoFile) {
			String[] temp = li.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) * Integer.parseInt(temp[1])) + "\r\n";
		}
		
		entrada.agrupar(saida, "Saida", false);
		
		System.out.println("djklf");
		
	}
	
	private static void div() {
		
		ArrayList<String> infoFile = entrada.ler("Entrada");
		
		String saida = "";
		
		for (String li : infoFile) {
			String[] temp = li.split(";");
			
			saida = saida + (Double.parseDouble(temp[0]) / Double.parseDouble(temp[1])) + "\r\n";
		}
		
		entrada.agrupar(saida, "Saida", false);
		
		System.out.println("djklf");
		
	}
	
	private static void sub() {
		
ArrayList<String> infoFile = entrada.ler("Entrada");
		
		String saida = "";
		
		for (String li : infoFile) {
			String[] temp = li.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) - Integer.parseInt(temp[1])) + "\r\n";
		}
		
		entrada.agrupar(saida, "Saida", false);
		
		System.out.println("djklf");
		
	}

}
