package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Peaple extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, anoNasc;
	private JButton login;
	
	Peaple(){
		
		setTitle("Tela de Cadastro");
		//	Posisao tela	Largura	Altura
		setBounds(600,400,460,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		nome = new JTextField();
		nome.setBounds(180,20,150,30);
		rotulo2 = new JLabel("Ano de nascimento:");
		rotulo2.setBounds(20,60,120,30);
		anoNasc = new JTextField();
		anoNasc.setBounds(180,60,150,30);
		login = new JButton("Cabraspar");
		login.setBounds(120,100,200,30);
		
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(anoNasc);
		painel.add(login);
	}

	public static void main(String[] args) {
		
		Peaple tela = new Peaple();
		tela.setVisible(true);

	}

}
