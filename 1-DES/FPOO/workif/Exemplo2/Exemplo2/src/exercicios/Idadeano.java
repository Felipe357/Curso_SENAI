package exercicios;

import java.util.Scanner;

public class Idadeano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int ano;
		System.out.print("Digite seu ano de nascimento: ");
		ano = ler.nextInt();
		
		if(ano<=2003) {
			System.out.print("Você é maior de idade");
		}else {
			System.out.print("Você é menor de idade");
		}
		


	}

}
