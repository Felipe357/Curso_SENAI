package exercicios;

import java.util.Scanner;

public class Dez {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		double area, quilos, custo;
		
		System.out.println("Digite a área que será revestida: ");
		area = entrada.nextDouble();
		
		custo = (area/3.7)*130;
		quilos = (area/3.7)*10;
		
		System.out.printf("São necessárias %.2f quilos de pedra\n",quilos); 
		System.out.printf("Você irá gastar %.2f reais",custo);
		

	}

}
