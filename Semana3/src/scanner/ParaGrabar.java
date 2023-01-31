package scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParaGrabar {

	public static void main(String[] args) throws IOException{
		FileWriter fichero = new FileWriter(".\\prueba");
		
		String nombre;
		String apellido;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Indica el nombre");
			nombre = sc.nextLine();
			System.out.println("Indica el apellido");
			apellido = sc.nextLine();
		}
		
		PrintWriter pw = new PrintWriter(fichero);
		pw.println("NOMBRE=" + nombre);
		pw.println("APELLIDO=" + apellido);
		pw.close();

	}

}
