package exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Exp1 {

	public static Scanner entrada;
	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Digite 1 para sair");
			opcao = entrada.nextInt();
		} while ( opcao != 1);
		System.out.println("Adeus");


	}

}
