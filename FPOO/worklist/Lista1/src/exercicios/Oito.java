//Fa�a um programa que leia dois valores, divida o primeiro valor digitado pelo segundo valor digitado 
//e informe para o usu�rio qual ser� o valor de resto dessa divis�o.

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
		
		System.out.println("O valor do quociente da divis�o � "+ quociente + "\n");
		System.out.println("O valor do resto da divis�o � "+ resto);
		
	}

}
