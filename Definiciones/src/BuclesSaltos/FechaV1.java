package BuclesSaltos;

public class FechaV1 {

	public static void main(String[] args) {
		int dia = 20;
		int mes = 8;
		int año = 2015;
		
		if(dia >= 1 && dia <=30) {
			if(mes >= 1 && mes <= 12) {
				if(año != 0) {
					System.out.println("La fecha es correcta");
				}else {
					System.out.println("El año es incorrecto");
				}
			}else {
				System.out.println("El mes es incorrecto");
			}
		}else {
			System.out.println("El día es incorrecto");
		}

	}

}
