package exercicios;

import java.util.Scanner;

public class Treze {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		double SALPF = 56.47;
		double salf = 0;
		
		System.out.println("Digite o numero de filhos menores de 14 anos ou deficientes: ");
		int filhos = entrada.nextInt();
		
		System.out.println("Digite o valor do seu sal�rio: ");
		double sal = entrada.nextDouble();
		
		if(sal <= 1655.98) {
			salf = SALPF * filhos;
			System.out.printf("O valor do seu sal�rio fam�lia � de R$ %.2f", salf);
		}else {
			System.out.println("Voc� n�o tem direito ao sal�rio fam�lia");
		}
		

	}

}
