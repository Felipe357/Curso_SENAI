//Desenvolva um programa que leia tr�s vari�veis (a, b, c) e resolva a express�o: ( a + b ) / c.

package exercicios;

import java.util.Scanner;

public class Um {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int a, b, c;
		double result;
		
		System.out.println("Digite um valor para a: ");
		a = entrada.nextInt();
		System.out.println("Digite um valor para b: ");
		b = entrada.nextInt();
		System.out.println("Digite um valor para c: ");
		c = entrada.nextInt();
		
		result = (double) ( a + b ) / c;
		
		System.out.printf("O resultado da expre��o � %.2f", result);

	}
}