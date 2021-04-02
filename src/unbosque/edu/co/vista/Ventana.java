package unbosque.edu.co.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	PanelInicio inicio;
	PanelRegistro registro;
	PanelJuego juego;

	public Ventana() {
		setSize(660, 470);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicioiarComponentes();
		setTitle("CARRERA");
		setVisible(true);		
	
		
	}

	private void inicioiarComponentes() {
		
		inicio = new PanelInicio();
		getContentPane().add(inicio);
 
		registro = new PanelRegistro();
		getContentPane().add(registro);
		
		juego = new PanelJuego();
		getContentPane().add(juego);
		
	
	}

	public PanelInicio getInicio() {
		return inicio;
	}

	public void setInicio(PanelInicio inicio) {
		this.inicio = inicio;
	}

	public PanelRegistro getRegistro() {
		return registro;
	}

	public void setRegistro(PanelRegistro registro) {
		this.registro = registro;
	}

	public PanelJuego getJuego() {
		return juego;
	}

	public void setJuego(PanelJuego juego) {
		this.juego = juego;
	}

	
		
	

}
