package ejercicio03;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Ejercicio3 {
	/**
	 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
	 * Tened en cuenta que los textos pueden venir de un array de tipo String.
	 * @param args
	 */
	
	public static void main(String[] args) {
		String [] animales = {"perro","gato","gallina","pez","conejo"};
		System.out.println(concatenarTexto(animales));

	}
	
	public static String concatenarTexto(String[] cadena) {
		String resultado = "";
		for(int i=0; i < cadena.length; i++) {
			resultado += cadena[i] + ", ";
		}
		return resultado;

	}
}	
