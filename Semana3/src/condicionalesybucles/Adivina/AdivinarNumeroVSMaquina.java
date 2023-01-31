package condicionalesybucles.Adivina;

import java.util.Scanner;
import java.util.Random;

public class AdivinarNumeroVSMaquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;

        System.out.println("Adivina un número entre 1 y 100." + "\n");
        System.out.println("Es el turno del jugador." + "\n");
        int userGuess = sc.nextInt();

        while (userGuess != number) {
            if (userGuess > number) {
                System.out.println("El número introducido es mayor" + "\n");
            } else if (userGuess < number) {
                System.out.println("El número introducido es menor" + "\n");
            }

            int computerGuess = (int) (Math.random() * 100) + 1;
            System.out.println("Es el turno de la máquina " + computerGuess + "\n");
            if (computerGuess == number) {
                System.out.println("Gane yo! El número era " + number + "\n");
                break;
            } else {
                System.out.println("Es el turno del jugador" + "\n");
                userGuess = sc.nextInt();
            }
        }
        if (userGuess == number) {
            System.out.println("Felicidades, has ganado " + number + "\n");
        }
	}
	

}
