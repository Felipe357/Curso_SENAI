package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.Nota;

public class Aluno {

	public int ra;
	public String nome;
	public Date nascimentoAluno;
	public Nota[] notas = new Nota[4];
	
	public Aluno() {
		
	}
	
	//RA
	public Aluno(int ra, String nome, Date nascimentoAluno) {
		this.ra = ra;
		this.nome = nome;
		this.nascimentoAluno = nascimentoAluno;
	}
	
	//Data em dia / mês / ano
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	@SuppressWarnings("deprecation") 
	public int idadeDoAluno() {
		Date hoje = new Date();
		return hoje.getYear() - nascimentoAluno.getYear();
	}
	
	public String obterConceito() {
		boolean ap = true;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] != null) {
				if (notas[i].obterMedia() <= 50) {
					ap = false;
					break;
				}
			}
			
		}
		if (ap) {
			return "O(a) Aluno(a) "+ nome +" foi aprovado";
		} else {
			return "O(a) Aluno(a) "+ nome +" foi reprovado";
		}
	}
	
	public String paraString() {
		return nome +"     "+"    "+ra+" "+"     "+ df.format(nascimentoAluno)+"        	    " +idadeDoAluno();
	}

}
