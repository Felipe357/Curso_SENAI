package modelo;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Matrizes {
	
	public static Scanner scan;
	public static void main(String[] args)throws IOException {
	scan = new Scanner(System.in);
	
		int menu = 0;
		
		while(menu != 4) {
		
			System.out.println("Digite um modelo");
			System.out.println("1-vetor\n2-Matrizes(2x2)\n3-Matrizes(3x3)");
			menu = scan.nextInt();
		
		switch (menu) {
			
			case 1:
				gerarnum();
				break;
			case 2:
				matriz2();
				break;
			case 3:
				matriz3();
				break;
			default:
				System.out.println("Opção invalida.");
				break;
			}
		}
	}
	public static void gerarnum() {
		
		Random rand = new Random();
		
		int[] numeros = new int[27];
		
		for (int i = 0; i < 27; i++) {
			numeros[i] = rand.nextInt(100);
			System.out.println(numeros[i]);
		}
		
	}
	public static void matriz2() throws IOException {
		
		Random rand = new Random();
		
		int numeros[][] = new int[3][9];
		
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 9; i++) {
				numeros[i][x] = rand.nextInt(100);
				System.out.println(numeros[i][x]);
				
				}
			}
		}
	public static void matriz3() {
		
		Random rand = new Random();
		
		int[][][] numeros = new int[3][3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int x = 0; i < 3; i++) {
				for (int y = 0; i < 3; i++) {
					numeros[i][x][y] = rand.nextInt(1000);
					System.out.println(numeros[i][x][y]);
										
				}
			}
		}
	}
}


