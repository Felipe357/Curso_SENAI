package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Arquivos arq = new Arquivos();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			
			System.out.println("1-Cadastrar Pessoa\t2-Listar Pessoas\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				
				System.out.println("Digite o nome da pessoa:");
				String nome = scan.nextLine();
				
				System.out.println("Digite  ano de nascimento:");
				String data = scan.next();
				

				String dt = nome + ";" + data;
				
				arq.agrupar(dt, "Peaples", true);
				
				break;
			case 2:
				
				ArrayList<String> infoFile = arq.ler("Peaples");
				
				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					
						System.out.println("Nome: " +temp[0]);
						System.out.println("Idade: " + calcIdade(new SimpleDateFormat("dd/MM/yyyy").parse(temp[1])));
						System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
						System.out.println();
					
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
	
	public static int calcIdade(Date nascimento) {
		java.util.Date agora = new java.util.Date();  

		if (agora.getMonth() == nascimento.getMonth()) {
			if (agora.getDay() >= nascimento.getDay()) {
				return agora.getYear() - nascimento.getYear();
			} else {
				return agora.getYear() - nascimento.getYear() - 1;
			}
		} else if(agora.getMonth() > nascimento.getMonth()) {
			return agora.getYear() - nascimento.getYear();
		} else {
			return agora.getYear() - nascimento.getYear() - 1;
		}
	}

}
