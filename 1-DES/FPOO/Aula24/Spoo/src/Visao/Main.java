package Visao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ProcessaPlanilha.carregar();
		int menu = 0;
		
		
			System.out.println("Digite uma op��o");
			System.out.println("1-Soma\t2-Multiplica��o\t3-Divis�o\t4-Subtra��o\t0-Sair");
			menu = scan.nextInt();
			
			ProcessaPlanilha.saida(menu);
	
	}

}
