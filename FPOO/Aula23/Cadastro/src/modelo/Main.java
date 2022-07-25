package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	private static Dados d = new Dados();
	public static void main(String[] args) {
	
		int menu = 0;
		
		do {
			
			System.out.println("1-Cadastrar usuaio\t2-Fazer login\t0-Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				cadastrar();
				break;
			case 2:
				validarNome();
				break;
			case 0:
				break;
			default:
				System.out.println("Chau Chau");
				break;
			}
			
		} while (menu !=0);
		
	}
	
	private static void cadastrar() {
		scan.nextLine();
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu nome de usuario:");
		String user = scan.next();
		
		System.out.println("Digite sua senha:");
		String senha = scan.next();
		
		String data = nome + ";" + user + ";" + senha;
		
		d.agrupar(data, "Login", true);
		
		
	}

	private static void validarNome() {
		
		System.out.println("Diite seu nome de usuario:");
		String userValidar = scan.next();
		
		System.out.println("Digite sua senha:");
		String senhaValidar = scan.next();
		
		ArrayList<String> infoFile = d.ler("Login");
		
		for (String validar : infoFile) {
			String[] temp = validar.split(";");
				
				if (temp[1].equals(userValidar) && temp[2].equals(senhaValidar)) {
					System.out.println("Parabéns você entrou");
				} else {
					System.out.println("Login ou senha invalido");
				}
			
		}
		
	}
	
}
