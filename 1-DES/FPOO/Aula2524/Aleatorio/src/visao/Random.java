package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Random extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel rotulo1;
	private JTextField gerar;
	private JButton login;
	
	Random(){
		
		setTitle("Tela de Cadastro");
		//	Posisao tela	Largura	Altura
		setBounds(600,400,460,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("Numeros Gerados:");
		rotulo1.setBounds(20,100,140,20);
		gerar = new JTextField();
		gerar.setBounds(180,70,180,80);
		gerar.setEditable(false);
		
		login = new JButton("Gerar Numeros");
		login.setBounds(120,20,200,30);
		
		painel.add(rotulo1);
		painel.add(gerar);
		painel.add(login);
	}

	public static void main(String[] args) {
		
		Random tela = new Random();
		tela.setVisible(true);

	}

}
