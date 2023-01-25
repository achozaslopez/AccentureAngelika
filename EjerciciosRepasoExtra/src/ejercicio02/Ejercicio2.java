package ejercicio02;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		calcularIVA(precio);
		System.out.println("El precio total del producto con el IVA incuido es de " + (calcularIVA(precio) + precio) + "€");//Imprimo por consola el resultado de calcular el iva más el precio

	}
	
	public static double precio = 50; //Variable precio
	final static double IVA = 0.21; //Constante IVA
	/**
	 * Método que calcula el IVA del precio indicado
	 * @param double precio
	 * @return double precio * IVA
	 */
	public static double calcularIVA(double precio) {
		return precio * IVA;
	}
}
