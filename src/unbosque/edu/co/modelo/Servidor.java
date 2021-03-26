/**
 * 
 */
package unbosque.edu.co.modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gomez
 *
 */
public class Servidor {
	
	/**
	 * Constante que tiene el numero del puerto, en este caso 5000
	 */
	final static int PUERTO = 5000;
	
	/**
	 * <b>Precondiciones:</b> Debemos tener una constante o variable entera con el nombre PUERTO y 
	 * con un numero de puerto, debemos estar atentos que el puerto del computador se encuentre libre
	 * 
	 * <b>Poscondiciones:</b> 
	 * <ol>
	 * 		<li>Crear ServerSocket</li> 
	 * 		<li>Crear escuchadores de clientes</li> 
	 * 		<li>Crear escritores de clientes</li>
	 * 		<li>Cerrar clientes</li>
	 * 		<li>Cerrar servidor</li>
	 * </ol>
	 * @param args por defecto del main
	 */
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(PUERTO);
			Socket sc = null;
			DataInputStream in;
			DataOutputStream out;
			System.out.println("Servidor iniciado");
			int competidores = 0;
			
			while(competidores < 5) {
				sc = servidor.accept();
				
				System.out.println("Cliente conectado");
				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());
				
				String mensaje = in.readUTF();
				System.out.println(mensaje);
				out.writeUTF("Hola mundo desde SERVIDOR");
				
				competidores = competidores+1;
				sc.close();
				System.out.println("Cliente cerrado");
			}
			
			if (competidores == 4) {
				//Dirigirse a la logica de competición
				System.out.println("COMIENZA LA CARRERA");
			}
			servidor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
