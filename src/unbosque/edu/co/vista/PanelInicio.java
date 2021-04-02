package unbosque.edu.co.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{

	Image imagen;
	JButton btnInicio;
	
	
	public PanelInicio () {
		setLayout(new BorderLayout());	
		setSize(656,432);
		iniciarComponentes();
		setVisible(true);
		
	}

	private void iniciarComponentes() {
		
		imagen = Toolkit.getDefaultToolkit().createImage("src/Imagenes/Fondo.gif");
		
		 btnInicio = new JButton("INICIAR");
		btnInicio.setBackground(Color.BLACK);
		btnInicio.setFont(new Font("Arial Narrow",Font.BOLD,15));
		btnInicio.setFocusPainted(false); 	
		btnInicio.setForeground(Color.white);
		btnInicio.setActionCommand("INICIO_BTN_INICIAR");
		btnInicio.setVisible(true);
		add(btnInicio,BorderLayout.SOUTH);
		
	}
	
	 @Override
	  public void paintComponent(Graphics g) 
	  {
	    super.paintComponent(g);
	    if (imagen != null) 
	    {
	      g.drawImage(imagen, 0, 0,660,410, this);
	    }
	  }

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}
	 
}
