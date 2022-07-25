package modelo;

import java.util.Scanner;

public class Expressoes {

	public static Scanner result;
	public static void main(String[] args) {
		
		 result = new Scanner(System.in);
		
		int a, b, c;
		double delta, r1, r2;
		
		System.out.print("Digite um numero para a: ");
		a = result.nextInt();
		System.out.print("Digite um numero para b: ");
		b = result.nextInt();
		System.out.print("Digite um valor para c: ");
		c = result.nextInt();
		
		delta = (double) (b*b-4*a*c);
		
		if(delta < 0){
			System.out.print("não possui raizes reais");
		} else {
			r1 = (-b + Math.sqrt(delta))/(2*a);
			
			r2 = (-b - Math.sqrt(delta))/(2*a);
			
			System.out.printf("As raizes da equação são %.2f e %.2f", r1, r2);
		}
	}
}
