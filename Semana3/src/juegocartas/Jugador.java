package juegocartas;

import java.util.Scanner;
import java.util.Set;

public class Jugador {
	
	private String nombre;
	  private int edad;
	  private Cartas[] mano;
	
	public Jugador(String nombre, int edad) {
		mano = new Cartas[5];
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
	
	public void recibirCarta(Cartas carta) {
		    mano[0] = carta;
	}
	/*
	public void pedirDatos() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese nombre: ");
	    nombre = sc.nextLine();
	    System.out.print("Ingrese edad: ");
	    edad = sc.nextInt();
	}
	*/
}
