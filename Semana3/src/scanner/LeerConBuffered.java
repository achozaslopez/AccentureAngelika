package scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LeerConBuffered {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"));
			bw.write("Primera línea de texto");
			bw.newLine();
			bw.write("Segunda línea de texto");
			bw.newLine();
		}catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
			String texto;
			while((texto = br.readLine()) != null) {
				System.out.println(texto);
			}
		}catch(IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}

	}

}
