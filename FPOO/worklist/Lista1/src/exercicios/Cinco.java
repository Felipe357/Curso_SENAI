//Um caminh�o consegue transportar 18 toneladas de laranjas em uma viagem que faz entre a fazen-da
// e a f�brica de suco de laranja.
//Um alqueire de terra produz em m�dia 250 toneladas de laranjas. 
//Fa�a um programa que leia quantos caminh�es e quantos alqueires uma fazenda produtora de laranjas possui,calcule e apresente na tela 
//quantas viagens de caminh�o ser�o necess�rias para transportar toda a colheita de laranjas.

package exercicios;

import java.util.Scanner;

public class Cinco {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		float cami, qcami, qcamir, alque, qalque, qalquer, viagens;
		
		System.out.println("Digite quantos caminh�es voc� possui: ");
		qcami = entrada.nextInt();
		System.out.println("Digite quantos alqueries voc� possui: ");
		qalque = entrada.nextInt();
		
		cami = 18;
		alque = 250;
		qcamir = cami * qcami;
		qalquer = alque * qalque;
		viagens = qalquer / qcamir;
		
		System.out.printf("Voc� tera que fazer %.0f viagens.", viagens);
	}

}
