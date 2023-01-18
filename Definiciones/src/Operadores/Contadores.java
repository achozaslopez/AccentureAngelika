package Operadores;

public class Contadores {

	public static void main(String[] args) {
		int valor = 0;
		valor=23;
		valor+=10;
		System.out.println("Resiultado a=" + --valor);//32
		System.out.println("Resiultado a=" + ++valor);//33
		System.out.println("Resiultado a=" + valor++);//33
		System.out.println("Resiultado a=" + valor--);//34
		System.out.println("Resiultado a=" + valor);//33

	}

}
