package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {
	
	private BufferedWriter bw;
	private BufferedReader br;
	private String saida = "D:\\FPOO\\FPOO\\Aula24\\Spoo\\dados\\saida.csv";
	private String entrada = "D:\\FPOO\\FPOO\\Aula24\\Spoo\\dados\\entrada.csv";
	
	
	public ArrayList<Planilha> abrir() {
		
		ArrayList<Planilha> linhas = new ArrayList<Planilha>();
		
		Planilha p;
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String l = br.readLine();
			
			while( l != null) {
				p = new Planilha(l);
				linhas.add(p);
				l = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return linhas;
	}
	
	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha l : linhas) {
				bw.write(l.adicao()+ "\r\n");
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void salvarMult(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha l : linhas) {
				bw.write(l.mult()+ "\r\n");
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void salvarDiv(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha l : linhas) {
				bw.write(l.div()+ "\r\n");
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void salvarSub(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha l : linhas) {
				bw.write(l.sub()+ "\r\n");
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	
}
