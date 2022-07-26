package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa {
	
	private int id;
	private double creditoLimite;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, double creditoLimite, String nome, String telefone, Date nascimento ) {
		
		this.id = id;
		this.creditoLimite = creditoLimite;
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setNascimento(nascimento);
		
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public double getCreditoLimite() {
		return creditoLimite;
	}
	public void setCreditoLimite(double creditoLimite) {
		this.creditoLimite = creditoLimite;
	}

	@Override
	public String toString() {
		return "-------Cliente------- \n"
				+ "id = " + id + ",\n"
					+ "Nome = " + getNome() + ",\n"
						+ "Telefone = " + getTelefone() + ",\n"
							+ "Data de nascimento = " + new SimpleDateFormat("dd/MM/yyyy").format(getNascimento()) + ",\n"
								+ "Credito Limite = " + creditoLimite + ",\n";
	}
	
}
