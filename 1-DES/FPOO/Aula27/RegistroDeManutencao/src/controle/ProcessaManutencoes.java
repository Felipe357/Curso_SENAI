package controle;

import java.util.ArrayList;

import modelo.Manutencao;
import modelo.ManutencaoDAO;

public class ProcessaManutencoes {
	
	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static ManutencaoDAO dao = new ManutencaoDAO();
	
	public static void abrir() {
		manutencoes = dao.ler();
	}
	
	public static void salvar() {
		dao.escrever(manutencoes);
	}
	
}
