package clienteservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienteTCPSimple {
	
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) throws IOException {
		//Enviamos un mensaje y recibimos respuesta
		System.out.println("Conectado a " + DIRECCION + " por puerto " + PUERTO);
		Socket client = new Socket(DIRECCION, PUERTO);
		//Conseguimos un DataOutputStream, e imprimimos el mensaje en él
		System.out.println("conectado a " + client.getRemoteSocketAddress());
		OutputStream outToServer = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Salucitos desde " + client.getLocalSocketAddress());
		
		InputStream inFromServer = client.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("Me han contestado " + in.readUTF());
		
		client.close();

	}

}
