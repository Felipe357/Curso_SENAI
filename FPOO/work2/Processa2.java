import java.util.Scanner;
public class Processa2{
	public static Scanner leia;
	public static void main(String args){
		leia = new Scanner(System.in);
		//entrada
		System.out.print("Digite um numero inteiro");
		int v1 = leia.nextInt();
		//saida
		System.out.printf("Você digitou %d \n",v1);
		
	}
	
}