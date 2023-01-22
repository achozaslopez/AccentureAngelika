package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class FechaV4 {
	/**
	 * En la cuarta version, tened en cuenta los años bisiestos
	 *  @param args
	 * @return 
	 */
	
	/**
	 * Variable que almacena en un array los días que tiene cada mes del año
	 */
	private static final int[] diasMes = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
	
	/**
	 * Metodo que comprueba si el año introducido es correcto
	 * @param int anio
	 * @return boolean anioCorrecto
	 */
	private static boolean comprobarAnio (int anio) {
		boolean anioCorrecto = false;
		if(anio != 0) anioCorrecto = true;
		return anioCorrecto;
	}
	
	/**
	 * Metodo que comprueba si el mes introducido es correcto
¡	 * @param int mes
	 * @return boolean mesCorrecto
	 */
	private static boolean comprobarMes (int mes) {
		boolean mesCorrecto = false;
		if(mes >= 1 && mes <=12) mesCorrecto = true;
		return mesCorrecto;
	}
	
	/**
	 * Metodo que comprueba si el día introducido es correcto
	 * @param int dia
	 * @param int mes
	 * @return String resultado
	 */
	private static String comprobarDia(int dia, int mes) {
		String resultado = "";
			if(dia > 0 && dia <= diasMes[mes - 1]) {
				resultado = "La fecha es correcta";//Si el día, el mes y el año son correctos, imprime esto
			}else {
				resultado = "El día es incorrecto";//Si el día es incorrecto, imprime esto
			}
		return resultado;
	}
	
	/**
	 * Metodo que comprueba si una fecha tiene el formato correcto
	 * @param int dia
	 * @param int mes
	 * @param int anio
	 * @return String resultado
	 */
	public static String comprobarFecha(int dia, int mes, int anio) {
		String resultado = "";
		if (comprobarAnio(anio)) {
			if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) diasMes[1] = 29;
			if (comprobarMes(mes)) {
				resultado = comprobarDia(dia,mes);
			} else {
				resultado = "El mes es incorrecto";//Si el mes es incorrecto, imprime esto
			}
		} else {
			resultado = "El año es incorrecto";//Si el año es incorrecto, imprime esto
		}		
		return resultado;
	}
	
	public static void main(String[] args) {
		/**
		 * LLamamos al método combrobarFecha();
		 * e imprimimos el resultado
		 */
		System.out.println(comprobarFecha(20,8,2015));

	}

}
