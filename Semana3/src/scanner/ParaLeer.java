package scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ParaLeer {

	public static void main(String[] args) throws IOException {
		File fichero = new File(".\\prueba");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String nombre= "";
		String apellido = "";
		String lectura = "";
		
		while((lectura = br.readLine()) != null) {
			String datos[] = lectura.split("=");
			
			if(datos[0].equals("NOMBRE")) {
				nombre = datos[1];
			}
			
			if(datos[0].equals("APELLIDO")) {
				apellido = datos[1];
			}
		}
		
		System.out.println(nombre + " " + apellido);

	}

}
