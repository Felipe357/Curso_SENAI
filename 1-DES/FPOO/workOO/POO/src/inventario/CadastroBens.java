package inventario;

import java.util.Random;
import java.util.Scanner;

public class CadastroBens {

	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String[] descs = {"Carro","Casa","Moto","Ap","Relogio"};
	
	public static void main(String[] args) {
		
		System.out.println("Digite quantos bens deseja gerar?");
		int qtdBens = scan.nextInt();
		Bem[] bens = new Bem[qtdBens];
		System.out.println("ID\tDescrição\tValor");
		for(int i = 0; i < qtdBens; i++) {
			bens[i] = new Bem(i+1,descs[rand.nextInt(descs.length)], rand.nextDouble()*100000);
			System.out.println(bens[i].bemtab());
			
		}

	}
	
	public static class Bem{
		
		public int id;
		public String descricao;
		public double valor;
		
		Bem() {}
		Bem(int i, String d, double v){
			id = i;
			descricao = d;
			valor  = v;
		}
		
	public String bemtab(){
		
		return id+"\t"+descricao+"\t"+ String.format("R$%.2f",valor);
		
		}
	}

}
