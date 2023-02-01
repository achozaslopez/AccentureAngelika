package scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		String carpeta = "C:\\";
		String archivo = "lista";
		
		File fichero = new File("C:\\Users\\a.chozas.lopez\\OneDrive - Accenture\\Desktop\\Formacion\\Semana 1\\Java\\Semana3\\src\\scanner");
		try(Scanner leerfichero = new Scanner(fichero)){
			leerfichero.useDelimiter("\n");
			while(leerfichero.hasNext()) {
				String cadena = leerfichero.next();
			System.out.println(cadena + " ");	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
