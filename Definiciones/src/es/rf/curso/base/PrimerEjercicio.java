package es.rf.curso.base;

public class PrimerEjercicio {

	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		System.out.println("Pruebas de tipos");
		
		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		importeTotal = precio * iva + precio;
		
		System.out.println("Caracter: " + c);
		//Caracter: c
		System.out.println("Equivalencia Unicode: " + (int)c);
		//Equivalencia Unicode: 65
		System.out.println("Importe Total = " + importeTotal);
		//Importe Total = 23.4*0.16+23.4
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		/*
		 * Primaver
		 * Verano
		 * Otoño
		 * Invierno
		 */
		System.out.println("Lun\tMar\tMie\tJue\tVie");
		//Lun  Mar	Mie	Jue	Vie
		System.out.println("Lun\\Mar\\Mie\\Jue\\Vie");
		//Lun\\Mar\\Mie\\Jue\\Vie
		System.out.println("\"Cocodrilo\"");
		//"Cocodrilo"
	}

}
