package BuclesSaltos;

public class FechaV2 {

	public static void main(String[] args) {
		int dia = 20;
		int mes = 8;
		int año = 2015;
		
		boolean diaCorrecto = false;
		
		if(mes >= 1 && mes <= 12) {
			if(año != 0) {
				switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia <= 31) diaCorrecto = true;
					break;
				
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia <= 28) diaCorrecto = true;
				}if(diaCorrecto) {
					System.out.println("La fecha es correcta");
				}else {
					System.out.println("El día es incorrecto");
				}
			}else {
				System.out.println("El año es incorrecto");
			}
		}else {
			System.out.println("El mes es incorrecto");
		}

	}

}
