package unbosque.edu.co.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PanelJuego extends JPanel{

	
	private JLabel conductor;
	private JLabel conductor1;
	private JLabel conductor2;
	private JLabel conductor3;
	private JProgressBar jb;
	private JProgressBar jb2;
	private JProgressBar jb3;
	private JProgressBar jb4;

	

	public PanelJuego() {
		
		setLayout(null);
		setSize(900, 600);
		setBackground(Color.white);
		iniciarComponentes();
		setVisible(false);
	}

	private void iniciarComponentes() {
		
		
		
		 conductor = new JLabel(" Conductor");
		conductor.setBorder(BorderFactory.createLineBorder(Color.blue));
		conductor.setBounds(30, 20, 180, 20);
		add(conductor);
		
		 conductor1 = new JLabel(" Conductor");
		conductor1.setBorder(BorderFactory.createLineBorder(Color.red));
		conductor1.setBounds(30, 50, 180, 20);
		add(conductor1);
		
		 conductor2 = new JLabel(" Conductor");
			conductor2.setBorder(BorderFactory.createLineBorder(Color.black));
			conductor2.setBounds(30, 80, 180, 20);
			add(conductor2);
			
			 conductor3 = new JLabel(" Conductor");
				conductor3.setBorder(BorderFactory.createLineBorder(Color.yellow));
				conductor3.setBounds(30, 110, 180, 20);
				add(conductor3);
		
				   ImageIcon imagen1 = new ImageIcon ("src/Imagenes/1.jpg");
			         ImageIcon imagen2 = new ImageIcon ("src/Imagenes/2.jpg");
			         ImageIcon imagen3 = new ImageIcon ("src/Imagenes/3.jpg");
			         ImageIcon imagen4 = new ImageIcon ("src/Imagenes/4.jpg");       
			         ImageIcon imagen5 = new ImageIcon ("src/Imagenes/Bandera.png");

				
			         JLabel label = new JLabel (imagen1);
			         label.setBounds(20, 180, 134, 54);
			         add(label);
			         JLabel label2 = new JLabel (imagen2);
			         label2.setBounds(20, 280, 143, 52);
			         add(label2);
			         JLabel label3 = new JLabel (imagen3);
			         label3.setBounds(20, 380, 142, 51);
			         add(label3);
			         JLabel label4 = new JLabel (imagen4);
			         label4.setBounds(20, 480, 130, 41);
			         add(label4);
			         
			         JLabel labelB=new JLabel(imagen5);
			         labelB.setBounds(680, 310, 190, 100);
			         add(labelB);
				 jb= new JProgressBar(0,100);
				 jb.setBounds(170, 200, 500, 20);
				 jb.setValue(0);
				 jb.setStringPainted(true);
				 add(jb);
				 
				 jb2= new JProgressBar(0,100);
				 jb2.setBounds(170, 300, 500, 20);
				 jb2.setValue(0);
				 jb2.setStringPainted(true);
				 add(jb2);
				 
				 jb3= new JProgressBar(0,100);
				 jb3.setBounds(170, 400, 500, 20);
				 jb3.setValue(0);
				 jb3.setStringPainted(true);
				 add(jb3);
				 
				 jb4= new JProgressBar(0,100);
				 jb4.setBounds(170, 500, 500, 20);
				 jb4.setValue(0);
				 jb4.setStringPainted(true);
				 add(jb4);
	
				 
				 label= new JLabel();
	}
	
	
	public void iterate(){   
		int i = 0;
		while(i<=2000){    
		  jb.setValue(i);    
		  i=i+20;    
		  try{Thread.sleep(150);}catch(Exception e){}    
		}    
		}
	
   
    
	
}
