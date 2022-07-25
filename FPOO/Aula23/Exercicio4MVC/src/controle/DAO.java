package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {
	
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "D:\\FPOO\\FPOO\\Aula23\\Exercicio4MVC\\Dados\\usuarios.csv";
	
	
	public ArrayList<Planilha> abrir() {
		ArrayList<Planilha> linhas = new ArrayList<Planilha>();
		
		Planilha p;
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String l = br.readLine();
			
			while(l != null) {
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
	
	public boolean validarConta(String email, String senha, ArrayList<Planilha> linhas) {
		Planilha u = new Planilha(email + ";" + senha);
		
		if(u.validaEmail(email, linhas)) {
			if (u.validaSenha(email, senha, linhas)) {
				System.out.println("Acesso permitido");
				return true;
			} else {
				System.out.println("Acesso negado");
				return false;
			}
		} else {
			System.out.println("usuário não encontrado");
			return false;
		}
	}


}
