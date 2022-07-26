//Um laboratório de Física está estudando barras de calcário para Construção Civil,
//e precisa saber a densidade de cada barra. Faça um programa para ajudá-los.
//(Dado: densidade = massa / volu-me)

package exercicios;

import java.util.Scanner;

public class Sete {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int densidade, massa, volume;
		
		System.out.println("Digite a massa da barra de calcário: ");
		massa = entrada.nextInt();
		System.out.println("Digite o volume da barra de calcário: ");
		volume = entrada.nextInt();
		
		densidade = massa / volume;
		
		System.out.println("A densidade da barra de calcário é de " + densidade);

	}

}
