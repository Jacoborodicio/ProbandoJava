import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formulario implements ActionListener
{
	private JFrame ventana = new JFrame();
	private JPanel panel = new JPanel();
	private JButton botonCrear = new JButton("Boton crear");
	private JTextField txt_filas = new JTextField();
	private JTextField txt_columnas = new JTextField();
	private JToolBar barra = new JToolBar("ToolBar");
	private JLabel etq_filas = new JLabel("Filas");
	private JLabel etq_columnas = new JLabel("Columnas");
	private JToolBar SecondBar = new JToolBar("SecondBar");
	private JButton PutRobot = new JButton("Colocar Robot");
	private JButton PutRehenes = new JButton("Colocar Rehenes");
	
	private int filas, columnas;
	
	public Formulario()
	{
		ventana.setTitle("Ventana de PRUEBA");
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
		barra.add(etq_filas);
		barra.add(txt_filas);
		barra.add(etq_columnas);
		barra.add(txt_columnas);
		barra.add(botonCrear);
		botonCrear.addActionListener(this);
		barra.setBounds(10, 10, 80, 30);
		ventana.getContentPane().add(barra, BorderLayout.NORTH);
		ventana.pack();
		ventana.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == botonCrear)
		{
			ventana.remove(barra);
			SecondBar.add(PutRobot);
			SecondBar.add(PutRehenes);
			ventana.getContentPane().add(SecondBar, BorderLayout.NORTH);
			ventana.setVisible(true);
		}
		
	}
	
	
	
	public static void main(String[] args){
		new Formulario();
	}
}