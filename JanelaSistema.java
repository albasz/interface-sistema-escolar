package interfasejanela;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JanelaSistema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				JanelaSistema frame = new JanelaSistema();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public JanelaSistema() {
		setTitle("Sistema Escolar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 540);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// ABAS
		JTabbedPane abas = new JTabbedPane();
		abas.setBounds(10, 10, 780, 480);
		contentPane.add(abas);

		abas.add("Dados Pessoais", painelDados());
		abas.add("Curso", painelCurso());
		abas.add("Notas e Faltas", painelNotas());
		abas.add("Boletim", painelBoletim());
	}

	// ================== DADOS ==================
	private JPanel painelDados() {
		JPanel p = new JPanel(null);

		JLabel lblRGM = new JLabel("RGM:");
		lblRGM.setBounds(20, 20, 80, 25);
		JTextField txtRGM = new JTextField();
		txtRGM.setBounds(100, 20, 150, 25);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(270, 20, 80, 25);
		JTextField txtNome = new JTextField();
		txtNome.setBounds(330, 20, 300, 25);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 60, 80, 25);
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(100, 60, 530, 25);

		JLabel lblEnd = new JLabel("Endereço:");
		lblEnd.setBounds(20, 100, 80, 25);
		JTextField txtEnd = new JTextField();
		txtEnd.setBounds(100, 100, 530, 25);

		JLabel lblMunicipio = new JLabel("Município:");
		lblMunicipio.setBounds(20, 140, 80, 25);
		JTextField txtMunicipio = new JTextField();
		txtMunicipio.setBounds(100, 140, 200, 25);

		JLabel lblUF = new JLabel("UF:");
		lblUF.setBounds(320, 140, 40, 25);
		JComboBox<String> cbUF = new JComboBox<>(new String[]{"SP","RJ","MG","RS"});
		cbUF.setBounds(360, 140, 60, 25);

		JLabel lblCel = new JLabel("Celular:");
		lblCel.setBounds(440, 140, 60, 25);
		JTextField txtCel = new JTextField();
		txtCel.setBounds(500, 140, 130, 25);

		p.add(lblRGM); p.add(txtRGM);
		p.add(lblNome); p.add(txtNome);
		p.add(lblEmail); p.add(txtEmail);
		p.add(lblEnd); p.add(txtEnd);
		p.add(lblMunicipio); p.add(txtMunicipio);
		p.add(lblUF); p.add(cbUF);
		p.add(lblCel); p.add(txtCel);

		return p;
	}

	// ================== CURSO ==================
	private JPanel painelCurso() {
		JPanel p = new JPanel(null);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(20, 20, 80, 25);
		JComboBox<String> cbCurso = new JComboBox<>(new String[]{"ADS","SI","Engenharia"});
		cbCurso.setBounds(100, 20, 200, 25);

		JLabel lblCampus = new JLabel("Campus:");
		lblCampus.setBounds(20, 60, 80, 25);
		JComboBox<String> cbCampus = new JComboBox<>(new String[]{"Tatuapé","Mooca"});
		cbCampus.setBounds(100, 60, 200, 25);

		JLabel lblPeriodo = new JLabel("Período:");
		lblPeriodo.setBounds(20, 100, 80, 25);

		JRadioButton mat = new JRadioButton("Matutino");
		mat.setBounds(100, 100, 100, 25);

		JRadioButton ves = new JRadioButton("Vespertino");
		ves.setBounds(200, 100, 100, 25);

		JRadioButton not = new JRadioButton("Noturno");
		not.setBounds(320, 100, 100, 25);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(mat); grupo.add(ves); grupo.add(not);

		p.add(lblCurso); p.add(cbCurso);
		p.add(lblCampus); p.add(cbCampus);
		p.add(lblPeriodo); p.add(mat); p.add(ves); p.add(not);

		return p;
	}

	// ================== NOTAS ==================
	private JPanel painelNotas() {
		JPanel p = new JPanel(null);

		JLabel lblDisc = new JLabel("Disciplina:");
		lblDisc.setBounds(20, 20, 100, 25);
		JComboBox<String> cbDisc = new JComboBox<>(new String[]{"POO","Banco de Dados"});
		cbDisc.setBounds(120, 20, 200, 25);

		JLabel lblNota = new JLabel("Nota:");
		lblNota.setBounds(20, 60, 100, 25);
		JTextField txtNota = new JTextField();
		txtNota.setBounds(120, 60, 100, 25);

		JLabel lblFaltas = new JLabel("Faltas:");
		lblFaltas.setBounds(20, 100, 100, 25);
		JTextField txtFaltas = new JTextField();
		txtFaltas.setBounds(120, 100, 100, 25);

		p.add(lblDisc); p.add(cbDisc);
		p.add(lblNota); p.add(txtNota);
		p.add(lblFaltas); p.add(txtFaltas);

		return p;
	}

	// ================== BOLETIM ==================
	private JPanel painelBoletim() {
		JPanel p = new JPanel(null);

		String[] colunas = {"Disciplina", "Nota", "Faltas"};
		Object[][] dados = {};

		JTable tabela = new JTable(dados, colunas);
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(20, 20, 700, 300);

		p.add(scroll);

		return p;
	}
}