package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class FechaV1 {
	/**
	 * Hacer una clase, definiendo día=20, mes =8,año = 2015, 
	 * y luego añadir el código para comprobar que la fecha es correcta
	 *  @param args
	 * @return 
	 */
	
	/**
	 * Metodo que comprueba si una fecha tiene el formato correcto
	 * @param int dia
	 * @param int mes
	 * @param int anio
	 * @return String fechaCorrecta
	 */
	public static String comprobarFecha(int dia, int mes, int anio) {
		String fechaCorrecta;
		
		/**
		 * Con este bloque comprobamos que el día esta comprendido entre el 1 y el 30
		 * el mes entre el 1 y el 12
		 * y el año sea distinto de 0
		 * Déspues imprime por consola si la fecha comprobada tiene o no el formato correcto
		 */
		if(dia >= 1 && dia <= 30) {
			if(mes >=1 && mes <= 12) {
				if(anio != 0) {
					fechaCorrecta = "La fecha es correcta";
				}else {
					fechaCorrecta = "El año es incorrecto";
				}
			}else {
				fechaCorrecta = "El mes es incorrecto";
			}
			
		}else {
			fechaCorrecta = "El día es incorrecto";
		}
		
		return fechaCorrecta;
	}
	public static void main(String[] args) {
		String fechaCorrecta = comprobarFecha(20, 8, 2015);
		System.out.println(fechaCorrecta);

	}

}
