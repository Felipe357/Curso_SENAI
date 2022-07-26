package modelo;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public Moto() {
		
	}
	
	public Moto(int cilindradas, String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		
		this.cilindradas = cilindradas;
		setPlaca(placa);
		setAnoModelo(anoModelo);
		setAnoFabricacao(anoFabricacao);
		setModelo(modelo);
		setMarca(marca);
		setValor(valor);
		
	}
	@Override
	public String toString() {
		return "----------Moto----------"
					+ "\nCilindradas = " + cilindradas 
						+ ",\nPlaca = " + getPlaca()
							+ ",\nAnoModelo = " + getAnoModelo()
								+ ",\nAnoFabricacao = " + getAnoFabricacao()
									+ ",\nModelo = " + getModelo()
										+ ",\nMarca = " + getMarca()
											+ ",\nValor = " + getValor();
	}
	
	

}
