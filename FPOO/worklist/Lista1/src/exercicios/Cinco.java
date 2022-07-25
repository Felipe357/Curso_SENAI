//Um caminhão consegue transportar 18 toneladas de laranjas em uma viagem que faz entre a fazen-da
// e a fábrica de suco de laranja.
//Um alqueire de terra produz em média 250 toneladas de laranjas. 
//Faça um programa que leia quantos caminhões e quantos alqueires uma fazenda produtora de laranjas possui,calcule e apresente na tela 
//quantas viagens de caminhão serão necessárias para transportar toda a colheita de laranjas.

package exercicios;

import java.util.Scanner;

public class Cinco {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		float cami, qcami, qcamir, alque, qalque, qalquer, viagens;
		
		System.out.println("Digite quantos caminhões você possui: ");
		qcami = entrada.nextInt();
		System.out.println("Digite quantos alqueries você possui: ");
		qalque = entrada.nextInt();
		
		cami = 18;
		alque = 250;
		qcamir = cami * qcami;
		qalquer = alque * qalque;
		viagens = qalquer / qcamir;
		
		System.out.printf("Você tera que fazer %.0f viagens.", viagens);
	}

}
