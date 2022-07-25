package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class Processa {

	private static ArrayList<Planilha> linhas = new ArrayList<Planilha>();
	private static DAO dao = new DAO(); 
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida(String email, String senha) {
		dao.validarConta(email, senha, linhas);
	}
	
}
