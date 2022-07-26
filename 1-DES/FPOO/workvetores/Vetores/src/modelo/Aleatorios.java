package modelo;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Aleatorios {

	public static Scanner scan;
	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu != 4) {
			System.out.println("1- Numeros Inteiros\n2- Numeros Reias\n3- Nomes\n4- Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				GerarIntiero();
				break;
			case 2:
				GerarReal();
				break;
			case 3:
				GerarNome();
				break;
			case 4:
				System.out.print("Obrigado");
				break;
			default:
				System.out.print("Opção invalida\n");
				break;
			}
		}
	}
	
	public static void GerarIntiero() {
		scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("Digite quantos numeros deseja gerar ");
		int qntd = scan.nextInt();
		
		int [] numeros = new int[qntd];
		
		for(int i = 0; i < qntd; i++) {
			numeros[i] = rand.nextInt(100);
			System.out.println(numeros[i]);
		}
	}
	public static void GerarReal() {
		scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("Digite quantos numeros deseja gerar ");
		int qntd = scan.nextInt();
		
		double [] numeros = new double[qntd];
		
		for(int i = 0; i < qntd; i++) {
			numeros[i] = rand.nextDouble() * 100;
			System.out.printf("%.2f\n", numeros[i]);
		}
	}
	public static void GerarNome() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos nomes você desaja inserir");
		int qntd = scan.nextInt();
		
		String[] nomes = {"João" , "Maria" , "Roberto" , "Joaquina" , "Guilherme" , "Bruno" , "Bruna" , "Ana" , "Felipe" , "Fabiana"};
		for(int i = 0; i < qntd; i++) {
			int al = rand.nextInt(nomes.length);
			
			System.out.println(nomes[al]);
		}
	}
}
