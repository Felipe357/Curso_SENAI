package Ex;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ExRecu {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu !=9) {
			
			System.out.println("1-Matriz 5x5 localização\n2-Matriz 5x5 busca\n3-Matriz 3x3 transposta\n4-Matriz 3x3 soma diagnal principal acima\n5-Matriz 3x3 soma diagonla principal abaixo\n6-Bingo\n7-Notas Alunos\n8-Menu de opções\n9-Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			
				case 1:
					
					ex1();
					
					break;
				case 2:
					
					ex2();
					
					break;
				case 3:
					
					ex3();
					
					break;
				case 4:
					
					ex4();
					
					break;
				case 5:
					
					ex5();
					
					break;
				case 6:
					
					ex6();
					
					break;
				case 7:
					
					ex7();
					
					break;
				case 8:
					
					int num = 0;
					
					while(num != 5) {
						
						System.out.println("(1) somar as duas matrizes.\r\n"
								+ "(2) subtrair a primeira matriz da segunda.\r\n"
								+ "(3) adicionar uma constante as duas matrizes.\r\n"
								+ "(4) imprimir as matrizes.");
						num = scan.nextInt();
						
						switch(num) {
						
						case 1:
							System.out.println("Digite 1 para confirmar");
							int soma = scan.nextInt();
							ex8(soma);
							break;
						case 2:
							System.out.println("Digite 1 para confirmar");
							int sub = scan.nextInt();
							ex8(sub);
							break;
						case 3:
							System.out.println("Digite 1 para confirmar");
							int ad = scan.nextInt();
							ex8(ad);
							break;
						case 4:
							System.out.println("Digite 1 para confirmar");
							int imp = scan.nextInt();
							ex8(imp);
							break;
						
						}
					}
					
					break;
				case 9:
					System.out.println("Até logo");
					break;
				default:
					System.out.println("Digite uma das opções né rapa");
					break;
			}
		}
		
	}
	
	public static void ex1() {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int[5][5];
        int maior=0;
        int l=0;
        int c=0;
        int cont = 0;
        
        for (int lin = 0; lin < a.length; lin++){
            for (int col = 0; col < a[lin].length; col++){
            	System.out.println("Digite os numeros da matriz");
                a[lin][col] = scan.nextInt();
         
            }
        }
    
        System.out.print("coluna->\t\t0\t\t1\t\t2\t\t3\t\t4\nlinha ||\n");
        for (int i = 0; i < a.length; i++) {
        	System.out.print(i + "     ||\t");
			for (int j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j] + "\t");
			}
			System.out.println();
		}
        
        for (int lin = 0; lin< a.length; lin++){
            for (int col = 0; col<a[lin].length; col++){
                if (a[lin][col] > maior){
                    maior = a[lin][col];
                    l = lin;
                    c = col;
                }
                }
        }
        System.out.println("");
        
        System.out.printf("O maior valor está na linha: %d , coluna: %d\n" , l , c);
            
        System.out.println("");
           
    }
	
	public static void ex2() {
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int[5][5];
		
        int num = 0;
        int lin =0;
        int col =0;
        
        char veri = 'n';
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
            	
            System.out.println("\nDigite os numeros da matriz");
            a[i][j] = scan.nextInt();
             
            }
        }
		
        System.out.print("coluna->\t0\t\t1\t\t2\t\t3\t\t4");
        System.out.println("\n");
        
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
        
        System.out.println("Digite o número que deseja buscar ou ver se foi gerado: ");
        num = scan.nextInt();
        
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == num) {
					lin = i;
					col = j;
					veri = 's';
				} 
			}
		}
        if (veri == 's') {
        	System.out.printf("Numero %d encontrado na linha %d e  %d coluna", num, lin, col);
		} else {
			System.out.println("Número não encontrado");
		}
        
        System.out.println("");
	}

	public static void ex3() {
		
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
            	
            System.out.println("\nDigite os numeros da matriz");
            matriz[i][j] = scan.nextInt();
             
            }
        }
	    
	    System.out.println("Elementos da matriz:");
	    for(int i = 0; i < matriz.length; i++){
	      for(int j = 0; j < matriz[0].length; j++){
	        System.out.printf("%5d  ", matriz[i][j]);
	      }
	      System.out.println();
	    }
	    
	    int linhas = matriz.length; 
	    int colunas = matriz[0].length; 
	    int transposta[][] = new int[colunas][linhas]; 
	     
	    for(int i = 0; i < matriz.length; i++){
	      for(int j = 0; j < matriz[0].length; j++){
	        transposta[j][i] = matriz[i][j];
	      }
	    }

	    System.out.println("Elementos da matriz transposta:");
	    for(int i = 0; i < transposta.length; i++){
	      for(int j = 0; j < transposta[0].length; j++){
	        System.out.printf("%5d  ", transposta[i][j]);
	      }
	      System.out.println();
	    }
	  }
	public static void ex4() {
		
		Scanner scan = new Scanner(System.in);
	     
	    int matriz[][] = new int[3][3];
	    int somaDiagonal = 0;

	    for(int i = 0; i < matriz.length; i++){ 
	      for(int j = 0; j < matriz[0].length; j++){
	        System.out.print("Informe o valor para a linha " + i 
	           + " e coluna " + j + ": ");
	        matriz[i][j] = Integer.parseInt(scan.nextLine());       
	      }       
	    }
	     
	    System.out.println();

	    for(int i = 0; i < matriz.length; i++){
	  
	      for(int j = 0; j < matriz[0].length; j++){ 
	        System.out.printf("%5d ", matriz[i][j]);
	      }
	      System.out.println();
	    }
	     
	    for(int i = 0; i < matriz.length; i++){
	      for(int j = 0; j < matriz[0].length; j++){
	        if(i == j){
	          somaDiagonal = somaDiagonal + matriz[i][j];
	        }
	      }
	    }

	    System.out.println("\nA soma dos elementos acima da diagonal principal é: " 
	      + somaDiagonal);
	  }
		
		public static void ex5() {
			
			Scanner scan = new Scanner(System.in);
		     
		    int matriz[][] = new int[3][3];
		    int somaDiagonal = 0;

		    for(int i = 0; i < matriz.length; i++){ 
		      for(int j = 0; j < matriz[0].length; j++){
		        System.out.print("Informe o valor para a linha " + i 
		           + " e coluna " + j + ": ");
		        matriz[i][j] = Integer.parseInt(scan.nextLine());       
		      }       
		    }
		     
		    System.out.println();

		    for(int i = 0; i < matriz.length; i++){
		  
		      for(int j = 0; j < matriz[0].length; j++){ 
		        System.out.printf("%5d ", matriz[i][j]);
		      }
		      System.out.println();
		    }
		     
		    for(int i = 0; i < matriz.length; i++){
		      for(int j = 0; j < matriz[0].length; j++){
		        if(i > j){
		          somaDiagonal = somaDiagonal + matriz[i][j];
		        }
		      }
		    }

		    System.out.println("\nA soma dos elementos acima da diagonal principal é: " 
		      + somaDiagonal);
		}
		
		public static void ex6() {
			Random rand = new Random();
			
			 Set<Integer> numeros = new HashSet<>();

			 int[][] numeros1 = new int[5][5];
			  System.out.println("");
			 for (int i = 0; i < numeros1.length; i++) {
				 for (int j = 0; j < numeros1.length; j++) {
			            numeros1[i][j] = rand.nextInt(100);
			            numeros.add(numeros1[i][j]);
			            
			            System.out.printf("%5d", numeros1[i][j]);
			        }
				 
				 System.out.println("");
				 
			}
		}
		
		public static void ex7() {
			Scanner scan = new Scanner(System.in);
			
			String[] alunos = new String[10];
			int[] notas = new int[3];
			
			int qtdAlunos;
			do {
				System.out.println(" Quantos alunos deseja cadastrar");
				qtdAlunos = scan.nextInt();
				if (qtdAlunos > 10) {
					System.out.println("tá torto");
				} else {
					
					for (int i = 0; i < alunos.length; i++) {
						System.out.println("Digite o nome do aluno");
						alunos[i] = scan.next();
						for (int j = 0; j < notas.length; j++) {
							
						}
					}
				}
			} while (qtdAlunos > 10);
			
			
		}
		
		public static void ex8(int soma) {
		Scanner scan =  new Scanner(System.in);
		
		
		
		float[][] mat1 = new float[2][2];
		float[][] mat2 = new float[2][2];
		
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				System.out.println("Digite o valor para Matriz-1");
				mat1[i][j] = scan.nextFloat();
			}
		}
		
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				System.out.println("Digite o valor para Matriz-1");
				mat2[i][j] = scan.nextFloat();
			}
		}
		
		float[][] soma1 = new float[mat1.length][mat1.length];
		
		
		for (int i = 0; i < soma1.length; i++) {
			for (int j = 0; j < soma1.length; j++) {
				soma1[i][j] = mat1[i][j]+mat2[i][j];
				System.out.println(soma1[i][j]+"");
			}
			System.out.println();
		}
		}
		
		public static void ex8(int sub) {
			
		}
	
	}
	

	

	



