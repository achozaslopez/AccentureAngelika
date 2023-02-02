package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	  private ArrayList<Carta> baraja;
	  private int contador;
	  
	  public Baraja() {
		  baraja = new ArrayList<>();
		  contador = 0;
	  }
	  
	  public void inicializar() {
		  String[] valores = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K"};
		  String[] palos = {"Diamantes", "Picas", "Trebol", "Corazones"};
		  
		  for(String valor : valores) {
			  for(String palo : palos) {
				  baraja.add(new Carta(valor, palo));
			  }
		  }
	  }
	  
	  public void barajar() {
		  Collections.shuffle(baraja);
	  }
	  
	  public void repartir(Jugador jugador) {
		  for (int i = 0; i < 5; i++) {
			  jugador.agregarCarta(baraja.get(contador++));
		  }
	  }
	  
	  public String toString() {
		  StringBuilder sb = new StringBuilder();
		  for(Carta carta : baraja) {
			  sb.append(carta.toString()).append("\n");
		  }
		  return sb.toString();
	  }
	}