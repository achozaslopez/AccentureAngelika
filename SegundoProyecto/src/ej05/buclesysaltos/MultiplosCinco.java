package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class MultiplosCinco {
	private static final int NUMERO = 5;
	
	public static void main(String[] args) {
		int contador = 10; //El ejercicio nos pide 10 primeros múltiplos de 5
		int indice = 0; //Iniciamos en cero
		
		int total = 0;
		while(contador > 0) {
			if(++ indice % NUMERO == 0) { //Entra en este bucle solo si es divisible
				-- contador;
				total += indice;//Suma los 10 números múltiplos de 5
				System.out.println(indice);
			}
		}
		System.out.println("El total es: " + total);
		
	}
}
