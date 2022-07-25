package modelo;

import java.io.IOException;
import java.util.Scanner;

public class Av {
	
	public static Scanner entrada;
	public static void main(String[] args) throws IOException {
		entrada  = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu salário");
		Double sal = entrada.nextDouble();
		
		int op = 0;
		double salario, descontoINSS, descontoIRRF;
		float porcentagemINSS, porcentagemIRRF;
		
		if(sal > 7087.22) {
			porcentagemINSS = 0f;
		}else if(sal > 3641.03) {
			porcentagemINSS = 14f;
		}else if(sal > 2427.35){
			porcentagemINSS = 12f;
		}else if(sal > 1212.01){
			porcentagemINSS = 9f;
		} else {
			porcentagemINSS = 7.5f;		
		}

		if(porcentagemINSS == 0f) {
			descontoINSS = 992.21;
		} else {
			descontoINSS = sal * porcentagemINSS / 100;	
		}
		
		double salINSS = sal - descontoINSS;
		
		if(salINSS > 55976.16) {
			porcentagemIRRF = 0f;
		}else if(salINSS > 45012.61) {
			porcentagemIRRF = 22.5f;
		}else if(salINSS > 33919.81){
			porcentagemIRRF = 15f;
		}else if(salINSS > 22847.77){
			porcentagemIRRF = 7.5f;
		} else {
			porcentagemIRRF = 0f;		
		}

		if(porcentagemIRRF == 0f) {
			if(salINSS>55976.16) {
				descontoIRRF = 10432.32;
		} else {
			descontoIRRF = 0;
			}
		} else {
			descontoIRRF = salINSS * porcentagemIRRF / 100;
		}
		
		while(op != 4) {
			System.out.println("1.INSS\n2.IRRF\n3.FGTS\n4.Sair");
			op = entrada.nextInt();
			
			switch (op) {

			case 1:

				System.out.printf("O funcionário %s, sofrerá um desconto de %.2f%% no valor de R$ %.2f",nome, porcentagemINSS, descontoINSS);
			
			break;
		case 2:
				
				System.out.printf("O funcionário %s, sofrerá um desconto de %.2f no valor de R$ %.2f", nome, porcentagemIRRF, descontoINSS);
				
			break;
		
		case 3:
			
				System.out.printf("O funcionário %s, receberá em seu fundo de garantia 8%% do seu salário no valor de R$ %.2f", nome, (sal*8/100));
			break;
			
		case 4:
			
				System.out.printf("O funcionário %s, com salario de R$ %.2f, sofreu desconto no valor de R$ %.2f pelo INSS, R$ %.2f pelo IRRF, receberá no total R$ %.2f e será depositado R$ %.2f em seu FGTS", nome, sal, descontoINSS, descontoIRRF, (sal-descontoINSS-descontoIRRF), (sal*8/100));
			break;
			
		default:
			
			System.out.println("opção inválida");
			
			}
		}

	}

}
