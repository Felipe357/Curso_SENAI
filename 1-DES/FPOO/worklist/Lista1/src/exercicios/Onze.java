package exercicios;

import java.util.Scanner;

public class Onze {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um valor para a: ");
		a = entrada.nextInt();
		System.out.println("Digite um valor para b: ");
		b = entrada.nextInt();
		System.out.println("Digite um valor para c: ");
		c = entrada.nextInt();

		    if(a + b > c && a + c > b && b + c > a){
		    	System.out.printf("Os 3 lados formam um triangulo!\n");
		        if(a == b && a == c)
		        	System.out.printf("Equilatero\n");
		        else
		            if(a == b || a == c || b == c)
		            	System.out.printf("Isosceles\n");
		            else
		            	System.out.printf("Escaleno\n");
		    }
		    else
		        System.out.printf("Os 3 lados NAO formam um trinagulo! ");
		}
		
		
		

	}


