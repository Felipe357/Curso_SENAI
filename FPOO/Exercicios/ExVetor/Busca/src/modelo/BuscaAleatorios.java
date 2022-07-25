package modelo;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
import java.io.IOException;

public class BuscaAleatorios {
	
	static Random rand = new Random();

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos números deseja: ");
		int n = scan.nextInt();
		int dados[] = numerosAleatorios(n);
		System.out.print("Digite um número que deseja buscar: ");
		int b =scan.nextInt();
		mostrarDados(dados);
		boolean resultado = buscaSimples(dados, b);
		System.out.println("A busca obteve sucesso? " + resultado);
		

	}

	private static boolean buscaSimples(int[] dados, int b) {
		for(int i = 0; i < dados.length; i++)
			if(dados[i] == b)
				return true;
		return false;
	}

	private static void mostrarDados(int[] dados) {
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
		
	}

	private static int[] numerosAleatorios(int n) {
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = rand.nextInt(1000);
		}
		
		return x;
	}

}
