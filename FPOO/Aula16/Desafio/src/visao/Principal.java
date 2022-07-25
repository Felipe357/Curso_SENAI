package visao;

import java.util.Iterator;
import java.util.Scanner;
import modelo.Aluno;
import modelo.Nota;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Principal {

		static Aluno[] aluno = new Aluno[10];
		static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		static Nota[] notas = new Nota[4];
		
		public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu != 8) {
			System.out.println("1-Cadastrar Alunos\n2-Cadastrar Nota\n3-Listar alunos\n4-Listar notas\n5-Dados de um aluno especifico\n6-Alunos aprovados\n7-Alunos reprovados\n8-sair");
			menu = scan.nextInt();
			switch(menu) {
			
			case 1:
				
				cadastrarAlunos();
				
				break;
			case 2:
				
				cadastrarNotas();
				
				break;
			case 3:
				
				listarAlunos();
				
				break;
			case 4:
				
				listarNotas();
				
				break;
			case 5:
				
				int num = 0;
				
				Aluno aluno = null;
				
				while (num != 1 && num !=2) {
					System.out.println("Deseja buscar por \n1-RA\n2-Nome");
					num = scan.nextInt();
					
					switch (num) {
					case 1:
						System.out.println("Digite o RA");
						int id = scan.nextInt();
						aluno = obterDados(id);
						break;
					case 2:
						System.out.println("Digite o nome");
						String nome = scan.next();
						aluno = obterDados(nome);
						break;
					default:
						System.out.println("Opção não encontrada");
						break;
					}
				}
				
				if(aluno != null) {
					System.out.print(aluno.ra + "\t" + aluno.nome + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(aluno.nascimentoAluno) + "\t" + aluno.idadeDoAluno()+ "\t");
					for (int i = 0; i < notas.length; i++) {
						System.out.print(aluno.notas + "\t");
					}
					System.out.println(aluno.obterConceito());
				} else {
					System.out.println("Aluno não encontrado");
				}
				
				break;
			case 6:
				
				listarAlunosAprovados();
				
				break;
			case 7:
				
				listarAlunosReprovados();
				
				break;
			case 8:
				System.out.println("Ate uma próxima");
				break;
			default:
				System.out.println("Digite outro número rapa");
				break;
			}
			
		}
	}
		
		public static void cadastrarAlunos() throws ParseException{
			Scanner scan = new Scanner(System.in);
			
			int qtdAlunos = 0;
			
			do {
				System.out.println("Quantos Alunos deseja cadastrar?");
				qtdAlunos = scan.nextInt();
				
				if (qtdAlunos > 10) {
					System.out.println("Ta torto ai mano(limite 10)");
				}else {
					System.out.println("Digite o nome\tRA\tdata de nascimento");
					for (int i = 0; i < qtdAlunos; i++) {
						for (int j = 0; j < aluno.length; j++) {
							if (aluno[j] == null) {
								aluno[j] = new Aluno();
								aluno[j].nome = scan.next();
								aluno[j].ra = scan.nextInt();
								aluno[j].nascimentoAluno = df.parse(scan.next());
								break;
							}
						}
					}
				}
			} while (qtdAlunos > 10);	
		}
		
		public static void cadastrarNotas() {
			Scanner scan = new Scanner(System.in);
			int qtdNotas = 0;
			
			System.out.println("Digite o RA do aluno que deseja cadastrar");
			int ra = scan.nextInt();
			
			for (int i = 0; i < aluno.length; i++) {
				if(aluno[i] != null) {
					if(aluno[i].ra == ra) {
						Nota[] notas = aluno[i].notas;
						System.out.println("ALUNO: " + aluno[i].nome);
						do {
							System.out.println("Quantas notas deseja cadastrar? (max: 4)");
							qtdNotas = scan.nextInt();
							
							if (qtdNotas > 4) {
								System.out.println("Ta torto ai mano(limite 4)");
								
							} else {
								for (int i2 = 0; i2 < qtdNotas; i2++) {
									for (int j = 0; j < 4; j++) {
										if (notas[j] == null) {
											System.out.println("Digite á matéria\tnota-1\tnota-2\tnota-3");
												String componente = scan.next();
												
												float[] nota = new float[3];
												
												for (int k2 = 0; k2 < nota.length; k2++) {
													nota[k2] = scan.nextFloat();
												}
												
												aluno[i].notas[j] = new Nota(componente, nota);
												
											
											break;
										}
									}
								}
							}
												
						} while (qtdNotas > 4);
					}else if(i == 9) {
						System.out.println("RA não encontrado");
						break;
					}
				}
			}
			
		}
		
		public static void listarAlunos() {
			System.out.println("Nome\t    RA\t    Data de nascimento\t    Idade");
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null) {
					System.out.println(aluno[i].paraString());
				}
			}
		}
		
		public static void listarNotas() {
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null) {
					
					System.out.println(aluno[i].nome);
					
					System.out.println("\tComp.\tNota 1\tNota 2\tNota 3\tMédia\n");
					for (int j = 0; j < aluno[j].notas.length; j++) {
						if (aluno[j].notas[j] != null) {
							System.out.print("\t" + aluno[j].notas[j].componente);
							for (int j2 = 0; j2 < aluno[j].notas[j].notas.length; j2++) {
								System.out.print("\t" + aluno[j].notas[j].notas[j2]);
							}
							if(aluno[j].notas[j].obterMedia() <= 50) {
								System.out.printf("\t|%.2f|", aluno[j].notas[j].obterMedia());
								System.out.println("\n");
							} else {
								System.out.printf("\t|%.2f|", aluno[j].notas[j].obterMedia());
								System.out.println("\n");
							}
						
						
					}
					System.out.println(aluno[j].obterConceito());
					System.out.println("\n");
				}
				
			}
		}
	}
		
		public static Aluno obterDados(int ra) {
			for (int i = 0; i < aluno.length; i++) {
				if(aluno[i] != null && aluno[i].ra == ra) {
					return aluno[i];
				}
			}
			return null;
		}
		
		public static Aluno obterDados(String nome) {
			for (int i = 0; i < aluno.length; i++) {
				if(aluno[i] != null && aluno[i].nome.equals(nome)) {
					return aluno[i];
				}
			}
			return null;
		}
		
		public static void listarAlunosAprovados() {
			
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null && aluno[i].obterConceito().equals("O(a) Aluno(a) " + aluno[i].nome + " foi aprovado")) {
					
					System.out.println(aluno[i].nome);
					
					System.out.println("\tMateria\tNota 1\tNota 2\tNota 3\tMédia\n");
					for (int j = 0; j < aluno[i].notas.length; j++) {
						System.out.print("\t" + aluno[i].notas[j].componente);
						for (int j2 = 0; j2 < aluno[i].notas[j].notas.length; j2++) {
							System.out.print("\t" + aluno[i].notas[j].notas[j2]);
						}
						if(aluno[i].notas[j].obterMedia() > 50) {
							System.out.printf("\t|%.2f|", aluno[i].notas[j].obterMedia());
							System.out.println("\n");
						} else {
							System.out.printf("\t%.2f", aluno[i].notas[j].obterMedia());
							System.out.println("\n");
						}
						
					}
					System.out.println(aluno[i].obterConceito());
					System.out.println("\n");
				}
			}
		}
		
		public static void listarAlunosReprovados() {
			
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null && aluno[i].obterConceito().equals("O(a) Aluno(a) " + aluno[i].nome + " foi reprovado")) {
					
						System.out.println(aluno[i].nome);
					
					System.out.println("\tMateria\tNota 1\tNota 2\tNota 3\tMédia\n");
					for (int j = 0; j < aluno[i].notas.length; j++) {
						System.out.print("\t" + aluno[i].notas[j].componente);
						for (int j2 = 0; j2 < aluno[i].notas[j].notas.length; j2++) {
							System.out.print("\t" + aluno[i].notas[j].notas[j2]);
						}
						if(aluno[i].notas[j].obterMedia() > 50) {
							System.out.printf("\t|%.2f|", aluno[i].notas[j].obterMedia());
							System.out.println("\n");
						} else {
							System.out.printf("\t%.2f", aluno[i].notas[j].obterMedia());
							System.out.println("\n");
						}
						
					}
					
					System.out.println(aluno[i].obterConceito());
					System.out.println("\n");
				}
			}
			}
}
