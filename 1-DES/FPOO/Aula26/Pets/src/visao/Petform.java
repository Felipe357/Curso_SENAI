package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.PetProcess;
import modelo.Pet;

public class Petform extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, especie, nomePet, raca, peso, nascimento, nomeDono, telefone, rotulos, imagem;
	private JTextField tfId, tfNomePet, tfRaca, tfPeso, tfNascimento, tfNomeDono, tfTelefone;
	private JComboBox<String> cbEspecie;
	private JScrollPane rolagem;
	private JTextArea verResultados;
	private JButton create, read, update, delete;
	private String imgIco = "D:\\FPOO\\FPOO\\Aula26\\Pets\\img\\blim.png";
	private String[] imagens = { "D:\\FPOO\\FPOO\\Aula26\\Pets\\img\\dog.jpg",	
			"D:\\FPOO\\FPOO\\Aula26\\Pets\\img\\cat.jpg",
			"D:\\FPOO\\FPOO\\Aula26\\Pets\\img\\mamaco.jpg",
			"D:\\FPOO\\FPOO\\Aula26\\Pets\\img\\pasaro.jpg"};
	private ImageIcon icon;
	private int autoId = PetProcess.pets.size()+1;
	private String texto = "";
	
	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");
	
	Petform() {
		setTitle("Formulário de Pets");
		setBounds(200, 300, 800, 500);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 30);
		painel.add(id);
		especie = new JLabel("Especie:");
		especie.setBounds(20, 50, 120, 30);
		painel.add(especie);
		nomePet = new JLabel("Nome pet:");
		nomePet.setBounds(20, 80, 120, 30);
		painel.add(nomePet);
		raca = new JLabel("Raça:");
		raca.setBounds(20, 110, 120, 30);
		painel.add(raca);
		peso = new JLabel("Peso:");
		peso.setBounds(20, 140, 120, 30);
		painel.add(peso);
		nascimento = new JLabel("Nascimento:");
		nascimento.setBounds(20, 170, 120, 30);
		painel.add(nascimento);
		nomeDono = new JLabel("Nome dono:");
		nomeDono.setBounds(20, 200, 120, 30);
		painel.add(nomeDono);
		telefone = new JLabel("Telefone:");
		telefone.setBounds(20, 230, 120, 30);
		painel.add(telefone);
		rotulos = new JLabel(
				"Id:                          Espécie:             Pet:                     Raça:                   Peso:                   Idade:                  Dono:                   Telefone:");
		rotulos.setBounds(20, 260, 700, 30);
		painel.add(rotulos);

		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(140, 20, 260, 30);
		painel.add(tfId);
		cbEspecie = new JComboBox<String>(new String[] { "Cachorro", "Gato", "Macaco", "Passaro"});
		cbEspecie.setBounds(140, 50, 260, 30);
		painel.add(cbEspecie);
		tfNomePet = new JTextField();
		tfNomePet.setBounds(140, 80, 260, 30);
		painel.add(tfNomePet);
		tfRaca = new JTextField();
		tfRaca.setBounds(140, 110, 260, 30);
		painel.add(tfRaca);
		tfPeso = new JTextField();
		tfPeso.setBounds(140, 140, 260, 30);
		painel.add(tfPeso);
		tfNascimento = new JTextField();
		tfNascimento.setBounds(140, 170, 260, 30);
		painel.add(tfNascimento);
		tfNomeDono = new JTextField();
		tfNomeDono.setBounds(140, 200, 260, 30);
		painel.add(tfNomeDono);
		tfTelefone = new JTextField();
		tfTelefone.setBounds(140, 230, 260, 30);
		painel.add(tfTelefone);
		verResultados = new JTextArea();
		verResultados.setEnabled(false);
		verResultados.setBounds(20, 290, 745, 150);
		verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherAreaDeTexto();
		rolagem = new JScrollPane(verResultados);
		rolagem.setBounds(18, 290, 740, 165);
		painel.add(rolagem);
		imagem = new JLabel();
		imagem.setBounds(510, 145, 150, 115);
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		alternarImagens(0);
		painel.add(imagem);

		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(510, 20, 150, 27);
		read.setBounds(510, 50, 150, 27);
		update.setBounds(510, 80, 150, 27);
		delete.setBounds(510, 110, 150, 27);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);

		
		// ação dos botões
		cbEspecie.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

	}

	private void alternarImagens(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(150, 115, 100));
		imagem.setIcon(icon);
	}
	
	// Creat - CRUD
	
	private void cadastrar() {
		if (tfNomePet.getText().length() !=0 && tfRaca.getText().length() != 0 && tfNascimento.getText().length() != 0 && tfNomeDono.getText().length() != 0 && tfTelefone.getText().length() != 0) {
			PetProcess.pets.add(new Pet(autoId, cbEspecie.getSelectedItem().toString(), tfNomePet.getText(), tfRaca.getText(), Float.parseFloat(tfPeso.getText()), tfNascimento.getText(), tfNomeDono.getText(), tfTelefone.getText()));
			
			autoId++;
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor Preencher todos as informações");
		}
	}
	
	
	int obterIndiceEspecie(String especie) {
		switch(especie) {
		case "Cachorro" : return 0;
		case "Gato" : return 1;
		case "Macaco" : return 2;
		case "Passaro" : return 3;
		default : return -1;
		}
	}
	
	private void deletar() {
		int id = Integer.parseInt(tfId.getText());
		Pet pet = new Pet(id);
		int index = PetProcess.pets.indexOf(pet);
		PetProcess.pets.remove(index);
		preencherAreaDeTexto();
		limparCampos();
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", autoId));
		PetProcess.salvar();
	}
	
	private void buscar() {
		String entrada = JOptionPane.showInputDialog("Digite o Id do animal");
		int id = Integer.parseInt(entrada);
		
		Pet pet = new Pet(id);
		
		if (PetProcess.pets.contains(pet)) {
			int indice = PetProcess.pets.indexOf(pet);
			tfId.setText(PetProcess.pets.get(indice).getId("s"));
			cbEspecie.setSelectedIndex(obterIndiceEspecie(PetProcess.pets.get(indice).getEspecie()));
			tfNomePet.setText(PetProcess.pets.get(indice).getNomePet());
			tfRaca.setText(PetProcess.pets.get(indice).getRaca());
			tfNascimento.setText(PetProcess.pets.get(indice).getNascimento("s"));
			tfNomeDono.setText(PetProcess.pets.get(indice).getNomeDono());
			tfTelefone.setText(PetProcess.pets.get(indice).getTelefone());
			tfPeso.setText(PetProcess.pets.get(indice).getPeso("s"));
			
			create.setEnabled(false);
			update.setEnabled(true);
			delete.setEnabled(true);
			
		}else {
			System.out.println("Bicho não encontrado");
		}

	}
	
	private void alterar() {
		int id = Integer.parseInt(tfId.getText());
		Pet pet = new Pet(id);
		int indice = PetProcess.pets.indexOf(pet);
		if (tfNomePet.getText().length() != 0 && tfRaca.getText().length() != 0 && tfPeso.getText().length() != 0
				&& tfNascimento.getText().length() != 0 && tfNomeDono.getText().length() != 0
				&& tfTelefone.getText().length() != 0) {

			// Converter o peso no formato Brasileiro usando virgula como decimal
			df.setCurrency(Currency.getInstance(BRASIL));
			float peso;
			try {
				peso = Float.parseFloat(df.parse(tfPeso.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				peso = 0;
			}

			PetProcess.pets.set(indice, new Pet(id, cbEspecie.getSelectedItem().toString(), tfNomePet.getText(),
					tfRaca.getText(), peso, tfNascimento.getText(), tfNomeDono.getText(), tfTelefone.getText()));
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", autoId));
		PetProcess.salvar();
	}
	
	private void limparCampos() {
		tfNomePet.setText(null);
		tfRaca.setText(null);
		tfPeso.setText(null);
		tfNascimento.setText(null);
		tfNomeDono.setText(null);
		tfTelefone.setText(null);
	}
	
	private void preencherAreaDeTexto() {
		texto = "";
		for (Pet p : PetProcess.pets) {
			texto += p.toString()+"\n";
		}
		verResultados.setText(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbEspecie) {
			alternarImagens(cbEspecie.getSelectedIndex());
		}
		
		if (e.getSource() == create) {
			cadastrar();
		}
		
		if (e.getSource() == read) {
			buscar();
		}
		
		if (e.getSource() == delete) {
			deletar();
		}
		
		if (e.getSource() == update) {
			alterar();
		}
	}

	public static void main(String[] agrs) {

		PetProcess.abrir();
		new Petform().setVisible(true);
	}

}