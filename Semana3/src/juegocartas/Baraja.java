package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	  ArrayList<String> baraja = new ArrayList<String>();

	  public Baraja() {
	    String[] valores = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K"};
	    String[] palos = {"Diamantes", "Picas", "Trebol", "Corazones"};


	    for (int i = 0; i < palos.length; i++) {
	      for (int j = 0; j < valores.length; j++) {
	        baraja.add(valores[j] + " de " + palos[i]);
	      }
	    }
	    System.out.println("Ordenada " + baraja);
	    System.out.println("Total cartas " + baraja.size());
	  }

	  public void barajar() {
		  Collections.shuffle(baraja);
		  System.out.println("Barajada " + baraja);
	  }
	  
	  public void repartir() {
		  
	  }

	  
	}