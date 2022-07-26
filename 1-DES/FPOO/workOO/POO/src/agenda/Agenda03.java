package agenda;

public class Agenda03 {

	public static void main(String[] args) {
		
		Contato c1 = new Contato(10,"Marcos",13,"(19)99898-9898");
		
		Contato c2 = new Contato(30,"jaqueline",19,"(19)99898-9898");
		
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}
}
