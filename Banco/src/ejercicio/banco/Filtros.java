package ejercicio.banco;

import java.time.LocalDate;

public class Filtros {
	
	public static boolean lMax(String texto, int longitud) {
		return texto.length()<= longitud;
	}
	
	public static boolean lMin(String texto, int longitud) {
		return texto.length()<= longitud;
	}
	/**
	 * Control longitud de String
	 * @param texto
	 * @param maxLongitud
	 * @param minLongitud
	 * @return
	 */
	public static boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		return lMax(texto, maxLongitud) && lMin(texto,minLongitud);
	}
	
	public static boolean fMax(LocalDate fecha, LocalDate fMaxima) {
		return fecha.isBefore(fMaxima);
	}
	
	public static boolean fMin(LocalDate fecha, LocalDate fMinima) {
		return fecha.isAfter(fMinima);
	}
	
	public static boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny) {
		LocalDate hoy = LocalDate.now();
		LocalDate maxFech = hoy.plusYears(maxAny);
		LocalDate minFech = hoy.plusYears(minAny);
		return false;
	}
}
