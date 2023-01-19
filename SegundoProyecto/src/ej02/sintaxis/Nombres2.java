package ej02.sintaxis;
/**
 * 
 * @author Angelika Chozas López
 *
 */

public class Nombres2 {
	/**
	 * Modifica la clase que has creado en el ejercicio anterior, 
	 * para que desaparezcan los errores, 
	 * añádele un comentario en la misma linea en donde hagas la modificación 
	 * explicando la modificación hecha
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Corrección y modificación del ejercicio para Sonar
		 * */
		int contador = 25;//He eliminado el simbolo "_" del nombre de la variable
		int nombre = contador; //He eliminado el simbolo $ del nombre de la variable (Sonar)
		
		/*
		 * He eliminado las variables "pasado" y "alcance" ya que no se les
		 * daba uso
		 * 
		*/

		 System.out.println(nombre + " / " + contador);

	}

}
