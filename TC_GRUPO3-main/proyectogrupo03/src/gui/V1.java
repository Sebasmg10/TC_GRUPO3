package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import arreglos.Arreglonrc;
import clases.Nrc;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtcodigo;
	private JLabel lblNewLabel_1;
	private JTextField txtcantidadmaxima;
	private JLabel lblNewLabel_2;
	private JTextField txtcantidadactual;
	private JLabel lblNewLabel_3;
	private JTextField txtnombrecurso;
	private JLabel lblNewLabel_4;
	private JTextField txtdatosdocente;
	private JPanel panel_1;
	private JTextArea txts;
	private JPanel panel_2;
	private JButton BTNAGREGAR;
	private JButton btnNewButton_2;
	private final JButton BTNREPORTAR = new JButton("REPORTAR");

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
		setBounds(100, 100, 661, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(new Color(255, 255, 0));
			panel.setBorder(new TitledBorder(null, "Ingresar datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 637, 171);
			contentPane.add(panel);
			panel.setLayout(new GridLayout(0, 2, 0, 0));
			{
				lblNewLabel = new JLabel("INGRESAR CODIGO NRC");
				panel.add(lblNewLabel);
			}
			{
				txtcodigo = new JTextField();
				panel.add(txtcodigo);
				txtcodigo.setColumns(10);
			}
			{
				lblNewLabel_1 = new JLabel("INGRESAR CANT. MAX. ALUM.");
				panel.add(lblNewLabel_1);
			}
			{
				txtcantidadmaxima = new JTextField();
				panel.add(txtcantidadmaxima);
				txtcantidadmaxima.setColumns(10);
			}
			{
				lblNewLabel_2 = new JLabel("INGRESAR CANT. ACT. ALUM.");
				panel.add(lblNewLabel_2);
			}
			{
				txtcantidadactual = new JTextField();
				panel.add(txtcantidadactual);
				txtcantidadactual.setColumns(10);
			}
			{
				lblNewLabel_3 = new JLabel("INGRESAR NOMBRE DEL CURSO");
				panel.add(lblNewLabel_3);
			}
			{
				txtnombrecurso = new JTextField();
				panel.add(txtnombrecurso);
				txtnombrecurso.setColumns(10);
			}
			{
				lblNewLabel_4 = new JLabel("INGRESAR DATOS DEL DOCENTE");
				panel.add(lblNewLabel_4);
			}
			{
				txtdatosdocente = new JTextField();
				panel.add(txtdatosdocente);
				txtdatosdocente.setColumns(10);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 0));
			panel_1.setBorder(new TitledBorder(null, "Datos del curso", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 264, 637, 139);
			contentPane.add(panel_1);
			panel_1.setLayout(new GridLayout(1, 0, 0, 0));
			{
				txts = new JTextArea();
				panel_1.add(txts);
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 0));
			panel_2.setBorder(new TitledBorder(null, "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 188, 637, 72);
			contentPane.add(panel_2);
			panel_2.setLayout(new GridLayout(1, 0, 0, 0));
			{
				BTNREPORTAR.addActionListener(this);
				BTNAGREGAR = new JButton("AGREGAR");
				BTNAGREGAR.addActionListener(this);
				panel_2.add(BTNAGREGAR);
				panel_2.add(BTNREPORTAR);
			}
			{
				btnNewButton_2 = new JButton("BUSCAR");
				panel_2.add(btnNewButton_2);
			}
		}

	}
	Arreglonrc ar = new Arreglonrc();
	int Leercodigo() 
	{
		return Integer.parseInt(txtcodigo.getText());
	}
	int Leercantmax() 
	{
	 return	Integer.parseInt(txtcantidadmaxima.getText());
	}
	int Leercantact() 
	{
		return Integer.parseInt(txtcantidadactual.getText());
	}
	String LeerNombreCurso() 
	{
		return txtnombrecurso.getText();
	}
	String Leerdatosdocente() 
	{
		return txtdatosdocente.getText();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BTNREPORTAR) {
			do_bTNREPORTAR_actionPerformed(e);
		}
		if (e.getSource() == BTNAGREGAR) {
			do_bTNAGREGAR_actionPerformed(e);
		}
	}
	protected void do_bTNAGREGAR_actionPerformed(ActionEvent e) {
		try{
			if (Leercantact() > Leercantmax()) {
		        JOptionPane.showMessageDialog(null, "LA CANTIDAD ACTUAL ES MAYOR A LA CANTIDAD MAXIMA. REVISE LOS DATOS NUEVAMENTE.");
		        return; 
		    }
			Nrc n1 = ar.Buscar(Leercodigo()); 
	        if (n1==null) 
	        {
	        	txts.append("");
		Nrc n11 = new  Nrc(Leercodigo(), Leercantmax(), Leercantact(), LeerNombreCurso(), Leerdatosdocente());
		ar.Adicionar(n11);
		JOptionPane.showMessageDialog(null, "Se agregó correctamente");
		txtnombrecurso.setText("");
		txtcantidadmaxima.setText("");
		txtcantidadactual.setText("");
		txtcodigo.setText("");
		txtdatosdocente.setText("");
		} 
	         else
	            {
	            JOptionPane.showMessageDialog(null, "El NRC ya existe.");
	            }
	        }
	       
		catch (Exception ex)
	        {
	        JOptionPane.showMessageDialog(null, "Verifique los datos.");
	        }
	}
	protected void do_bTNREPORTAR_actionPerformed(ActionEvent e) {
		if  (ar.Tamaño() == 0) {
			 txts.setText("");
			 txts.append("No existen cursos registrados.");
		} else {
			txts.setText("");
			txts.append("\t--- REPORTE DE CURSOS ---\n");
			txts.append("--------------------------  --------------------------------------------------------------------------------------\n");
			txts.append("NRC\tCANTMAX\tCANTACTALUM\tCURSO\tDOCENTE\n");  
		    for (int i = 0; i < ar.Tamaño(); i++) {
		        Nrc nrcs = ar.Obtener(i);
		        txts.append(nrcs.getCodigo()+"\t"+nrcs.getCant_max()+"\t"+nrcs.getCant_actu()+"\t\t"+nrcs.getNombreCurso()+"\t"+nrcs.getDocente()+"\n");
		    }
		   
		}
		
	}
}
