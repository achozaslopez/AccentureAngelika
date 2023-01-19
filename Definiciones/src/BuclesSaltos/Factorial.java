package BuclesSaltos;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 8;
		int num = 8;

		
		for(int i = num; i > 0; i--)//mientras el numero sea > 0 lo ire multiplicando por el factorial
		{
			factorial = factorial * i;
		}
			System.out.println("El factorial del número " + num + " es " + factorial);
	}

}
