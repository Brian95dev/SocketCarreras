/**
 * 
 */
package unbosque.edu.co.modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author gomez
 *
 */
public class Cliente {

	/**
	 * Constante que tiene el numero del host en el cual se va a conectar, en este caso localhost
	 */
	final static String HOST="127.0.0.1";
	/**
	 * Constante que tiene el numero del puerto, en este caso 5000
	 */
	final static int PUERTO = 5000;   
	
	/**
	 * <b>Precondiciones:</b> 
	 * <ul>
	 * <li>Crea el escuchador</li>
	 * <li>Crea el escritor</li>
	 * <li>Crea socket con Host y puerto</li>
	 * <li>Envia mensaje al servidor</li>
	 * <li>Imprime el mensaje del servidor</li>
	 * <li>Cierra el servidor</li>
	 * </ul>
	 * Tener una constante o variable  tipo String con el HOST
	 * 
	 * 
	 * @param args por defecto del main
	 */
	public static void main(String[] args) {
		DataInputStream in;
		DataOutputStream out;
		
		try {
			Socket sc = new Socket(HOST, PUERTO);
			
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			out.writeUTF("MENSAJE DESDE CLIENTE");
			
			String mensaje = in.readUTF();
			
			System.out.println(mensaje);
			sc.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
