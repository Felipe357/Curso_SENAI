package visao;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.ProcessaManutencoes;
import modelo.Manutencao;

public class FormManutencoes extends JFrame implements ActionListener{
	
	private JPanel painel;
	private JLabel id, data, equipamento, tempo, custoTempo, vrID, vrData, vrEquipamento, vrTempo, vrCustoTempo, vrTotal;
	private JTextField tfId, tfData, tfTempo, tfCustoTempo;
	
	private JComboBox<String> Equipamentos;
	private JTextArea verResultado;
	private JButton cadastrar, buscar, deletar, alterar;
	//
	private int autoId = ProcessaManutencoes.manutencoes.size() + 1;
	private String texto = "";
	private String data2 = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	//
	FormManutencoes(){
		setTitle("Registro de Manuteções");
		setBounds(100, 100, 650, 600);
		painel = new JPanel();
		painel.setBackground(new Color(199, 199, 199));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		id = new JLabel("*Id");
		id.setBounds(20, 50, 120, 30);
		tfId = new JTextField(String.format("%d" , autoId));
		tfId.setBounds(140, 55, 255, 30);
		tfId.setEditable(false);
		
		data = new JLabel("*Data");
		data.setBounds(20, 90, 120, 30);
		tfData = new JTextField(data2);
		tfData.setBounds(140, 95, 255, 30);
		tfData.setEditable(false);
		
		equipamento = new JLabel("*Equipamento");
		equipamento.setBounds(20, 125, 120, 30);
		Equipamentos = new JComboBox<String>(new String[] { "impressora", "esteira", "braço hidraulico" });
		Equipamentos.setBounds(140, 130, 255, 30);
		
		tempo = new JLabel("*Tempo (hora)");
		tempo.setBounds(20, 165, 120, 30);
		tfTempo = new JTextField();
		tfTempo.setBounds(140, 165, 255, 30);
		
		custoTempo = new JLabel("*Custo (hora)");
		custoTempo.setBounds(20, 200, 120, 30);
		tfCustoTempo = new JTextField();
		tfCustoTempo.setBounds(140, 200, 255, 30);
		
		verResultado = new JTextArea();
		verResultado.setBounds(10, 350, 610, 200);
		verResultado.setEnabled(false);
		verResultado.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherAreaDeTexto();
		
		cadastrar = new JButton("Cadastrar");
		buscar = new JButton("Buscar");
		alterar = new JButton("Alterar");
		deletar = new JButton("Apagar");
		cadastrar.setBounds(455, 55, 110, 30);
		buscar.setBounds(455, 100, 110, 30);
		deletar.setBounds(455, 150, 110, 30);
		alterar.setBounds(455, 200, 110, 30);
		alterar.setEnabled(false);
		deletar.setEnabled(false);
		
		painel.add(id);
		painel.add(tfId);
		
		painel.add(data);
		painel.add(tfData);
		
		painel.add(equipamento);
		painel.add(Equipamentos);
		
		painel.add(tempo);
		painel.add(tfTempo);
		
		painel.add(custoTempo);
		painel.add(tfCustoTempo);
		
		painel.add(verResultado);
		
		painel.add(cadastrar);
		painel.add(deletar);
		painel.add(alterar);
		painel.add(buscar);
		
		cadastrar.addActionListener(this);
		alterar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		
	}
	
	
	
	int obterEquipamento(String equi) {
		switch (equi) {
		case "impressora":
			return 0;
		case "esteira":
			return 1;
		case "braço hidraulico":
			return 2;
		default:
			return -1;
		}
	}
	
	private void limparCampos() {
		tfTempo.setText(null);
		tfData.setText(null);
		tfCustoTempo.setText(null);
	}
	
	private void preencherAreaDeTexto() {
		texto = "";
		for (Manutencao p : ProcessaManutencoes.manutencoes) {
			texto += p.toString()+"\n";
		}
		verResultado.setText(texto);
	}
	
	private void cadastrar() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		
		if (tfCustoTempo.getText().length() !=0 && tfTempo.getText().length() !=0) {
			
			ProcessaManutencoes.manutencoes.add(new Manutencao(autoId , data, Equipamentos.getSelectedItem().toString(),
					Double.parseDouble(tfCustoTempo.getText().toString()),Double.parseDouble(tfTempo.getText())));
		} else {
			JOptionPane.showMessageDialog(this, "Favor Preencher todos as informações");
		}
		
		autoId++;
		limparCampos();
		preencherAreaDeTexto();
		ProcessaManutencoes.salvar();
	}
	
	private void buscar() {
		String entrada = JOptionPane.showInputDialog(this,"Digite o id da Manutenção");

		boolean isNumeric = true;
		if (entrada != null) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					isNumeric = false;
				}
			}
		}else {
			isNumeric = false;
		}
		if (isNumeric) {
			int id = Integer.parseInt(entrada);
			
			boolean achou = false;
			for (Manutencao manu : ProcessaManutencoes.manutencoes) {
				if (manu.getId() == id) {
					achou = true;
					int indice = ProcessaManutencoes.manutencoes.indexOf(manu);
					tfId.setText(ProcessaManutencoes.manutencoes.get(indice).getId("s"));
					tfData.setText(ProcessaManutencoes.manutencoes.get(indice).getData());
					Equipamentos.setSelectedIndex(obterEquipamento(ProcessaManutencoes.manutencoes.get(indice).getEquipamento()));
					tfCustoTempo.setText(ProcessaManutencoes.manutencoes.get(indice).getCustoHora("s"));
					tfTempo.setText(ProcessaManutencoes.manutencoes.get(indice).getTempoGasto("s"));
					ProcessaManutencoes.salvar();
					cadastrar.setEnabled(false);
					alterar.setEnabled(true);
					deletar.setEnabled(true);
					break;
				}
			}
			
			if (!achou) {
				JOptionPane.showMessageDialog(this, "não encontrado");
			}
				
			
		}

	}
	
	private void alterar() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		
		for (Manutencao manu : ProcessaManutencoes.manutencoes) {
			indice = ProcessaManutencoes.manutencoes.indexOf(manu);
		}
		
		if (tfCustoTempo.getText().length() !=0 && tfTempo.getText().length() !=0) {

			ProcessaManutencoes.manutencoes.set(indice, new Manutencao(id, data, Equipamentos.getSelectedItem().toString(),
					Double.parseDouble(tfCustoTempo.getText().toString()),Double.parseDouble(tfTempo.getText())));
			preencherAreaDeTexto();
			limparCampos();
			
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		deletar.setEnabled(false);
		tfId.setText(String.format("%d", ProcessaManutencoes.manutencoes.size() + 1));
		ProcessaManutencoes.salvar();
	}
	
	private void deletar() {
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		for (Manutencao manu : ProcessaManutencoes.manutencoes) {
			if (manu.getId() == id) {
				indice = ProcessaManutencoes.manutencoes.indexOf(manu);
			}
		}
		
		ProcessaManutencoes.manutencoes.remove(indice);
		preencherAreaDeTexto();
		limparCampos();
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		deletar.setEnabled(false);
		ProcessaManutencoes.salvar();
		tfId.setText(String.format("%d", ProcessaManutencoes.manutencoes.size() + 1));
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastrar) {
			cadastrar();
		}
		
		if (e.getSource() == buscar) {
			buscar();
		}
		
		if (e.getSource() == deletar) {
			deletar();
		}
		
		if (e.getSource() == alterar) {
			alterar();
		}
	}

	public static void main(String[] args) {
		
		ProcessaManutencoes.abrir();
		new FormManutencoes().setVisible(true);
		
	}

}
