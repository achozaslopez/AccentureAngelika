package BuclesSaltos;

public class NumerosALetras {

	public static void main(String[] args) {
		int n = 72;
		int unidades = n % 10; //Resto division
		int decenas = n / 10; //Cociente division
		
		switch(decenas) {
		case 0:
			
			break;
		case 1:
			System.out.print("Diez");
			break;
		case 2:
			System.out.print("Veinte");
			break;
		case 3:
			System.out.print("Treinta");
			break;
		case 4:
			System.out.print("Cuarenta");
			break;
		case 5:
			System.out.print("Cincuenta");
			break;
		case 6:
			System.out.print("Sesenta");
			break;
		case 7:
			System.out.print("Setenta");
			break;
		case 8:
			System.out.print("Ochenta");
			break;
		case 9:
			System.out.print("Noventa");
			break;
		}
		
		if(unidades != 0) {
			System.out.print(" y ");
		}
		
		switch(unidades) {
		case 0:
			
			break;
		case 1:
			System.out.print("Uno");
			break;
		case 2:
			System.out.print("Dos");
			break;
		case 3:
			System.out.print("Tres");
			break;
		case 4:
			System.out.print("Cuatro");
			break;
		case 5:
			System.out.print("Cinco");
			break;
		case 6:
			System.out.print("Seis");
			break;
		case 7:
			System.out.print("Siete");
			break;
		case 8:
			System.out.print("Ocho");
			break;
		case 9:
			System.out.print("Nueve");
			break;
		}

	}

}
