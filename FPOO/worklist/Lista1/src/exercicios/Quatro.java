//Sabendo-se que a velocidade de cruzeiro de um avi�o 747-300 � de 900 km/h, 
//fa�a um programa que leia uma dist�ncia (km), calcule e apresente na tela, 
//quanto tempo (horas) ser� necess�rio para um 747-300 sobrevoar a dist�ncia informada.

package exercicios;

import java.util.Scanner;

public class Quatro {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int kmh, km, horas;
		
		System.out.println("Digite a dist�ncia que o avi�o 747-300 ir� percorrer: ");
		km = entrada.nextInt();
		
		kmh = 900;
		horas = km / kmh;
		
		System.out.println("O tempo (horas) que o avi�o ir� percorrer � de "+ horas +" horas");


	}

}
