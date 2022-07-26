package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class Exercicio_1 {

	public static void main(String[] args)throws IOException {
		Random rand = new Random();
		
		int maiorIm = 0, menorIm = 99, maiorPar = 0, menorPar = 100, qtdeImp = 0, qtdePar = 0;
		
		
		int[][] t = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				t[i][j] = rand.nextInt(100);
			}
		}
		
	for (int i = 0; i < 5; i++) {
				
				for (int j = 0; j < 5; j++) {
					
					if(t[i][j] % 2 != 0) {
						
						qtdeImp++;
						
						
						System.out.println(t[i][j]);
						
						if(t[i][j] > maiorIm)
							maiorIm = t[i][j];
					
						if(t[i][j] < menorIm)
							menorIm = t[i][j];
					}
			}
				
		}
	
	
	
		System.out.println("");
		System.out.println("Aqui mostra o menor '" + menorIm + "' e o maior '" + maiorIm + "' valor impar.");
		System.out.println("Quantidades de números gerados = "+qtdeImp + "\n");
		
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if(t[i][j] % 2 == 0) {
					
					qtdePar++;
					
					
					System.out.println(t[i][j]);
					
					if(t[i][j] > maiorPar)
						maiorPar = t[i][j];
				
					if(t[i][j] < menorPar)
						menorPar = t[i][j];
				}
		}
			
        
	}

	System.out.println("");
	System.out.println("Aqui mostra o menor '" + menorPar + "' e o maior '" + maiorPar + "' valor impar.");
	System.out.println("Quantidades de números gerados = "+qtdePar);
		
	}
		
}





