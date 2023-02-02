package juegocartas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Jugador {
	public static final int NUM_JUGADORES = 4;
	private String nombre;
	private int edad;
	private ArrayList<Carta> mano;
	
	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		mano = new ArrayList<>();
	}
	
	public void agregarCarta(Carta carta) {
		mano.add(carta);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public static int getNumJugadores() {
		return NUM_JUGADORES;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Carta carta : mano) {
			sb.append(carta.toString()).append("\n");
		}
		return sb.toString();
	}
}
