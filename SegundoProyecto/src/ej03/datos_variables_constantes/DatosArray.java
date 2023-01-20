package ej03.datos_variables_constantes;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class DatosArray {
	/**
	 *  Un array que contenga los días que tienen los 12 meses
	 *	Un array de dos dimensiones, una de 5 elementos, y cada elemento de 7 elementos
	 *	Rellenarlos con  números secuenciales de 1 a 31
	 *  @param args
	 */
	public static void main(String[] args) {
		int[][] diaMes = new int [5][7]; //Se inicializa el array con un tamaño
		int contador = 0; //Añadimos un contador 
		
		//Se rellena el array con un ciclo for
		for(int i=0; i < diaMes.length && contador < 31; i++) {
			for(int b=0; b < diaMes[i].length && contador < 31; b++) {
				diaMes[i][b] = ++contador;
				System.out.println(diaMes[i][b]);
			}
		}

	}

}
