package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class DibujoCuadrado {

	public static void main(String[] args) {
		int size = 8; // Le damos el tamaño al cuadrado
		int fila;
		int columna;
		
		for(fila = 1; fila <= size; fila++) {//Creamos un bucle anidado que recorra las filas y las columnas
										//Y rellena el cuadrado de "* "
			for(columna = 1; columna <= size; columna++) {
				System.out.println(" *");
			}
			System.out.println("");
		}

	}

}
