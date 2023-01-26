package ejercicio070809;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class ArrayUnidimensional {
/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 * @param args
 */
	public static void main(String[] args) {
		String[] palabras = {"este","es","el","último","ejercicio","del","curso","java","básico"};
		System.out.println(mostrarArray(palabras));

	}
	/**
	 * Metodo que recorre el array
	 * @param String[]palabras
	 * @return resultado
	 */
	public static String mostrarArray(String[] palabras) {
		String resultado = "";
		for(int i=0; i< palabras.length;i++) {
			resultado += palabras[i] + " ";
		}
		return resultado;
		
	}
}
