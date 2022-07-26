package modelo;

public class Nota {



		public String componente;
		public float[] notas = new float[3];

	
	
	public Nota (String componente, float notas[] ) {
		this.componente = componente;
		this.notas = notas;
	}
	
	//calcular média
	public float obterMedia() {
		
		float result = 0;
		
		for (int i = 0; i < notas.length; i++) {
			result += notas[i];
		}
		
		return result/3;
	}

}
