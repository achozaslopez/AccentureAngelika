package es.rf.curso.base;

import java.sql.Time;
import java.time.LocalTime;

public class Enlace {
	//Zona de definicion
	public String url;
	public LocalTime hora;
	public int indice;
	static int contador = 0;
	
	Enlace() {
		indice = contador++;
	}
	
	public void modificacion() { // Zona de operaciones
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Enlace [url=" + url + ", hora=" + hora + ", indice=" + indice + "]";
	}
	
}
