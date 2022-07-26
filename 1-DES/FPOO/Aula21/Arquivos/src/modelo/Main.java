package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Arquivo arq = new Arquivo();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("1-Cadastrar\t2-Listar\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				
				System.out.println("Informe Seu Nome:");
				String nome = scan.nextLine();
				
				System.out.println("Informe Sua Idade:");
				String idade = scan.next();
				
				scan.nextLine();
				
				System.out.println("Informe Sua Cidade:");
				String cidade = scan.nextLine();
				
				String data = nome + ";" + idade + ";" + cidade;
				
				arq.escrever(data, "Pessoas", true);
				
				break;
			case 2:
				
				ArrayList<String> infoFile = arq.ler("Pessoas");
				
				String busca = "felipe";
				
				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if (temp[0].toLowerCase().contains(busca.toLowerCase())) {
						System.out.println("Nome: " +temp[0]);
						System.out.println("Idade: " +temp[1]);
						System.out.println("Cidade: "+temp[2]);
						System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
					}
				}
				
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		} while (menu != 0);
		
	}

}
