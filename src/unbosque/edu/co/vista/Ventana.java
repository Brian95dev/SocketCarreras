package unbosque.edu.co.vista;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	PanelInicio inicio;
	PanelRegistro registro;
	PanelJuego juego;
	PanelGanador ganador;
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
		
		ganador = new PanelGanador();
		getContentPane().add(ganador);
		
	
	}

	public PanelGanador getGanador() {
		return ganador;
	}

	public void setGanador(PanelGanador ganador) {
		this.ganador = ganador;
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
