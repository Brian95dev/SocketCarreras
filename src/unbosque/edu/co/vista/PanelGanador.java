package unbosque.edu.co.vista;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 * Panel donde guarmos el fondo de la ventana.
 */
public class PanelGanador extends JPanel{

	private Image imagen;
	
	
	/**
	 * Metodo constructor
	 * <b>precondiciones:</b> Ser llamado desde Ventana
	 * <br>
	 * <b>poscondiciones</b> cargar las caracteristicas y tener el paint component de esta 
	 */
	public PanelGanador () {
		setLayout(null);	
		setSize(656,432);
		iniciarComponentes();
		setVisible(false);
		
	}

	private void iniciarComponentes() {
		
		imagen = Toolkit.getDefaultToolkit().createImage("src/Imagenes/victoria.gif");

	}
	/**
	 * Repintado de la interfaz
	 * 
	 * @param g repintar. g != null.
	 */
	 @Override
	  public void paintComponent(Graphics g) 
	  {
	    super.paintComponent(g);
	    if (imagen != null) 
	    {
	      g.drawImage(imagen, 0, 0,660,410, this);
	    }
	  }
}
