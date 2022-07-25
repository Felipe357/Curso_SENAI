package modelo;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class EXVetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu <= 8) {
			System.out.println("1-Ex_1\t2-Ex_2\t3-Ex_3\t4-Ex_4\t5-Ex_5\t6-Ex_6\t7-Ex_7");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				
				int [] n = new int[10];
				
				for (int i = 0; i < n.length; i++) {
					System.out.println("Digite um valor inteiro: ");
					n[i] = scan.nextInt();
				}
				
				System.out.println("Sentido na ordem digitada");
				for (int i = 0; i < n.length; i++) {
					System.out.print(n[i] + " ");
				}
				
				System.out.println("Sentido em ordem inversa");
				 for(int i = n.length-1; i >= 0; i--){
			            System.out.print( n[i] + " ");
			        } 
				 
				 System.out.println("\n");
				
				break;
			case 2:
				
				int [] n1 = new int[10];
				int [] n2 = new int[10];
				
				for (int i = 0; i < n1.length; i++) {
					System.out.println("Digite um valor inteiro: ");
					n1[i] = scan.nextInt();
				}
				
				 for(int i = n1.length-1; i >= 0; i--){
			           n2[9-i] = n1[i];
			        }
				 
				 System.out.println("\nSentido normal");
				 for (int i = 0; i < n1.length; i++) {
						System.out.print(n1[i] + " ");
					}
				 
				 System.out.println("\nSentido em ordem inversa");
				 for(int i = n2.length-1; i >= 0; i--){
			            System.out.print( n2[i] + " ");
			        }
				System.out.println("\n");
				break;
			case 3:
				
				int [] nu1 = new int[10];
				double [] nu2 = new double[10];
				
				for (int i = 0; i < nu1.length; i++) {
					do{
						System.out.println("Digite um número inteiro e 'POSITIVO'");
						nu1[i] = scan.nextInt();
					
					if (nu1[i] <=0){
						System.out.println("Número negativo rapa");
						}
					}while(nu1[i] <=0);
				
				}	
				
				for (int i = 0; i < nu1.length; i++) {
					if(i % 2 == 0){
						nu2[i] = (double) nu1[i]/2;
					}else {
						nu2[i] = (double) nu1[i]*3;
					}
				}
				
				System.out.println("Elementos índice par: ");
				for (int i = 0; i < nu1.length; i++) {
					
					System.out.print(nu1[i] + " ");
				}
				
				System.out.println("\nElementos índice ímpar: ");
				for (int i = 0; i < nu2.length; i++) {
					System.out.print(nu2[i] + " ");
				}
				
				System.out.println("\n");
			
				break;
			case 4:
				
				String [] c = new String[10];
				
				for (int i = 0; i < c.length; i++) {
					System.out.println("Digite um nome");
					c[i] = scan.next();
				}
				
				System.out.println("Digite o nome a ser buscado: ");
				String nome = scan.next();
				
				boolean achou = false;
				
				for (int i = 0; i < c.length; i++) {
					if (c[i].equals(nome)) {
						System.out.println("Achei");
						achou = true;
					}
				}
				
				if (!achou) {
					System.out.println("Não achei");
				}
			
				System.out.println("\n");
				
				break;
			case 5:
				
				int [] vet1 = new int[20];
				int [] vet2 = new int[20];
				int [] vet3 = new int[20];
				int [] vet4 = new int[20];
				int [] vet5 = new int[20];
				
				for (int i = 0; i < vet1.length; i++) {
					System.out.println("Digite um valor: ");
					vet1[i] = scan.nextInt();
				}
				
					System.out.println("\nVetor 2: ");
				for (int i = 0; i < vet2.length; i++) {
					System.out.println("Digite um valor: ");
					vet2[i] = scan.nextInt();
				}
				System.out.println("\n");
				System.out.println("\nVetor 3 formado pela diferença dos dois vetores");
				for (int i = 0; i < vet3.length; i++) {
					vet3[i] = vet1[i] - vet2[i];
					System.out.print(vet3[i]+ " ");
				}
				System.out.println("\n");
				System.out.println("\nVetor 4 formado pela soma dos dois vetores");
				for (int i = 0; i < vet4.length; i++) {
					vet4[i] = vet1[i] + vet2[i];
					System.out.print(vet4[i]+ " ");
				}
				System.out.println("\n");
				System.out.println("\nVetor 5 formado pela multiplicação dos dois vetores");
				for (int i = 0; i < vet5.length; i++) {
					vet5[i] = vet1[i] * vet2[i];
					System.out.print(vet5[i]+ " ");
				}
				
				System.out.println("\n");
				
				break;
			case 6:
				
				int quantIMP = 0, quantPAR = 0;
				
				System.out.println("Digite quantos números deseja organizar: ");
				int qnt = scan.nextInt();
				
				int listaNumeros [] = new int[qnt];
				
				for (int i = 0; i < listaNumeros.length; i++) {
					System.out.println("Digite os números: ");
					listaNumeros[i] = scan.nextInt();
					
					if (listaNumeros[i] % 2 == 0) {
						quantPAR++;
					} else {
						quantIMP++;
					}
				}
				
				int[] imp = new int[quantIMP]; 
				int[] par = new int[quantPAR];
				
				for (int i = 0; i < par.length; i++) {
					par[i] = 1;
				}
				
				for (int i = 0; i < imp.length; i++) {
					imp[i] = 0;
				}
				
				for (int i = 0; i < listaNumeros.length; i++) {
					if (listaNumeros[i] % 2 ==0) {
						for (int j = 0; j < par.length; j++) {
							if (par[j] == 1) {
								par[j] = listaNumeros[i];
								break;
							}
						}
					}else {
						for (int j = 0; j < imp.length; j++) {
							if (imp[j] == 0) {
								imp[j] = listaNumeros[i];
								break;
							}
						}
					}
				}
				
				Arrays.sort(par);
				Arrays.sort(imp);
				
				System.out.println("Pares");
				
				for (int i = 0; i < par.length; i++) {
					System.out.print(par[i] + " ");
				}
				
				System.out.println("\nImpares");
				
				for (int i = imp.length - 1; i >= 0; i--) {
					System.out.print(imp[i] + " ");
				}
				
				
				System.out.println(" ");
				
				break;
			case 7:
				
				int pont = 0;
				
				System.out.println("Digite quantos números deseja comparar: ");
				int quant = scan.nextInt();
				
				int[] N = new int[quant];
				int[] X = new int[quant];
				
				
				for (int j = 0; j < quant/2; j++) {
					System.out.println("Digite os números: ");
					X[j] = scan.nextInt();
				}

				for (int k = 0; k < quant/2; k++) {
					System.out.println("Digite os números a serem comparados");
					N[k] = scan.nextInt();
				}

				boolean ig = false;
				
				for (int i = 0; i < quant; i++) {
					if (X[i] == N[i]) {
						ig = true;
					}else {
						ig = false;
						break;
					}
				}
				
				if (ig) {
					System.out.println("Os vetores são iguais ");
				} else {
					System.out.println("Os vetore são diferentes ");
				}
				
				System.out.println();
				
				break;
			case 8:
				System.out.println("Ate uma próxima");
				break;
			default:
				System.out.println("Digite outro número rapa");
				break;
			}
		}
		
	}

}

