package exercicios;
import java.util.Scanner;
public class Doze {

	public static void main(String[] args) {
		//Variáveis
				Scanner entrada = new Scanner(System.in);
				double salario, desconto;
				float porcentagem;
				//Entrada
				System.out.print("Digite o seu salário: ");
				salario = entrada.nextDouble();
				
				//Processamento
				if(salario > 4664.68) {
					porcentagem = 27.5f;
				}else if(salario > 3751.05) {
					porcentagem = 22.5f;
				}else if(salario > 2826.65){
					porcentagem = 15f;
				}else if(salario > 1903.98){
					porcentagem = 7.5f;
				} else {
					porcentagem = 0f;		
				}
				
				//if com apenas um comando precisa das chaves 
				if(porcentagem == 0f)
					desconto = 869.36;
				else
					desconto = salario * porcentagem / 100;
				

				System.out.printf("O desconto será de %.2f\n",desconto);

	}

}
