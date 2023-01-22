package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class FechaV3 {
	/**
	 * En la tercera version, utilizar arrays
	 *  @param args
	 * @return 
	 */
	
	/**
	 * Metodo que comprueba si una fecha tiene el formato correcto
	 * @param int dia
	 * @param int mes
	 * @param int anio
	 * @return String resultado
	 */
	public static String comprobarFecha(int dia, int mes, int anio) {
		String resultado = "";
		
		int[] diaMes = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31}; // Creamos un array con los dias que tiene cada mes
		
		/*
		 * En este bloque recorremos el array
		 * primero comprueba que el mes sea un número entre 1 y 12,
		 * que el año sea distinto de cero
		 * y que el día sea menor o igual que es array que recorre
		 * indicamos que la posición en el array es mes-1 ya que la primera posición en un array
		 * siempre es 0 con lo cual para que coincida con el mes debemos restarle 1
		 * */
		
		if(mes >= 1 && mes <= 12) {
			if(anio != 0) {
				if(dia <= diaMes[mes-1]) {
					resultado = "La fecha es correcta"; //Si el día, el mes y el año son correctos, imprime esto
				}else {
					resultado = "El día es incorrecto";//Si el día es incorrecto, imprime esto
				}
			}else {
				resultado = "El año es incorrecto";//Si el año es incorrecto, imprime esto
			}
		}else {
			resultado = "El mes es incorrecto";//Si el mes es incorrecto, imprime esto
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		/**
		 * LLamamos al método combrobarFecha();
		 * e imprimimos el resultado
		 */
		String resultado = comprobarFecha(20,8,2015);
		System.out.println(resultado);

	}

}
