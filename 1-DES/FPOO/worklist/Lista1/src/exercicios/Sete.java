//Um laborat�rio de F�sica est� estudando barras de calc�rio para Constru��o Civil,
//e precisa saber a densidade de cada barra. Fa�a um programa para ajud�-los.
//(Dado: densidade = massa / volu-me)

package exercicios;

import java.util.Scanner;

public class Sete {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int densidade, massa, volume;
		
		System.out.println("Digite a massa da barra de calc�rio: ");
		massa = entrada.nextInt();
		System.out.println("Digite o volume da barra de calc�rio: ");
		volume = entrada.nextInt();
		
		densidade = massa / volume;
		
		System.out.println("A densidade da barra de calc�rio � de " + densidade);

	}

}
