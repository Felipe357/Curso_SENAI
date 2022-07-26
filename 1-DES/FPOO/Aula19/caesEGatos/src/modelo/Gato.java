package modelo;

public class Gato extends Animal {

	private int qntVidas = 7;

	public Gato() {

	}

	@Override
	public String toString() {
		return super.toString() + "Vidas = " + qntVidas;
	}

	public Gato(String especie, String nome, float peso, String raca, int qntVidas) {
		super(especie, nome, peso, raca);
		this.qntVidas = qntVidas;
	}

}
