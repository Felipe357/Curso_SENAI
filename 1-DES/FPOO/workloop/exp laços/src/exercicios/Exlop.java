package exercicios;

import java.util.Scanner;

public class Exlop {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 11);
		
			System.out.println("Digite uma opção");
			System.out.println("1-Programa1\t5-Programa5\t9-Programa9");
			System.out.println("2-Programa2\t6-Programa6\t10-Programa10");
			System.out.println("3-Programa3\t7-Programa7\t11-Programa11");
			System.out.println("4-Programa4\t8-Programa");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				/*
				 * 1-Faça um programa que imprima na tela os valores no 
				 * intervalo entre 10 e 20
				 */
				for(int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				/*
				 * Faça um programa que imprima na tela os valores no intervalo
				 * entre 200 e 1
				 */
				for(int i = 200; i >= 1; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				/*
				 * Faça um programa onde o usuário digite um valor, e imprima na tela
				 * todos os valores entre 0 e o valor digitado
				 */
				System.out.println("Digite um valor inteiro");
				int valor = leia.nextInt();
				for (int i = 0; i < valor; i++) {
					
				}
				break;
			case 4:
				/*
				 * Faça um progrma onde o usuário digite dois valores, e
				 * imprima na tela todos os valores no intervalo entre os 
				 * valores digitados
				 */
				System.out.println("Digite um valor inteiro");
				int case4val = leia.nextInt();
				System.out.println("Digite outro valor interio, maior que o anterior");
				int case4val2 = leia.nextInt();
				for (int i = case4val; i < case4val2; i++) {
					System.out.println(i);
				}
				break;
			case 5:
				/*
				 * Faça um programa que imprima na tela todos os números pares
				 * de um intervalo imformado pelo usuário
				 */
				System.out.println("Digite um valor inteiro como início");
				int case5val = leia.nextInt();
				System.out.println("Digite um valor inteiro como final");
				int case5val2 = leia.nextInt();
				for (int i = case5val; i < case5val2; i+=2) {
					System.out.println(i);
				}
				break;
			case 6:
				/*
				 * Faça um programa que imprima na tela a soma dos dois valores entre
				 * 0 e 100
				 */
				int soma2;
				for(int i = 1; 1 <= 100; i++) {
				soma2 += i;
				
				System.out.println("A soma dos valores entre 0 e 100 é  "+ soma2);
				}
				break;
			case 7:
				/*
				 * Faça um progrma que imprima na tela a soma dos valores de um 
				 * intervalo definido pelo usuário
				 */
				int val1, val2;
				
				System.out.println("Digite um número ");
				val1 = leia.nextInt();
				System.out.println("Digite outro numero maior que o anterior ");
				val2 = leia.nextInt();
				int soma;
				for(int i = val1; i <= val2; i++) {
				soma +=  i;
				}
				System.out.println("A soma dos valores entre é" + soma);
				
				break;
			case 8:
				/*
				 * Faça um programa que imprima n atela a soma dos valores pares de um intervalo
				 * difinido pelo usuário
				 */
				System.out.println("Informe o iniio do intervalo");
				int ini = leia.nextInt();
				System.out.println("Informe o final do intervalo");
				int fim = leia.nextInt();
				
				int i = ini;
				int soma1 = ini;
				while(i < fim) {
					i++;
					soma1 += i;
				}
				System.out.println(+soma1);
				break;
			case 9:
				/*
				 * Faça um programa onde o usuário digita 15 valores e imprima a
				 * soma destes valores na tela
				 */
				System.out.println("Digite outro número");
				int case1 = leia.nextInt();
				System.out.println("Digite outro número");
				int case2 = leia.nextInt();
				System.out.println("Digite outro número");
				int case3 = leia.nextInt();
				System.out.println("Digite outro número");
				int case4 = leia.nextInt();
				System.out.println("Digite outro número");
				int case5 = leia.nextInt();
				System.out.println("Digite outro número");
				int case6 = leia.nextInt();
				System.out.println("Digite outro número");
				int case7 = leia.nextInt();
				System.out.println("Digite outro número");
				int case8 = leia.nextInt();
				System.out.println("Digite outro número");
				int case9 = leia.nextInt();
				System.out.println("Digite outro número");
				int case10 = leia.nextInt();
				System.out.println("Digite outro número");
				int case11 = leia.nextInt();
				System.out.println("Digite outro número");
				int case12 = leia.nextInt();
				System.out.println("Digite outro número");
				int case13 = leia.nextInt();
				System.out.println("Digite outro número");
				int case14 = leia.nextInt();
				System.out.println("Digite outro número");
				int case15 = leia.nextInt();
				
				int result = case1 + case2 + case3 + case4 + case5 + case6 + case7 + case8 + case9 + case10 + case11 + case12 + case13 + case14 + case15;
				System.out.println("A soma de todos os 15 valores digitados é "+result);
				break;
			case 10:
				/*
				 * Escreva um programa que exiba na tela em ordem crescente,
				 * apenas os numeros pares existentes de 11 a 250
				 */
				for(int p = 11; p <= 250; p++) {
					if ( p % 2 == 0)
					System.out.println(p);
				}
				break;
			case 11:
				System.out.println("Até logo.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
				

	}

}
