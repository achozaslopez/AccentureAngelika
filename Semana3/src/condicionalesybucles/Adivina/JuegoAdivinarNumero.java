package condicionalesybucles.Adivina;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinarNumero {

	public static void main(String[] args) {
		int number = (int)(Math.random()*100) + 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina un número entre 1 y 100");
		int guess = sc.nextInt();
		
		while(guess != number) {
			if(guess > number) {
				System.out.println("El número que ha introducido es mayor");
				System.out.println("Introduce otro número");
				guess = sc.nextInt();
			}else {
				System.out.println("El número que ha introducido es menor");
				System.out.println("Introduce otro número");
				guess = sc.nextInt();
			}
		}
		if(guess == number) {
			System.out.println("Enhorabuena has acertado");
		}

	}

}
