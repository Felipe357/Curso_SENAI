package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		
		Arquivos arq = new Arquivos();
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int menu = 0;
		
		do {
			
			System.out.println("1-Gerar Numeros\t2-Listar\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				
				ArrayList<Integer> randola = new ArrayList<Integer>();

				
				for (int i = 0; i < 10; i++) {
					randola.add(rand.nextInt(100));
				}
				
				arq.agrupar(randola, "Num", true);
				
				System.out.println("Números gerados");
				
				break;
			case 2:
				
				ArrayList<Integer> infoFile = arq.ler("num");
				
				infoFile.sort(null);
				
				System.out.println("Ordem crescente");
				
				for (Integer linha : infoFile) {	
					System.out.println(linha);
				}
				
				break;
			case 0:
				System.out.println("Tchau");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		} while (menu != 0);

	}

}
