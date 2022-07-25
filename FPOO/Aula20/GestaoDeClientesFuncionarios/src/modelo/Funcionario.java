package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
	
	private int matricula;
	private double comicao;
	

	public Funcionario() {
		
	}
	
	public Funcionario(int matricula, double comicao, String nome, String telefone, Date nascimento) {
		
		this.matricula = matricula;
		this.comicao = comicao;
		setNome(nome);
		setTelefone(telefone);
		setNascimento(nascimento);
		
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	

	public double getComicao() {
		return comicao;
	}
	public void setComicao(double comicao) {
		this.comicao = comicao;
	}

	@Override
	public String toString() {
		return "----------Funcionario----------\n"
				+ "Nome = " + getNome()
					+ ",\nMatricula = " + matricula
						+ "\nTelefone = " + getTelefone()
							+ ",\nNascimento = " + new SimpleDateFormat("dd/MM/yyyy").format(getNascimento())
									+ ",\nComissão = " + comicao + "%";
	}
	
}
