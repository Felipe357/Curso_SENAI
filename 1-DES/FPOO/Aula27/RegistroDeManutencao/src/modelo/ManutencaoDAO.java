package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManutencaoDAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "./Dados/registro.csv";

	public ArrayList<Manutencao> ler() {
		ArrayList<Manutencao> linhas = new ArrayList<>();
		Manutencao manutencao;
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = br.readLine();
			while(linha != null) {
				manutencao = new Manutencao(linha);
				linhas.add(manutencao);
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
	
	public void escrever(ArrayList<Manutencao> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo));
			for (Manutencao p : linhas) {
				bw.write(p.tocsv()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
