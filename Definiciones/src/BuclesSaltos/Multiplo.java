package BuclesSaltos;

public class Multiplo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		if (num1 == num2) {
			System.out.println("El número " + num1 + " es igual al número " + num2);
		}else {
			if(num1 > num2) 
				System.out.println("El número " + num1 + " es mayor que el número " + num2);
			else 
				System.out.println("El número " + num2 + " es mayor que el número " + num1);
		}if (num1 == 0 || num2 == 0) {
			System.out.println("El número " + num1 + " y el número " + num2 + " no son múltiplos");
		}else {
			if(num1 % num2 == 0 || num2 % num1 == 0)
				System.out.println("El número " + num1 + " y el número " + num2 + " son múltiplos");
			else System.out.println("El número " + num1 + " y el número " + num2 + " no son múltiplos");
		}
		
		
			

	}

}
