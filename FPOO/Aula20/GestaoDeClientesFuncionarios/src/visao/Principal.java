package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import modelo.Pessoa;
import modelo.Funcionario;
import modelo.Cliente;
import modelo.Vendas;

public class Principal {
	
	private static ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	private static ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private static ArrayList<Vendas> vendas = new ArrayList<Vendas>();

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException{
		
		int menu = 0;
		
		while(menu!=7) {
			System.out.println("1-Cadastrar Funcionários\t2-Cadastrar Clientes\n3-Listar funcionários\t4-Listar Clientes\n5-Cadastrar Vendas\t6-Listar Vendas\n7-Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				
				cadastrarFuncionario();
				
				break;
			case 2:
				
				cadastrarCliente();
				
				break;
			case 3:
				
				listarFuncionario();
				
				break;
			case 4:
				
				listarCliente();
				
				break;
			case 5:
				
				cadastrarVenda();
				
				break;
			case 6:
				
				listarVenda();
				
				break;
			case 7:
				System.out.println("Até uma próxima");
				break;
			default:
				System.out.println("Digite uma das opções rapa");
				break;
			
			}
		}
	}
	
	private static void cadastrarFuncionario() throws ParseException {
		
		int matricula = funcionario.size() + 1;
		
		System.out.println("--------Cadastro Do Funcionário--------");
		
		System.out.println("Digite o Nome");
		String nome = scan.next();
		
		System.out.println("Digite Telefone");
		String telefone = scan.next();
		
		System.out.println("Digite Data de Nascimento");
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(scan.next());
		
		System.out.println("Digite a comição que o funcionário receberá");
		double comicao = scan.nextDouble();
		
		funcionario.add(new Funcionario(matricula, comicao, nome, telefone, data));
		
	}
	
	private static void cadastrarCliente() throws ParseException {
		
		int id = cliente.size() + 1;
		
		System.out.println("--------Cadastro Do Cliente--------");
		
		System.out.println("Digite o Nome");
		String nome = scan.next();
		
		System.out.println("Digite o Telefone");
		String telefone = scan.next();
		
		System.out.println("Digite Data de Nascimento");
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(scan.next());
		
		System.out.println("Digite o Crédito do Cliente na loja");
		double credLimite = scan.nextDouble();
		
		cliente.add(new Cliente(id, credLimite, nome, telefone, data));
		
	}
	
	private static void listarFuncionario() {
		
		if (funcionario.size() < 1) {
			
			System.out.println("Nenhum Funcionário Cadastrado");
			
		} else {
			
			for (Funcionario fu : funcionario) {
				System.out.println(fu.toString());
			}
		}
	}
	
	private static void listarCliente() {
		
		if (funcionario.size() < 1) {
			
			System.out.println("Nenhum Cliente Cadastrado");
			
		} else {
			
			for (Cliente cl : cliente) {
				System.out.println(cl.toString());
			}
			
		}
		
	}
	
	private static void cadastrarVenda() {
		
		int cod = vendas.size() + 1;
		
		boolean rep = true;
		
		int codCliente;
		int mat;
		
		System.out.println("----------Cadastro de vendas----------");
		
		
		do {
			
			System.out.println("Digite o id do Cliente");
			codCliente = scan.nextInt();
			
			for (Cliente cli : cliente) {
				
				if (codCliente == cli.getId()) {
					rep = false;
				} else {
					System.out.println("Cliente não encontrado");
				}
				
			}
		} while (rep);
		
		boolean repe = true;
		
		do {
			
			System.out.println("Digite a matrícula do funcionário");
			mat = scan.nextInt();
			
			for (Funcionario funci : funcionario) {
				
				if (mat == funci.getMatricula()) {
					repe = false;
				} else {
					System.out.println("Funcionário não encontrado");
				}
				
			}
		} while (repe);
		
		System.out.println("Digite o valor da venda");
		double venda = scan.nextDouble();
		
		vendas.add(new Vendas(codCliente, mat, venda));
		
		for (Funcionario funcionario : funcionario) {
			if (funcionario.getMatricula() == mat) {
				System.out.println("Comissão = "+venda*funcionario.getComicao()/100);
			}
		}
		
	}
	
	private static void listarVenda() {
		
		if (vendas.size() > 1) {
			System.out.println("Nenhuma venda cadastrada");
		} else {
			for(Vendas ve : vendas) {
				System.out.println(ve.toString());
			}
		}
		
	}

}
