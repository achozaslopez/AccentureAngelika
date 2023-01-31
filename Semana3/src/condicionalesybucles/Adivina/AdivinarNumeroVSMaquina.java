package condicionalesybucles.Adivina;

import java.util.Scanner;

public class AdivinarNumeroVSMaquina {

	static int numAleatorio;
	static int numJugador;
	static int numMax = 100;
	static int numMin = 0;
	
	static int maquinaWin = 0;
	static int jugadorWin = 0;
	
	static boolean finJuego;
	static boolean finPartida;
	
	public static void main(String[] args) {
		while(!finJuego) {
			numAleatorio = (int)(Math.random() * 100) + 1;
			numJugador = (int)(Math.random() * 100) + 1;
			
			while(!finPartida) {
				tiradaJugador();
				
				if(!finJuego && !finPartida) {
					tiradaMaquina();
				}
			}
			System.out.println("Vamos " + maquinaWin + " a " + jugadorWin + "\n");
			
			if(maquinaWin > jugadorWin) {
				System.out.println("A favor de la máquina" + "\n");
			}
			if(maquinaWin < jugadorWin) {
				System.out.println("A favor del jugador" + "\n");
			}
			if(maquinaWin == jugadorWin) {
				System.out.println("¡EMPATADOS!" + "\n");
			}
			
			System.out.println("¿Nueva partida? (S/N)" + "\n");
			Scanner consola = new Scanner(System.in);
			
			if(consola.nextLine().equalsIgnoreCase("N")) {
				finJuego = true;
			}else {
				finPartida = false;
			}
		}
				
	}

	private static void tiradaMaquina() {
		
		String respuesta = "";
		
		System.out.println("Número máquina: " + numJugador + "	(M)Mayor,(N)Menor,(I)Igual");
		Scanner consola = new Scanner(System.in);
		respuesta = consola.nextLine();
		
		if(consola.nextLine().equalsIgnoreCase("M")) {
			numMin = numJugador;
		}else {
			numMax = numJugador;
			numJugador = (int)((numMax + numMin) / 2);
		}
		if(respuesta.equalsIgnoreCase("I")) {
			System.out.println("La máquina gana al jugador");
			maquinaWin++;
			
			finPartida = true;
		}
	}

	private static void tiradaJugador() {
		int numIntroducido;
		
		System.out.println("Introduce el número");
		Scanner consola = new Scanner(System.in);
		numIntroducido = consola.nextInt();
		
		if(numIntroducido > numAleatorio) {
			System.out.println("El número que has introducido es mayor que el número aleatorio");
		}else if( numIntroducido < numAleatorio) {
			System.out.println("El número que has introducido es menor que el número aleatorio");
		}else {
			System.out.println("Jugado gana a la máquina");
			jugadorWin++;
			
			finPartida = true;
		}

		
	}
	

}
