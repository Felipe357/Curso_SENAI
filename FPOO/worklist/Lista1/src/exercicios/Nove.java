//Faça um programa que leia dois valores inteiros, some os valores lidos e apresente o resultado na tela.

package exercicios;

import java.util.Scanner;

public class Nove {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int val1, val2, soma;
		
		System.out.println("Digite um valor: ");
		val1 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		val2 = entrada.nextInt();
		
		soma = val1 + val2;
		
		System.out.println("A soma dos dois valores é: "+soma);

	}

}
