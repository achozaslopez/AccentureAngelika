package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Multiplo {
	/**
	 * Cargar dos variables int  con los valores 10 y 20, 
	 * e indicar cual es mayor, si son iguales, o si uno es múltiplo de otro. 
	 * Para probar el programa, ir cargando distintos valores en las variables
	 *  @param args
	 */
	
	/**
	 * Metodo para comprobar si dos números enteros son múltiplos.
	 * Tambien comprueb< si uno es mayor, menor o igual a otro
	 * @param int num1
	 * @param int num2
	 * @return String resultadoFinal
	 */
	public static String calcularMultiplo(int num1, int num2) {

		Boolean mayor = false;
		Boolean igual = false;
		String resultado;
		String resultadoFinal;
		
		//Este bloque comprueba si un numero es mayor, menor o igual al otro
		if (num1 == num2) {
			igual = true;
		}else {
			if(num1 > num2) 
				mayor = true;
			else 
				mayor = false;
		}
		
		//Este bloque comprueba si un numero es múltiplo de otro y lo imprime
		if(num1 % num2 == 0) {
			resultado = num1 + " es múltiplo de " + num2;
		}else if(num2 % num1 == 0) {
			resultado = num2 + " es múltiplo de " + num1;
		}else {
			resultado = "No son múltiplos";
		}
		//Este bloque imprime el resultado del bloque que comprueba si un numero es mayor, menor o igual al otro
		if (Boolean.TRUE.equals(igual)) {
			resultadoFinal = num1 + " es igual a " + num2 + ". " + resultado;
		} else {
			if (Boolean.TRUE.equals(mayor)) {
				resultadoFinal = num1 + " es mayor que " + num2 + ". " + resultado;
			} else {
				resultadoFinal = num1 + " es menor que " + num2 + ". " + resultado;
			}
		}
		return resultadoFinal;
	}
	
	
	public static void main(String[] args) {
		
		/**
		 * LLamo al metodo para comprobar si 10 y 20 son múltiplos y lo muestro por consola
		 */
		String resultado = calcularMultiplo(10,20);
		System.out.println(resultado);
		
		
		

	}

}
