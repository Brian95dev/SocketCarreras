package unbosque.edu.co.controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import unbosque.edu.co.vista.Ventana;

public class Controlador implements ActionListener {

	Ventana ventana;
	/**
	 * Metodo constructor
	 * <b>precondiciones:</b> Ser llamado desde AplMain
	 * <br>
	 * <b>poscondiciones</b> cargar la clase Ventana y tener el action performed de esta 
	 */
	public Controlador() {
		
		ventana = new Ventana();
		asignarOyentes();
	}

	private void asignarOyentes() {
		ventana.getInicio().getBtnInicio().addActionListener(this);
		ventana.getRegistro().getBtnIngresar().addActionListener(this);
	}
	/**
	 * Respuesta a los eventos en los elementos de la interfaz.
	 * 
	 * @param e Evento generado. e != null.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if (command.equals("INICIO_BTN_INICIAR")) {
			
			ventana.setSize(400, 440);
			cambiarPanel(ventana.getRegistro());
			
		}if (command.equals("INICIO_BTN_INGRESAR")) {
			ventana.setSize(900, 600);
			cambiarPanel(ventana.getJuego());
			
		}
		
	}
	/**
	 * Cambia de panel
	 * 
	 * @param panel se pasa el panel como un componente. panel != null.
	 */
	public void cambiarPanel(Component panel) {
		ventana.getContentPane().removeAll();
		ventana.getContentPane().add(panel);
		panel.setVisible(true);
		ventana.getContentPane().repaint();
	}

}
