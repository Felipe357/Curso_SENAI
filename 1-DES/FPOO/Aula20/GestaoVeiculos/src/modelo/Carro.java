package modelo;

public class Carro extends Veiculo {
	
	private String tipo;
	private int passageiros;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public Carro() {
		
	}
	
	public Carro(String tipo, int passageiros, String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		
		this.tipo = tipo;
		this.passageiros = passageiros;
		setPlaca(placa);
		setAnoModelo(anoModelo);
		setAnoFabricacao(anoFabricacao);
		setModelo(modelo);
		setMarca(marca);
		setValor(valor);
		
	}
	@Override
	public String toString() {
		return "----------Carro----------\n"
					+ "Tipo = " + tipo 
						+ ",\nPassageiros = " + passageiros 
							+ ",\nPlaca = "+ getPlaca()
								+ ",\nMarca = " + getMarca() 
									+ ",\nModelo = " + getModelo()
										+ ",\nAno Modelo = " + getAnoModelo() 
											+ ",\nAno Fabricacao = " + getAnoFabricacao()
												+ ",\nValor = " + getValor();
	}
	
	
	
}
