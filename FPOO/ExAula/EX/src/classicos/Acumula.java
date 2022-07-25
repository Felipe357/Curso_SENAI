package classicos;

import java.util.Scanner;
import java.util.Random;
import javax. swing. JOptionPane;

public class Acumula {

	public static void main(String[] args) {
		System.out.println("o algoritimo de acumulação");
		System.out.print("simples, retornou = " );
		System.out.println(simples(10));
		
		System.out.print("Alteatórios, retornou = ");
		System.out.println(aleatorio(18));
		
		System.out.print("Fatorial de 3 é, retornou = ");
		System.out.println(fatorial(3));
		
		System.out.println("Empretimo é e = "+ emprestimo());


	}
	
	public static int simples(int iteracoes) {
		int x = 0;
		for(int i = 0; i < 10; i++) 
			x++;
		
		return x;
	}
	
	public static int aleatorio(int iteracoes) {
		Random rand = new Random();
		int x = 0;
		for(int i = 0; i < iteracoes; i++) {
			int r = rand.nextInt(100);
			System.out.println("Aleatório = " + r);
			x+=r;
			System.out.println("acumulado = " + x);
		
		}
		
		return x;
		
	}
		
	public static int fatorial(int num) {
		int fat = 1;
		int valor = 3;
		

		for( int i = 2; i <= valor; i++ ) {
		
		fat *= i;
		}

		
		return fat;
	}
	
	public static double emprestimo() {
		Scanner scan = new Scanner(System.in);
		
        
	}
	

}
