package BuclesSaltos;

public class NumerosALetrasV2 {

	public static void main(String[] args) {
		int n = 72;
		int unidades = n % 10;
		int decenas = n / 10;
		
		String num1[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
						"Ocho", "Nueve"};
		String num2[] = {"Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", 
				"Sesenta", "Setenta", "Ochenta", "Noventa"};
		
		if(n < 16) {
			System.out.println(num1[n -1]);
		
		}else {
			System.out.println(num2[decenas -1] + " y " + num1[unidades -1]);
		}

	}

}
