package modelo;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
	java.util.Scanner nota = new Scanner(System.in);
	
	float n1,n2,mf;
	
	System.out.print("Digite a primeira nota: ");
	n1 = nota.nextFloat();
	System.out.print("Digite a seginda nota: ");
	n2 = nota.nextFloat();
	
	//processamento
	mf = (n1 + n2)/2;
	
	if(mf>5){
		System.out.print("Voce foi aprovado,");
	} else {
		System.out.print("Voce foi reprovado,");
	}
	
	//saida
	System.out.print(" a media final e de " +mf+ " pontos");

	}

}
