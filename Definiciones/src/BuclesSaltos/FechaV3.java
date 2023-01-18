package BuclesSaltos;

public class FechaV3 {

	public static void main(String[] args) {
		int dia = 20;
		int mes = 8;
		int año = 2015;
		
		int diasMes[] = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(mes >= 1 && mes <= 12) {
			if(año != 0) {
				if(dia <= diasMes [mes-1]) {
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
