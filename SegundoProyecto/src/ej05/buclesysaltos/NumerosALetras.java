package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class NumerosALetras {
	private static String[] num1 = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
									"Ocho", "Nueve"};
	private static String[] num2 = {"Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", 
									"Sesenta", "Setenta", "Ochenta", "Noventa"};
	private static String[] num3 = {"Once", "Doce", "Trece", "Catorce", "Quince"};

	private static String numberToString(int n, int unidades, int decenas) {
		String mensaje = "";
		mensaje = (num2[decenas - 1]).toLowerCase();
		if(unidades > 0) {
			mensaje = (num2[decenas - 1] + " y " + num1[unidades - 1]).toLowerCase();
		}
		if (decenas == 1 && n!=10) {
			mensaje = ("Dieci" + num1[unidades - 1]).toLowerCase();
		}
		if (decenas == 2 && n!=20) {
			mensaje = ("Veinti" + num1[unidades - 1]).toLowerCase();
		}
		return mensaje;
	}

	public static void main(String[] args) {
		int n = 72;
		int unidades = n % 10;
		int decenas = n / 10;
		String mensaje = "";
	
		if (n > 0) {
			if(n < 10) {
				mensaje = (num1[n - 1]).toLowerCase();
			} else if (n > 10 && n < 16) {
				mensaje = (num3[n - 11]).toLowerCase();
			} else {
				mensaje = numberToString(n, unidades, decenas);
			}
		}
		System.out.println(mensaje);
	}
}
