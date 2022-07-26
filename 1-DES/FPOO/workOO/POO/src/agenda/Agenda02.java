package agenda;

public class Agenda02 {

	public static void main(String[] args) {
		Contato c1 = new Contato();
		
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		c1.telefone = "(19)9898-9898";
		
		Contato c2 = new Contato();
		
		c2.id = 23;
		c2.nome = "Marcos";
		c2.idade = 35;
		c2.telefone = "(19)9898-9898";
		
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}
}
