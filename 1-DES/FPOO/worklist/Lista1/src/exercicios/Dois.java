//Desenvolva um programa que leia a velocidade de um carro (km/h) e a dist�ncia(Km) a ser per-corrida (km) por ele. 
//Calcule e apresente na tela, quanto tempo (horas) ser� necess�rio para o carro percorrer a dist�n-cia informada.

package exercicios;

import java.util.Scanner;

public class Dois {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int kmh, km, horas;
		
		System.out.println("Digite a velocidade de um carro: ");
		kmh = entrada.nextInt();
		System.out.println("Digite a dist�ncia percorrida: ");
		km = entrada.nextInt();
		
		horas = km / kmh;
		
		System.out.println("O tempo em horas a ser percorrido � de "+ horas + " horas");

	}

}
