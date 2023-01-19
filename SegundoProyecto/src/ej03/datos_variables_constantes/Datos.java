package ej03.datos_variables_constantes;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Datos {
	/**
	 *  Define las siguientes variables:
	 *	dia, con un valor inicial de 10
	 *	nDni, para números de DNI, con un valor inicial de 57.433.222
	 *	precio para valores numéricos con dos decimales
	 *	una constante con nombre «ACTIVO», y con valor true
	 *	carga la variable precio con el valor 135.12 
	 *  @param args
	 */
	public static void main(String[] args) {
		int dia = 10; //Declaro la variable con un valor inicial de 10
		long nDni = 57433222; //Declaro la variable nDni dandole un valor inicial de 57433222 
		double precio = 135.12; //Declaro la variable precio y le doy un valor inicial con dos decimales 135.12
		final boolean ACTIVO = true; //Para declarar una constante es necesario poner final antes del tipo de dato y el nombre de la constante en mayúsculas

		/*
		 * Para imprimir todo a la misma altura
		 * he utilizado la secuencia de escape \t
		*/
		System.out.println("Dia\t" + dia);
		System.out.println("DNI\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo?\t" + ACTIVO);

	}

}
