package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Cachorro;
import modelo.Gato;
import modelo.Animal;

public class Pincipal {
	
	private static ArrayList<Cachorro> caes = new ArrayList<Cachorro>();
	private static ArrayList<Gato> gatos = new ArrayList<Gato>();

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;

		while (menu != 5) {

			System.out.println("1-Cadastrar cão\t2-Cadastrar gato\n3-Listar cão\t4-Listar gato\n5-Sair");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				
				cadastrarCao();

				break;

			case 2:
				
				cadastrarGato();

				break;
			case 3:
				
				listarCao();

				break;
			case 4:
				
				listarGato();

				break;
			case 5:

				break;
			default:
				System.out.println("Digite uma opçao descente rapa");
				break;

			}
		}

	}
	
	public static void cadastrarCao() {

		System.out.println("---Digite nessa sequência---");
		System.out.println("---Especie\tNome\tPeso\tRaça\tMotoqueiros Atacados---1");
		Cachorro cao = new Cachorro(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt()); 
		caes.add(cao);
		
	}
	
	public static void cadastrarGato() {
		
		System.out.println("---Digite nessa sequência---");
		System.out.println("\n---Especie\tNome\tPeso\tRaça\tQuantidades de vidas---");
		Gato gato = new Gato(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt());
		
	}
	
	public static void listarCao() {
		
		for (Cachorro c : caes) {
			System.out.println(c.toString());
		}
		
	}
	
	public static void listarGato() {
		
		for (Gato g : gatos) {
			System.out.println(g.toString());
		}
		
	}

}
