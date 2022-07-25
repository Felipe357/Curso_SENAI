package exercicios;

import java.util.Scanner;

public class INSS {

	public static void main(String[] args) {
		//variaveis
		Scanner entrada = new Scanner(System.in);
		double salario, desconto;
		float porcentagem;	
		
		System.out.print("Digite seu sal�ro: ");
		salario = entrada.nextDouble();
		
		//processamento
		if(salario > 7087.22) {
			porcentagem = 0f;
		}else if(salario > 3641.03) {
			porcentagem = 14f;
		}else if(salario > 2427.35){
			porcentagem = 12f;
		}else if(salario > 1212.01){
			porcentagem = 9f;
		} else {
			porcentagem = 7.5f;		
		}
		
		//if com apenas um comando precisa das chaves 
		if(porcentagem == 0f)
			desconto = 992.21;
		else
			desconto = salario * porcentagem / 100;	
		
		//Sa�da
		System.out.printf("A al�quota aplicada � %.2f%% \n",porcentagem);
		System.out.printf("O desconto de INSS � %.2f\n",desconto);
		System.out.printf("Voc� vai receber %.2f\n",salario  - desconto);


	}

}
