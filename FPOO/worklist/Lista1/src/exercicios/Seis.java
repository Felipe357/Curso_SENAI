//Desenvolva um programa que leia o raio (cm) e a altura (cm) de um cilindro. 
//Calcule e mostre a área (cm2) e o volume (cm3) do cilindro

package exercicios;

import java.util.Scanner;

public class Seis {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada =  new Scanner(System.in);
		int raio, base, altura, area, volume;
		
		System.out.println("Digite o valor do raio em cm: ");
		raio = entrada.nextInt();
		System.out.println("Digite a altura em cm");
		altura = entrada.nextInt();
		
		
		
		base = 2 * raio;
		area = 2 * base + altura;
		volume = area * altura;
		
		System.out.printf("A área do cilindro é de "+ area +" cm\n");
		System.out.printf("O volume do cilindro é de "+ volume + " cm");


	}

}
