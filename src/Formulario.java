import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formulario implements ActionListener
{
	// Marco
	private JFrame ventana = new JFrame();			
	
	// Primera barra y componentes
	private JToolBar barra = new JToolBar("ToolBar");
	private JButton botonCrear = new JButton("Boton crear");
	private JTextField txt_filas = new JTextField();
	private JTextField txt_columnas = new JTextField();
	private JLabel etq_filas = new JLabel("Filas");
	private JLabel etq_columnas = new JLabel("Columnas");
	
	// Segunda barra y componentes
	private JToolBar SecondBar = new JToolBar("SecondBar");
	private JButton PutRobot = new JButton("Colocar Robot");
	private JButton PutRehenes = new JButton("Colocar Rehenes");
	
	// Para la posterior creacion del tablero
	private int filas, columnas;
	
	/***** Comprobacion de la lectura de los JTexFields ******/
	private String fils, cols;
	/*********************************************************/
	
	public Formulario()
	{
		// Le ponemos un title a nuestro JFrame
		ventana.setTitle("Ventana de PRUEBA");
		
		// Para poder cerrar la aplicacion en el close_Icon
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		
		// Para ampliar nuestro JFrame al maximo
		ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
		
		/* Modificamos nuestra primera JToolBar */
		barra.add(etq_filas);
		barra.add(txt_filas);
		barra.add(etq_columnas);
		barra.add(txt_columnas);
		barra.add(botonCrear);
		
		// Añadimos la "escucha"
		botonCrear.addActionListener(this);
		
		// Modificamos su tamaño 
		barra.setBounds(10, 10, 80, 30);
		
		// Cargamos nuestra JToolBar en el JFrame, al TOP
		ventana.getContentPane().add(barra, BorderLayout.NORTH);
		/******************************************/
		
		// Llama al getPreferredSize() de los componentes internos y hace que la 
		// ventana coja el tamaño justo para visualizarlo todo bien
		ventana.pack();
		
		// Hacemos visible nuestro JFrame
		ventana.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		// En el caso de que el boton pulsado sea botonCrear
		if(evento.getSource() == botonCrear)
		{
			// Leemos datos de los JTextFields y realizamos el casting 
			// para guardarlos en nuestras variables(Integer)
			filas = Integer.parseInt(txt_filas.getText());
			columnas = Integer.parseInt(txt_columnas.getText());
			
			// Removemos la primera JToolBar
			ventana.remove(barra);
			
			// Añadimos los botones a la segunda JToolBar
			SecondBar.add(PutRobot);
			SecondBar.add(PutRehenes);
			
			// Cargamos en el "contenedor" por defecto de nuestro JFrame
			// la segunda JToolBar en el borde TOP
			ventana.getContentPane().add(SecondBar, BorderLayout.NORTH);
			
			/******************************************************************
			 * *** Comprobación para ver que se han leído bien los datos de las
			 * 	   filas y columnas desde los textFields***********************
			 * ****************************************************************/
			fils = String.valueOf(filas);
			cols = String.valueOf(columnas);
			etq_filas.setText(fils);
			etq_columnas.setText(cols);
			ventana.getContentPane().add(etq_filas, BorderLayout.LINE_START);
			ventana.getContentPane().add(etq_columnas, BorderLayout.LINE_END);
			/*******************************************************************/
			
			//Hacemos visible nuestro JFrame
			ventana.setVisible(true);
		}
		
	}
	
	
	
	public static void main(String[] args){
		new Formulario();
	}
}