package ej02.sintaxis;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Nombre3 {
	/**
	 *  Modifica la clase «Nombre2» añádele 
	 *  un comentario de varias lineas explicando lo que hace la clase,
	 *  y haz que imprima el siguiente texto, exactamente igual	 
	 *  @param args
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
		 /*
		  *Uso la secuencia de escape \" para añadir las comillas simples a la palabra Java
		  *Uso la secuencia de escape \n para añadir saltos de linea  
		 */
		 System.out.println("En \"Java\" puede\n que tengamos que utilizar\n caracteres especiales");

	}

}
