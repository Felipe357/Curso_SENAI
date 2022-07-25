package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class Processa {
	
	public static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void enviar() {
		dao.salvar(linhas);
	}
	
}
