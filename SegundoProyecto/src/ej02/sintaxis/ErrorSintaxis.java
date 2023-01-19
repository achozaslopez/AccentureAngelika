package ej02.sintaxis;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class ErrorSintaxis {
/**
 * Escribe una clase
 * Copia y pega estas lineas
 * Comprueba si dan error, y porqué 
 * @param args
 */
	public static void main(String[] args) {
		int $nombre;
		 int PasaDo;
		// -> int alcance Falta poner ";" al final de la declaración
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		// -> pasado=_contador; Esta mal escrito el nombre de la variable

		 System.out.println($nombre + " / " + _contador);

	}

}
