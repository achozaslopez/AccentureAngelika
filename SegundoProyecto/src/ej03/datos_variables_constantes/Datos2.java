package ej03.datos_variables_constantes;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Datos2 {
	/**
	 *  Modificar el programa,
	 *  haciendo que las variables puedan ser vistas 
	 *  por cualquier método de la clase.
	 *  @param args
	 */
	
	/*
	 * Para que las variables puedan ser vistas desde cualquier método de la clase
	 * la visibilidad de las variables debe ser Static. 
	 * Ya que es una variable de clase que puede compartir entre los objetos
	 * de la instancia de la clase.
	 * */
	static int dia = 10;
	static long nDni = 57433222;
	static double precio = 135.12;;
	static final boolean ACTIVO = true; 
	
	public static void main(String[] args) {
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
