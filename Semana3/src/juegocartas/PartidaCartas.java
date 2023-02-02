package juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class PartidaCartas {
	
	static ArrayList<String> baraja = new ArrayList<>();
	static ArrayList<String> jugador1 = new ArrayList<>();
	static ArrayList<String> jugador2 = new ArrayList<>();
	static ArrayList<String> jugador3 = new ArrayList<>();
	static ArrayList<String> jugador4 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//Creo los 4 jugadores
		Jugador jugador1 = new Jugador("Joel",23);
		Jugador jugador2 = new Jugador("Ellie",25);
		Jugador jugador3 = new Jugador("Tess",19);
		Jugador jugador4 = new Jugador("Bill",28);
		
		//Imprimo jugadores
		System.out.println(jugador1);
		System.out.println(jugador2);
		System.out.println(jugador3);
		System.out.println(jugador4);
		
		//Creo una baraja con las cartas
		Baraja baraja = new Baraja();
		
		//Inicializar la baraja
		baraja.inicializar();
		
		//Imprimo baraja creada
		System.out.println("------------------------------- BARAJA CREADA -------------------------------");
		System.out.println(baraja.toString());
		
		
		//Baraja las cartas
		baraja.barajar();
		System.out.println("------------------------------- BARAJA BARAJADA -------------------------------");
		System.out.println(baraja.toString());
		
		//Repartir 5 cartas a cada jugador
		baraja.repartir(jugador1);
		baraja.repartir(jugador2);
		baraja.repartir(jugador3);
		baraja.repartir(jugador4);
		
		//Muestra la mano de cada jugador
		System.out.println("------------------------------- MANO DEL JUGADOR -------------------------------");
		System.out.println("Mano de " + jugador1.getNombre() + ": " + jugador1.toString());
		System.out.println("Mano de " + jugador2.getNombre() + ": " + jugador2.toString());
		System.out.println("Mano de " + jugador3.getNombre() + ": " + jugador3.toString());
		System.out.println("Mano de " + jugador4.getNombre() + ": " + jugador4.toString());

	}
}
