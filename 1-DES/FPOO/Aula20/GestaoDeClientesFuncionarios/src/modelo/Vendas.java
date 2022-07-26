package modelo;

import java.util.Date;

public class Vendas extends Pessoa {
	
	private int codVenda;
	private int codCliente;
	private int codFunci;
	private double valor;
	
	
	
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	
	
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	
	
	public int getCodFunci() {
		return codFunci;
	}
	public void setCodFunci(int codFunci) {
		this.codFunci = codFunci;
	}
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public Vendas() {
		
	}
	
	public Vendas(int codCliente, int codFunci, double valor) {
		
		this.codCliente = codCliente;
		this.codFunci = codFunci;
		this.valor = valor;
		
	}
	@Override
	public String toString() {
		return "----------Vendas----------\n"
					+ "\nCodigo Cliente = " + codCliente
						+ ",\nCodigo Funcionário = "+ codFunci
							+ ",\nValor = " + valor;
	}
	
	

}
