package es.rf.curso.base;

import java.time.LocalTime;

/**
 * 
 * @author a.chozas.lopez
 *	Prueba de como definir los campos
 */
public class Definiciones {
	/**
	 * Lanzamiento por consola
	 * @param args
	 */
	public static void main(String[] args) {
		Enlace ss = new Enlace();
		ss.url = "www.accenture.com";
		ss.hora = LocalTime.now();
		ss.modificacion();
		
		Enlace ss1 = new Enlace();
		ss1.url = "www.google.com";
		ss1.hora = LocalTime.now();
		ss1.modificacion();
		
		Enlace ss2 = new Enlace();
		ss2.url = "www.youtube.com";
		ss2.hora = LocalTime.now();
		ss2.modificacion();
	}

}
