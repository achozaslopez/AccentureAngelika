package ficheros.util;

import ficheros.modelos.Country;

public class MontadorSQL {
	/**
	 * Completa SQL añadiendo el nombre del campo y su valor (si se pasa)
	 * Pensando para insert y updates
	 * @param salida
	 * @param nombreCampo
	 * @param valor
	 * @param separador
	 * @return Devuelve un String con los valores añadidos
	 */
	public String montaSqlU(Country country) {
		String salida = "";
		salida = addSalida(salida,"country_id",country.getCountry_id(),",");
		salida = addSalida(salida,"country_name",country.getCountry_name(),",");
		salida = addSalida(salida,"region_id",country.getRegion_id(),",");
		return salida;
	}
	
	public static String montaSqlI(Country country) {
		String salida = "";
		salida = addSalida(salida,"",country.getCountry_id(),",");
		salida = addSalida(salida,"",country.getCountry_name(),",");
		salida = addSalida(salida,"",country.getRegion_id(),",");
		return salida;
	}
	
	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {
		return addSalidaSencilla(salida,nombreCampo,""+valor, separador);
		
	}
	
	public static String addSalida(String salida, String nombreCampo, double valor, String separador) {
		return addSalidaSencilla(salida,nombreCampo,""+valor, separador);
	}
	
	public static String addSalida(String salida, String nombreCampo, long valor, String separador) {
		return addSalidaSencilla(salida,nombreCampo,""+valor, separador);
	}
	
	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida,nombreCampo,"'"+ valor + "'", separador);
	}
	
	/**
	 * Recibe un String parcialmente construida y que tiene que completar,
	 * El nombre del campo se añade solo si no es nulo
	 * A continuacion del nombre del campo, se añade un signo "=" solo si se ha añadido nombre del campo
	 * a continuacion se añade el calor recibido
	 * 
	 * @param salida		: Parte del String ya construido
	 * @param nombreCampo	: Nombre del campo que se va a añadir
	 * @param valor			: Valor del campo
	 * @param separador		: Separador que tiene que añadir entre campos
	 * @return				: String que recibimos parcialmente construido a el que hemos añadido al nuevo campo
	 */
	
	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {
		if(salida.length() > 0) {
			salida += " " + separador + " ";
		}
		if(nombreCampo != null && nombreCampo.length() > 0) {
			salida += nombreCampo + " = ";
		}
		salida += valor;
		return salida;
	}
	
}
