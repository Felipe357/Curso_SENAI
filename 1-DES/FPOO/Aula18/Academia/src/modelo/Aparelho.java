package modelo;

import java.util.Date;

public class Aparelho {

	public String nome;
	public String tipoExercicio;
	public String grupoMuscular;
	public Date dataAquisicao;
	public double valorAquisicao;
	
	public void Aparelho() {
		
	}
	
	public void Aparelho(String nome, String tipoExercicio, String grupoMuscular, Date dataAquisicao, double valorAquisicao) {
		
		this.nome = nome;
		this.tipoExercicio = tipoExercicio;
		this.grupoMuscular = grupoMuscular;
		this.dataAquisicao = dataAquisicao;
		this.valorAquisicao = valorAquisicao;
		
	}
	
	public int tempoUso() {
		Date agora = new Date();
		
		return agora.getYear() - dataAquisicao.getYear();
	}
	
	public double depreciacao() {
		return 0;
	}
	
	public double valorDepreciacao() {
		return 0;
	}
	
	public String paraString() {
		return nome + "\t" + tipoExercicio + "\t" + grupoMuscular + "\t" + dataAquisicao + "\t" + valorAquisicao;
	}
}
