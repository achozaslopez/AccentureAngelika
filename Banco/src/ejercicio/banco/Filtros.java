package ejercicio.banco;
/**
 * @author Angelika Chozas Lopez
 */
import java.time.LocalDate;

public class Filtros {
	/**
	 * Conjunto de rutinas para filtrar los datos de la aplicación de Bancos
	 * Nombre del titular >15 y < 40
	 * Fecha vto > 3 años < 5 años
	 * Concepto textos ingresos y gasto > 10 <100
	 */
	
	public static boolean lMax(String texto, int longitud) {
		Boolean seCumple= false;
		
		if(texto.length() <= longitud) {
			longitud = 40;
			seCumple = true;
		}
		return seCumple;
	}
	
	public static boolean lMin(String texto, int longitud) {
Boolean seCumple= false;
		
		if(texto.length() >= longitud) {
			longitud = 15;
			seCumple = true;
		}
		return seCumple;
	}
	/**
	 * Control longitud de String
	 * @param String texto
	 * @param int maxLongitud
	 * @param int minLongitud
	 * @return seCumple
	 */
	public static boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		Boolean seCumple = false;
		
		if (minLongitud <= texto.length() && texto.length() <= maxLongitud) {
			seCumple = true;
		}

		return seCumple;
	}
	
	public static boolean fMax(LocalDate fecha, LocalDate fMaxima) {
		Boolean esFechaInferior = false;
		
		if (fecha.isBefore(fMaxima)) {
			esFechaInferior = true;
		}
		
		return esFechaInferior;	
	}
	
	public static boolean fMin(LocalDate fecha, LocalDate fMinima) {
		Boolean esFechaSuperior = false;
		
		if (fecha.isAfter(fMinima)) {
			esFechaSuperior = true;
		}
		
		return esFechaSuperior;
	}
	/**
	 * 
	 * @param LocalDate fecha
	 * @param LocalDate maxAny
	 * @param LocalDate minAny
	 * @return fMax(fecha,maxFech) && fMin(fecha,minFech)
	 */
	public static boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny) {
		LocalDate hoy = LocalDate.now();
		LocalDate maxFech = hoy.plusYears(maxAny);
		LocalDate minFech = hoy.plusYears(minAny);
		return fMax(fecha,maxFech) && fMin(fecha,minFech);
	}
	
}
