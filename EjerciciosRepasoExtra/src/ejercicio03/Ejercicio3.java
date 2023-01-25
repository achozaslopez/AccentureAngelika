package ejercicio03;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Ejercicio3 {

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
