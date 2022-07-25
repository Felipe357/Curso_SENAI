package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Veiculos arq = new Veiculos();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("1-Cadastrar Veiculo\t2-Listar Veiculo\t3- Buscar\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				
				System.out.println("Informe a marca:");
				String marca = scan.nextLine();
				
				System.out.println("Informe o modelo:");
				String modelo = scan.nextLine();
				
				System.out.println("Informe a placa:");
				String placa = scan.nextLine();
				
				System.out.println("Informe a cor:");
				String cor = scan.next();
				
				String dt = marca + ";" + modelo + ";" + placa + ";" + cor;
				
				arq.agrupar(dt, "Estacionamento", true);
				
				break;
			case 2:
				
				ArrayList<String> infoFile = arq.ler("Estacionamento");
				
				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					
						System.out.println("marca: " +temp[0]);
						System.out.println("Modelo: " +temp[1]);
						System.out.println("Placa: "+temp[2]);
						System.out.println("Cor: "+temp[3]);
						System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
					
				}
				
				break;
			case 3:
				
				int men = 0;
				
				do {
					
					System.out.println("Buscar por:");
					System.out.println("1-marca\t2-modelo\t3-placa\t4-cor");
					men = scan.nextInt();
					
					switch(men) {
					case 1:
						
						ArrayList<String> fileCar = arq.ler("Estacionamento");
						
						System.out.println("Digite a marca:");
						String bu = scan.next();
						
						for (String linha : fileCar) {
							String[] temp = linha.split(";");
							if (temp[0].toLowerCase().contains(bu.toLowerCase())) {
								System.out.println("marca: " +temp[0]);
								System.out.println("Modelo: " +temp[1]);
								System.out.println("Placa: "+temp[2]);
								System.out.println("Cor: "+temp[3]);
								System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
							}
						}
						break;
					case 2:
						
							ArrayList<String> fileCa = arq.ler("Estacionamento");
							
							System.out.println("Digite a modelo:");
							String bus = scan.next();
							
							for (String linha : fileCa) {
								String[] temp = linha.split(";");
								if (temp[1].toLowerCase().contains(bus.toLowerCase())) {
									System.out.println("marca: " +temp[0]);
									System.out.println("Modelo: " +temp[1]);
									System.out.println("Placa: "+temp[2]);
									System.out.println("Cor: "+temp[3]);
									System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
								}
							}
						
						break;
					case 3:
						
						ArrayList<String> fileC = arq.ler("Estacionamento");
						
						System.out.println("Digite a placa:");
						String busc = scan.next();
						
						for (String linha : fileC) {
							String[] temp = linha.split(";");
							if (temp[2].toLowerCase().contains(busc.toLowerCase())) {
								System.out.println("marca: " +temp[0]);
								System.out.println("Modelo: " +temp[1]);
								System.out.println("Placa: "+temp[2]);
								System.out.println("Cor: "+temp[3]);
								System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
							}
						}
					
						break;
					case 4:
						
						ArrayList<String> file = arq.ler("Estacionamento");
						
						System.out.println("Digite a cor:");
						String b = scan.next();
						
						for (String linha : file) {
							String[] temp = linha.split(";");
							if (temp[3].toLowerCase().contains(b.toLowerCase())) {
								System.out.println("marca: " +temp[0]);
								System.out.println("Modelo: " +temp[1]);
								System.out.println("Placa: "+temp[2]);
								System.out.println("Cor: "+temp[3]);
								System.out.println("|-|-|-|-|-|-|-|-|-|-|-|");
							}
						}
					
						break;
					default:
						System.out.println("binladem");
						break;
					}
					
				} while (men != 0);
				
				break;
			case 0:
				System.out.println("bye");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		} while (menu != 0);


	}

}

