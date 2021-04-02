package unbosque.edu.co.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistro extends JPanel{

	private JTextField textoConductor;
	private JTextField textoConeccion;
	private JButton btnIngresar;

	public PanelRegistro () {
		
		setLayout(null);
		setSize(400, 400);
		setBackground(Color.white);
		iniciarComponentes();
		setVisible(false);
		
	}

	private void iniciarComponentes() {
		
		Font font = new Font("Arial Narrow", Font.TRUETYPE_FONT, 18);
		
		JLabel Titulo = new JLabel("REGISTRO");
		Titulo.setFont(new Font("Arial Narrow",font.BOLD,30));
		Titulo.setBounds(120, 50, 250, 40);
		add(Titulo);
		
		JLabel usuario = new JLabel("Nombre del conductor");
		usuario.setFont(font);
		usuario.setBounds(40, 130, 200, 19);
		add(usuario);
		
		JLabel contraseña = new JLabel("Datos de conexiòn");
		contraseña.setFont(font);
		contraseña.setBounds(40, 230, 130, 19);
		add(contraseña);
		
		textoConductor = new JTextField();
		textoConductor.setBounds(40, 170, 300, 30);
		textoConductor.setBackground(new Color(238,238,238));
		textoConductor.setBorder(BorderFactory.createLineBorder(Color.black));
		add(textoConductor);
		
		textoConeccion = new JTextField();
		textoConeccion.setBounds(40, 270, 300, 30);
		textoConeccion.setBackground(new Color(238,238,238));
		textoConeccion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(textoConeccion);
		
		btnIngresar = new JButton();
		ImageIcon imagenFx = new ImageIcon("src/Imagenes/BtnIngresar.png");
		imagenFx = new ImageIcon(imagenFx.getImage().getScaledInstance(250, 41, Image.SCALE_DEFAULT));
		btnIngresar.setBounds(60, 330, 250, 40);
		btnIngresar.setOpaque(false);
		btnIngresar.setBackground(new Color(0, 0, 0, 0));
		btnIngresar.setBorder(null);
		btnIngresar.setIcon(imagenFx);
		btnIngresar.setActionCommand("INICIO_BTN_INGRESAR");
		add(btnIngresar);
	}

	public JTextField getTextoConductor() {
		return textoConductor;
	}

	public void setTextoConductor(JTextField textoConductor) {
		this.textoConductor = textoConductor;
	}

	public JTextField getTextoConeccion() {
		return textoConeccion;
	}

	public void setTextoConeccion(JTextField textoConeccion) {
		this.textoConeccion = textoConeccion;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}
	
	

}
