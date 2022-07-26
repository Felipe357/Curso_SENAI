package visao;

import java.util.Scanner;

import controle.Processa;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite seu login");
		String email = scan.next();
		
		System.out.println("Digite sua senha");
		String senha = scan.next();
		
		Processa.carregar();
		Processa.saida(email, senha);
	}

}