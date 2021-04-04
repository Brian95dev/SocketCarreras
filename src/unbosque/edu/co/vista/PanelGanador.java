package unbosque.edu.co.vista;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 * Panel donde guarmos el fondo de la ventana.
 */
public class PanelGanador extends JPanel{

	
	private Image imagenx;

	public PanelGanador () {
		setLayout(null);	
		setSize(656,432);
		iniciarComponentes();
		setVisible(false);
		
	}

	private void iniciarComponentes() {
		
		imagenx = Toolkit.getDefaultToolkit().createImage("src/Imagenes/victoria.gif");

	}
	 @Override
	  public void paintComponent(Graphics g) 
	  {
	    super.paintComponent(g);
	    if (imagenx != null) 
	    {
	      g.drawImage(imagenx, 0, 0,660,410, this);
	    }
	  }
}
