package ej04.operadores;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Radio {
	/**
	 *  Dado el radio, (23), 
	 *  calcular el área del circulo y la longitud de la circunferencia
	 *  @param args
	 */
	
	/**
	 * Metodo para calcular el área de un círculo
	 * @param int radio
	 * @return double area
	 */
	public static double calcularArea(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	/**
	 * Metodo para calcular la longitud de la circunferencia
	 * @param int radio
	 * @return double longitud
	 */
	public static double calcularLongitud(int radio) {
		return 2 * Math.PI * radio;
	}
	
	public static void main(String[] args) {
		/*
		 * LLamo a los metodos creados para imprimirlos por pantalla el
		 * area y la longitud de la circunferencia dada en el enunciado.
		 * */
		double area = calcularArea(23);
		System.out.println("El área del círculo es " + area);
		
		double longitud = calcularLongitud(23);
		System.out.println("La longitud de la circunferencia es " + longitud);
		
		

	}

}
