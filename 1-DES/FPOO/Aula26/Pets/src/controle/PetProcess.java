package controle;

import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {
	
	public static ArrayList<Pet> pets = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void abrir() {
		pets = dao.ler();
	}
	
	public static void salvar() {
		dao.escrever(pets);
	}
	
	public static void carregarTeste() {
		
		//Limpa a lista
		pets = new ArrayList<>();
		//Preenche a lista
		pets.add(new Pet(1, "Cachorro", "Toto", "Vira Latas", 26, "10/10/2010", "Joaquim", "(19)989030956"));
		pets.add(new Pet(2, "Gato", "Garfo", "Vira Copos", 26, "10/10/2010", "Joaquim", "(19)989030956"));
		pets.add(new Pet(3, "Macaco", "Cesar", "Vira Arvore", 26, "10/10/2010", "Joaquim", "(19)989030956"));
	}

}
