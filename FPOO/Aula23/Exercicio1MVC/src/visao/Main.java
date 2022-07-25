package visao;

import controle.Processa;

public class Main {

	public static void main(String[] args) {
		
		Processa.carregar();
		
		Processa.enviar();
		
		System.out.println("Idades calculadas com sucesso");

	}

}
