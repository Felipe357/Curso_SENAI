package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Visao {

	public static void main(String[] args) {
		
		Arquivos arq = new Arquivos();
		Scanner scan = new Scanner(System.in);
		
		
		int menu = 0;
		
		do {
			
			System.out.println("1-Cadastrar Aluno e suas notas\t2-Listar Alunos e sua media\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				
				System.out.println("Nome");
				String nome = scan.nextLine();
				
				System.out.println("Nota 1");
				String n1 = scan.next();
				
				System.out.println("Nota 2");
				String n2 = scan.next();
				
				System.out.println("Nota 3");
				String n3 = scan.next();
				
				String dt = nome + ";" + n1 + ";" + n2 + ";" + n3;
				
				arq.agrupar(dt, "Escola", true);
				
				break;
			case 2:
				
				ArrayList<String> infoFile = arq.ler("Escola");
				
				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					
					double media = (Double.parseDouble(temp[1]) + Double.parseDouble(temp[2]) + Double.parseDouble(temp[3])) / 3;
					
						System.out.println("Nome: " +temp[0]);
						System.out.printf("Media: %.1f\n", media);
					
				}
				
				break;
			case 0:
				System.out.println("Baby Baby do Birulaby laby");
				break;
			default:
				System.out.println("Oooooopa");
				break;

	}

		}while(menu !=0);
	}
}
