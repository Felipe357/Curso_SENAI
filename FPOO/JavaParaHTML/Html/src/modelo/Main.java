package modelo;

import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();

	public static void main(String[] args) {
		
		
		
		int menu = 0;
		
		do {
			
			System.out.println("1-Cadastrar Código HTML\t2-Listar Código\t0-Sair");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			
			case 1:
				
				gerarCodigo();
				
				break;
			case 2:
				
				listarCodigo();
				
				break;
			case 0:
				System.out.println("JistofinHaisen");
				break;
			default:
				System.out.println("Beterraba");
				break;
			
			}
		}while(menu != 0);

	}
	
	public static void gerarCodigo() {
		
		String data = "";
		String comT = "";
		String comS = "";
		
		System.out.println("Deseja adicionar um titulo(sim/nao)");
		String opcao = scan.next();
		
		scan.nextLine();
		
		String comTitulo;
		
		if (opcao.equals("sim")) {
			System.out.println("Digite o titulo:");
			String titulo = scan.nextLine();
			
			comT = comTitulo = "<h1>" + titulo + "</h1>\n";
			
		}else{
			System.out.println("Vamos para o proximo:\n");
		}
		
		System.out.println("Deseja Adicionar um SubTitulo(sim/nao)");
		String opcao2 = scan.next();
		
		scan.nextLine();
		
		String comSub;
		if (opcao2.equals("sim")) {
			System.out.println("Digite o Sub Titulo:");
			String subTitulo = scan.nextLine();
			
			comS = comSub = "<h3>" + subTitulo + "</h3>\n";
			
			
		} else if(opcao2.equals("nao")){
			System.out.println("Vamos para o proximo");
		}
		
		System.out.println("Deseja adicionar um paragrafo(sim/nao)");
		String opcao3 = scan.nextLine();
		
		
		if (opcao3.equals("sim")) {
			System.out.println("Digite o paragrafo:");
			String paragrafo = scan.nextLine();
			
			String comParagrafo = "<p>" + paragrafo + "</p>\n";
			
			data = comT + comS + comParagrafo;
			
			String datacom = "<html>\n<body>\n" + data + "</body>\n</html>";
			arq.agrupar(datacom, "site", false);
			
			System.out.println("Gerando codigo");
			System.out.println("Codigo gerado");
			
		} else if(opcao3.equals("nao")){
			String datacom = "<html>\n<body>\n" + data + "</body>\n</html>";
			
			arq.agrupar(datacom, "site", false);
			
			System.out.println("Gerando código");
			System.out.println("Codigo gerado");
		}
			
		
		
	}
	
	public static void listarCodigo() {
		
	}

}
