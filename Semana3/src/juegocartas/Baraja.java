package juegocartas;

import java.util.HashSet;
import java.util.Set;

public class Baraja {
	
	static final String[] PALOS = {"espadas", "copas", "oros", "bastos"};
	
	private Set<Cartas> baraja = new HashSet<>();
	
	public Baraja(String tipo) {
		String[] palo = PALOS;
		for(String paloCarta : palo) {
			for(int i = 1; i < 13; i++) {
				Cartas cBaraja = new Cartas();
			}
		}
	}
}
