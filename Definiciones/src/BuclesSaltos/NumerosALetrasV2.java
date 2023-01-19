package BuclesSaltos;

public class NumerosALetrasV2 {

	public static void main(String[] args) {
		int n = 72;
		
		
		String num1[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
						"Ocho", "Nueve", "Diez", "Once", "Doce", "Trece", "Catorce", "Quince"};
		String num2[] = {"Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", 
				"Sesenta", "Setenta", "Ochenta", "Noventa"};
		
		int unidades = n % 10;
		int decenas = n / 10;
		String mensaje = "";
		
		//Bucle que revisa los números mayor que
		if(n > 0) {
			if(n < 16) {
				mensaje = num1[n -1];
			}else {
				mensaje = num2[decenas -1];
			}if(unidades > 0) {
				mensaje += " y ";
			}if(decenas == 2) {
				mensaje = "Venti";
			}if(decenas == 1) {
				mensaje = "Dieci";
			}
			mensaje += num1[unidades -1];
		}
		System.out.println(mensaje);
}
}