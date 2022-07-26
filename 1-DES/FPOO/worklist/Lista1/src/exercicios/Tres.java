//Desenvolva um programa que leia um número ”n” inteiro, positivo e diferente de zero e apresen-te na tela:
//n – 1, e também n + 1.

package exercicios;

import java.util.Scanner;

public class Tres {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int n, result1, result2;
		int soma;
		
		System.out.println("Digite um valor inteiro, positivo e diferente de 0: ");
		n = entrada.nextInt();
		
		result1 = n - 1;
		result2 = n + 1;
		
		if(n<=0) {
			System.out.println("Numero invalido");
			System.out.println("Digite um número inteiro, positivo e diferente de 0.");
			
		}else {
			System.out.println("O resultado de " + n + " -1 é de " + result1 +".");
			System.out.println("O resultado de " + n + " +1 é de " + result2 +".");
		}
	}
}
