package modelo;

public class Cachorro extends Animal {

	private int qntMotoqueirosAtacados;

	public Cachorro() {

	}

	@Override
	public String toString() {
		return super.toString() + "Motoqueiros Atacados = " + qntMotoqueirosAtacados;
	}

	public Cachorro(String especie, String nome, float peso, String raca, int qntMotoqueirosAtacados) {
		super(especie, nome, peso, raca);
		this.qntMotoqueirosAtacados = qntMotoqueirosAtacados;
	}

}
