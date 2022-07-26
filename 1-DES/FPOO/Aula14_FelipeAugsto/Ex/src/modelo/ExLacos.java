package modelo;

import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;

public class ExLacos {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		while (n <= 7) {
			
			System.out.println("1-Números Pares\t\t2-Números Ímpares\t3-Maior Menor\t4-Fatorial\t5-Xerox\t\t6-Soma Par e Impar\t7-Sair");
			n = scan.nextInt();
			
			switch(n) {
				
			case 1:
				
				System.out.println("Digite um valor de início:");
				double v1 = scan.nextInt();
				
				System.out.println("Digite outro valor maior que o anterior:");
				int v2 = scan.nextInt();
				
				System.out.println("");
				
				for(int i=(int) Math.round(v1/2) * 2; i<v2; i+=2){   
			        System.out.println(+ i);     
			      } 
				
				break;
			case 2:
				
				System.out.println("Digite um valor de início:");
				int i1 = scan.nextInt();
				
				System.out.println("Digite outro valor maior que o anterior:");
				int i2 = scan.nextInt();
				
				
				if(i1 % 2 ==0) {
					i1++;
				}
				
				for(int i = i1; i < i2; i+=2) {
					System.out.println(i);
				}
				
				break;
			case 3:
				
				int maior = 0, menor = 999999999;
				
				int [] valor = new int[10];
				
				for(int i = 0; i < 10; i++) {
					System.out.println("Digite um valor:");
					valor[i] = scan.nextInt();
				}
				
				for(int i = 0; i < 10; i++) {
					if(valor[i] > maior)
						maior = valor[i];
				
					if(valor[i] < menor)
						menor = valor[i];
				}
				
				System.out.println("Maior número digitado é: "+maior);
				System.out.println("Maior número digitado é: "+menor);
				System.out.println("");
				
				break;
			case 4:
				
				System.out.println("Digite o número que deseja fatorar");
				double x = scan.nextInt();
						
				double f = x;
				
				while (x > 1){ 
		             f = f *(x-1);
		             x--;
		             System.out.println(f);
		            }
				 
				 System.out.println("");
				 
				break;
			case 5:
				
				System.out.println("Digite o valor do xerox: ");
				double vl = scan.nextDouble();
				
				
				int cont = 1;
				
				for (int i = 0; i < 20; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.printf("%d: %.2f |-| ",cont ,vl*cont);
						cont++;
					}
					System.out.println();
				}
				
				break;
			case 6:
				
				int qtdeImp = 0;
				int qtdePar = 0;
				
				System.out.println("Digite um valor: ");
				int num = scan.nextInt();
				
				System.out.println("Digite um valor maior que o anterior: ");
				int num2 = scan.nextInt();
				
				for (int j = num; j <= num2; j++) {
					
					if(j % 2 != 0) {
						
						qtdeImp += j;
						
					}
				}
				System.out.println("");
				System.out.println("A soma dos valores ímpares é " + qtdeImp);
				System.out.println("");
				
				for (int j = num; j <= num2; j++) {
					
					if(j % 2 == 0) {
						
						qtdePar += j;
						
					}
				}
				
				System.out.println("");
				System.out.println("A soma dos valores pares é " + qtdePar);
				System.out.println("");
				
				break;
			case 7:
				System.out.println("Até uma próxima");
				break;
			default:
				System.out.println("Digite outro número");
			}
		}
	}

}
