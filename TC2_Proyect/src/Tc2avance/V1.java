package Tc2avance;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField txtcod;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnNewButton = new JButton("Consultar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(20, 46, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
<<<<<<< HEAD
			txtcod = new JTextField();
			txtcod.setBounds(121, 11, 103, 20);
			contentPane.add(txtcod);
			txtcod.setColumns(10);
=======
			textField = new JTextField();
			textField.setBounds(121, 11, 103, 20);
			contentPane.add(textField);
			textField.setColumns(10);
>>>>>>> 935b28823fa173a892034ad3b535848aa7ad41e0
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 80, 393, 170);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnRegresar = new JButton("Regresar");
			btnRegresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtS.setText("");
<<<<<<< HEAD
					txtcod.setText("");
					txtcod.grabFocus();
=======
					textField.setText("");
					textField.grabFocus();
>>>>>>> 935b28823fa173a892034ad3b535848aa7ad41e0
					
				}
			});
			btnRegresar.setBounds(325, 46, 88, 22);
			contentPane.add(btnRegresar);
		}
		{
			lblNewLabel = new JLabel("Ingresa tu código:");
			lblNewLabel.setBounds(20, 14, 97, 14);
			contentPane.add(lblNewLabel);
		}

	}
	ArregloCurso ac=new ArregloCurso();
	private JButton btnRegresar;
	private JLabel lblNewLabel;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Imprimir("Código de alumno: " + txtcod.getText());
		Imprimir("Alumno: Manuel Alberto Campos Rojas");
		Listado();
	}
	void Listado() {
		Imprimir("NRC\tCurso\tBuscar.\tVacantes disp. \tAdicionar");
		for (int i = 0; i < ac.Tamaño(); i++) {
			Imprimir("" + ac.Obtener(i).getCod() + "\t" + ac.Obtener(i).getNom() +
					 "\t" + ac.Obtener(i).getN1() + "\t" + ac.Obtener(i).getN2());
		}
	}
    void Imprimir(String s) {
    	txtS.append(s+"\n");
    }
}

