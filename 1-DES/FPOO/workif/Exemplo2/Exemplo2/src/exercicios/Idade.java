package exercicios;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		System.out.print("Digite sua idade :");
		idade = ler.nextInt();
				
		if(idade>=18) {
			System.out.print("Você é mair de idade.");
		}else {System.out.print("Você é menor de idade. ");
		
		}
	}
}