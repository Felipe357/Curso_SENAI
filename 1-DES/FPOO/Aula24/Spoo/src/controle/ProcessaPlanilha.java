package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class ProcessaPlanilha {
	
	private static DAO dao = new DAO();
	public static ArrayList<Planilha> linhas = new ArrayList<Planilha>();
	
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida(int menu) {
		
		switch(menu) {
		case 1:
			dao.salvarSoma(linhas);
			break;
		case 2:
			dao.salvarMult(linhas);
			break;
		case 3:
			dao.salvarDiv(linhas);
			break;
		case 4:
			dao.salvarSub(linhas);
			break;
		default:
			System.out.println("jahd");
			break;
		}
		
	}

}
