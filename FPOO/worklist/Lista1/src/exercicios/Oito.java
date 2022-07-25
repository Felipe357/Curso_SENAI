//Faça um programa que leia dois valores, divida o primeiro valor digitado pelo segundo valor digitado 
//e informe para o usuário qual será o valor de resto dessa divisão.

package exercicios;

import java.util.Scanner;

public class Oito {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada =  new Scanner(System.in);
		float dividendo, divisor, resto, quociente;
		
		System.out.println("Digite o valor do dividendo: ");
		dividendo = entrada.nextFloat();
		System.out.println("Digite o valor do divisor: ");
		divisor = entrada.nextFloat();
		
		quociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.println("O valor do quociente da divisão é "+ quociente + "\n");
		System.out.println("O valor do resto da divisão é "+ resto);
		
	}

}
