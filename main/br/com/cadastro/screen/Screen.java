package br.com.cadastro.screen;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.UIManager;

import br.com.cadastro.CadastroApplication;
import br.com.cadastro.cliente.Cliente;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen {

	private JFrame frmCadastroDeClientes;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtEmail;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen window = new Screen();
					window.frmCadastroDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeClientes = new JFrame();
		frmCadastroDeClientes.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmCadastroDeClientes.getContentPane().setForeground(Color.BLACK);
		frmCadastroDeClientes.setTitle("Cadastro de Clientes");
		frmCadastroDeClientes.setBounds(100, 100, 509, 318);
		frmCadastroDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeClientes.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(164, 68, 179, 23);
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setToolTipText("");
		frmCadastroDeClientes.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setToolTipText("");
		txtAge.setBounds(164, 133, 33, 23);
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		frmCadastroDeClientes.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroApplication cadastro = new CadastroApplication();
				Cliente cliente = new Cliente();
				cliente.setName(txtName.getText());
				cliente.setEmail(txtEmail.getText());
				cliente.setAge(Integer.parseInt(txtAge.getText()));
				JOptionPane.showMessageDialog(null, cadastro.salvar(cliente.getName(),cliente.getEmail(),cliente.getAge()));
			}
		});
		btnNewButton.setBounds(207, 177, 100, 23);
		frmCadastroDeClientes.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(98, 71, 56, 14);
		lblNewLabel.setEnabled(false);
		frmCadastroDeClientes.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setBounds(98, 102, 56, 14);
		lblEmail.setEnabled(false);
		frmCadastroDeClientes.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(164, 99, 179, 23);
		txtEmail.setToolTipText("");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setColumns(10);
		frmCadastroDeClientes.getContentPane().add(txtEmail);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdade.setBounds(98, 133, 56, 14);
		lblIdade.setEnabled(false);
		frmCadastroDeClientes.getContentPane().add(lblIdade);
		
		lblNewLabel_1 = new JLabel("Swing JAVA");
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(207, 37, 89, 20);
		frmCadastroDeClientes.getContentPane().add(lblNewLabel_1);
	}
}
