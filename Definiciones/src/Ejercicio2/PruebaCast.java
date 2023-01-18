package Ejercicio2;

public class PruebaCast {

	public static void main(String[] args) {
		byte a;
		char b;
		float c;
		double d;
		short e;
		int num = 65;
		a = (byte) num;
		b = (char) num;
		c = (float) num;
		d = (double) num;
		e =(short)num;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
