package visao;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Login extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel rotulo0, rotulo1;
	private JTextField email, senha;
	private JButton login;

	Login(){
		//Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		//Conteúdos da tela
		rotulo0 = new JLabel("Email:");
		rotulo0.setBounds(20,20,100,20);
		email = new JTextField();
		email.setBounds(120,20,200,30);
		rotulo1 = new JLabel("Senha:");
		rotulo1.setBounds(20,60,100,20);
		senha = new JTextField();
		senha.setBounds(120,60,200,30);
		login = new JButton("Login");
		login.setBounds(120,100,200,30);
		
		painel.add(rotulo0);
		painel.add(email);
		painel.add(rotulo1);
		painel.add(senha);
		painel.add(login);
	}
	
	public static void main(String[] args) {
		Login tela = new Login();
		tela.setVisible(true);
	}


}
