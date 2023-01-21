package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Notas {
	/**
	 * Crear una variable (nota) con el valor 6, 
	 * y decidir el texto que se ha de presentar 
	 * según la siguiente escala.
	 *  @param args
	 */
	
	/**
	 * Metodo que comprueba la calificacion segun el valor de la nota y lo imprime por consola
	 * @param double nota
	 * @return calificacion
	 */
	public static String mostrarNotas(double nota) {
		String calificacion;
		
		if(nota >= 0 && nota < 5) {
			calificacion = "Insuficiente";
		}else if(nota >= 5 && nota < 6) {
			calificacion = "Suficiente";
		}else if(nota >= 6 && nota < 7) {
			calificacion = "Bien";
		}else if(nota >= 7 && nota < 9) {
			calificacion = "Notable";
		}else if(nota >= 9 && nota <= 10) {
			calificacion =  "Sobresaliente";
		}else {
			calificacion = "La nota introducida no es correcta";
		}
		return calificacion;
	}
	public static void main(String[] args) {
		//LLamamos al metodo y lo imprimimos por consola
		String calificacion = mostrarNotas(6);
		System.out.println(calificacion);
		
		

	}

}
