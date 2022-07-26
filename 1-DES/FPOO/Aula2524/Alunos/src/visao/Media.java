package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Media extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4;
	private JTextField nome, nota1, nota2, nota3;
	private JButton login;
	
	Media(){
		
		setTitle("Tela de Cadastro");
		//	Posisao tela	Largura	Altura
		setBounds(600,400,460,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		nome = new JTextField();
		nome.setBounds(180,20,150,30);
		
		rotulo2 = new JLabel("Nota 1:");
		rotulo2.setBounds(20,80,120,30);
		nota1 = new JTextField();
		nota1.setBounds(180,80,150,30);
		
		rotulo3 = new JLabel("Nota 2:");
		rotulo3.setBounds(20,120,120,30);
		nota2 = new JTextField();
		nota2.setBounds(180,120,150,30);
		
		rotulo4 = new JLabel("Nota 3:");
		rotulo4.setBounds(20,160,120,30);
		nota3 = new JTextField();
		nota3.setBounds(180,160,150,30);
		
		login = new JButton("Cabraspar");
		login.setBounds(120,250,200,30);
		
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nota1);
		painel.add(rotulo3);
		painel.add(nota2);
		painel.add(rotulo4);
		painel.add(nota3);
		painel.add(login);
	}

	public static void main(String[] args) {
		
		Media tela = new Media();
		tela.setVisible(true);

	}

}


