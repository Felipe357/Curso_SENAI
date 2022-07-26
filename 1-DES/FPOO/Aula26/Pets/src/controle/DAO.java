package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Pet;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String path = "./Dados/pets.csv";

	public ArrayList<Pet> ler() {
		ArrayList<Pet> linhas = new ArrayList<>();
		Pet pet;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				pet = new Pet(linha);
				linhas.add(pet);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
	
	public void escrever(ArrayList<Pet> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Pet p : linhas) {
				bw.write(p.tocsv()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
