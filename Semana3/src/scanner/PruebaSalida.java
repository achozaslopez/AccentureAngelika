package scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido: ");
		String apellido1 = sc.nextLine();
		
		try(FileWriter fw = new FileWriter("datos.txt")){
			fw.write(nombre + " " + apellido1);
			System.out.println("Datos guardados en el archivo datos.txt");
		}catch(IOException e) {
			System.out.println("Error al guardar los datos en el archivo datos.txt");
		}

	}

}
