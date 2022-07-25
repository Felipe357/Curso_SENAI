//Sabendo-se que a velocidade de cruzeiro de um avião 747-300 é de 900 km/h, 
//faça um programa que leia uma distância (km), calcule e apresente na tela, 
//quanto tempo (horas) será necessário para um 747-300 sobrevoar a distância informada.

package exercicios;

import java.util.Scanner;

public class Quatro {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int kmh, km, horas;
		
		System.out.println("Digite a distância que o avião 747-300 irá percorrer: ");
		km = entrada.nextInt();
		
		kmh = 900;
		horas = km / kmh;
		
		System.out.println("O tempo (horas) que o avião irá percorrer é de "+ horas +" horas");


	}

}
