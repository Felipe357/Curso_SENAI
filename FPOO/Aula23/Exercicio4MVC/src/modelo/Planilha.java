package modelo;

import java.util.ArrayList;

public class Planilha {
	
	private String email;
	private String senha;
	
	public Planilha(String linha) {
		email = linha.split(";")[0];
		senha = linha.split(";")[1];
	}
	
	public boolean validaEmail(String email, ArrayList<Planilha> contas) {
		boolean achou = false;
		for (Planilha usuario : contas) {
			if (this.email.equals(usuario.email)) {
				achou = true;
				break;
			}
		}
		
		return achou;
	}
	
	public boolean validaSenha(String email, String senha, ArrayList<Planilha> contas) {
		boolean validou = false;
		
		for (Planilha usuario : contas) {
			if (this.email.equals(usuario.email) && this.senha.equals(usuario.senha)) {
				validou = true;
				break;
			}
		}
		
		return validou;
	}

}
