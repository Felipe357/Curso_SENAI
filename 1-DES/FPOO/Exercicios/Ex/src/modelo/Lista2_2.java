package modelo;

import java.io.IOException;
import java.util.Scanner;

public class Lista2_2 {

	public static void main(String[] args) throws IOException {
		
		int[] idades = new int[5];
		
		idades = leVetor();
		
		mostra(idades);
		
		System.out.println("Maior idade: " + maiorIdade(idades));
	}
	
	public static Scanner entrada;
	
	public static int[] leVetor() {
		entrada = new Scanner(System.in);
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite uma idade:");
			idades[i] = entrada.nextInt();
		}
		
		return idades;
	}
	
	public static void mostra(int[] idades) {
		System.out.println("Índice\tIdade");
		for (int i = 0; i < idades.length; i++) {
			System.out.println(i + "\t" + idades[i]);
		}
	}
	
	public static int maiorIdade(int[] idades) {
		int maior = 0;
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
			}
		}
		
		return maior;
	}
}