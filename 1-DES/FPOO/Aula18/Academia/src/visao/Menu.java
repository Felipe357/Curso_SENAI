package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Aparelho;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Aparelho[] aparelhos = new Aparelho[10];

	public static void main(String[] args) throws ParseException {

		int menu = 0;

		while (menu != 3) {
			System.out.println("1-Cadastrar Aparelho\n2-Listar Aparelho\n3-Sair");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				
				cadastrarAparelho();

				break;

			case 2:
				
				listarAparelho();

				break;

			case 3:
				System.out.println("Tchau");
				break;
			default:
				break;
			}
		}

	}

	private static void cadastrarAparelho() throws ParseException {
		
		int qnt;
		do {
			System.out.println("Quantos veiculos deseja cadastrar: (max:10)");
			qnt = scan.nextInt();
			
			if (qnt > 10) {
				System.out.println("Tá torto aí");
			} else {
				
				System.out.println("Digite: Nome - Tipo de Exercício - Grupo Múscular - Data de Aquisição - Valor da Aquisição");
				
				for (int i = 0; i < qnt; i++) {
					for (int j = 0; j < aparelhos.length; j++) {
						if (aparelhos[j] == null) {
							aparelhos[j] = new Aparelho();
							aparelhos[j].nome = scan.next();
							aparelhos[j].tipoExercicio = scan.next();
							aparelhos[j].grupoMuscular = scan.next();
							aparelhos[j].dataAquisicao = new SimpleDateFormat("dd/MM/yyyy").parse(scan.next());
							aparelhos[j].valorAquisicao = scan.nextDouble();
							break;
						}
					}
				}
			}
		}while (qnt > 10);
	}
	
	private static void listarAparelho() {
		
		System.out.println("Nome\tTipo de Exercício\tGrupo Múscular\tData de Aquisição\tValor da Aquisição");
		for (int i = 0; i < aparelhos.length; i++) {
			if (aparelhos[i] != null) {
				System.out.print(aparelhos[i].paraString());
			}
			
		}
		
	}
}
