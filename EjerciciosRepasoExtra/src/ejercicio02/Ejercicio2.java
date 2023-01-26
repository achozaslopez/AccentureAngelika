package ejercicio02;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Ejercicio2 {
	/**
	 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
	 */
	
	final static double IVA = 0.21; //Constante IVA
	
	public static void main(String[] args) {
		double importe = 50; //Variable importe
		System.out.println("El precio total del producto con el IVA incuido es de " + (calcularIVA(importe) + importe) + "€");//Imprimo por consola el resultado de calcular el iva más el precio

	}
	/**
	 * Método que calcula el IVA del precio indicado
	 * @param double precio
	 * @return double precio * IVA
	 */
	public static double calcularIVA(double precio) {
		return precio * IVA;
	}
}
