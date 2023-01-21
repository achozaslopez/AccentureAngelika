package ej05.buclesysaltos;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class FechaV2 {
	/**
	 * En la segunda version, utilizar los días reales de cada mes, sin arrays
	 *  @param args
	 * @return 
	 */
	
	public static String comprobarFecha(int dia, int mes, int anio) {
		
		String resultado = "";
		boolean anioCorrecto = comprobarAnio(anio);
		boolean diaCorrecto = comprobarDia(dia);
		
		if (anioCorrecto) {
			if (diaCorrecto) {
				boolean diasMesCorrectos = comprobarDiasMes(dia,mes);
				if (diasMesCorrectos) {
					resultado = "La fecha es correcta";
				} else {
					resultado = "El mes es incorrecto";
				}
			} else {
				resultado = "El día es incorrecto";	
			}
		} else {
			resultado = "El año es incorrecto";
		}

		return resultado;
	}
	
	public static boolean comprobarDiasMes (int dia, int mes) {
		boolean diasCorrespondientes = false;
		boolean mesCorrecto = comprobarMes(mes);
		
		if (mesCorrecto) {
			switch (mes) {
			case 1,3,5,7,8,10,12 :
				if (dia >=1 && dia <= 31) diasCorrespondientes = true;
			break;
			case 4,6,9,11 :
				if (dia >=1 && dia <= 30) diasCorrespondientes = true;
			break;
			case 2:
				if (dia<=1 && dia <= 28) diasCorrespondientes = true;
			break;
			default:
				break;
			}
		}
		return diasCorrespondientes;
	}
	
	public static boolean comprobarMes(int mes) {
		boolean mesCorrecto = false;
		if (mes >=1 && mes <=12) {
			mesCorrecto = true;
		}
		return mesCorrecto;
	}
	
	public static boolean comprobarAnio(int anio) {
		boolean anioCorrecto = false;
		if (anio != 0) {
			anioCorrecto = true;
		}
		return anioCorrecto;
	}
	
	public static boolean comprobarDia (int dia) {
		boolean diaCorrecto = false;
		if (dia >=1 && dia <= 31) {
			diaCorrecto = true;
		}
		return diaCorrecto;
	}
	
	public static void main(String[] args) {
		System.out.println(comprobarFecha(12,12,2013));

	}

}
