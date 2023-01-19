package BuclesSaltos;

public class Cuadrado {

	public static void main(String[] args) {
		
		//Introducidos en el argumentario los numeros: 21, 5, 47, 32, 8, 95
		
		for(String numArgs: args) {
			int num = Integer.parseInt(numArgs); //Convertimos la cadena de texto en un número entero
			int cuadrado = (int) Math.pow(num, 2); //Calcular el cuadrado del número con Math.pow
			
			System.out.println("El número " + num + " al cuadrado es igual a " + cuadrado);
		}

	}

}
