package Operadores;

public class Operadores {
		final static int IVA = 21;
	public static void main(String[] args) {
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40;
		double importe = cantidad* unidades * precio;
		double iva = importe * IVA/100;
		int total = (int) (importe + iva);
		

		System.out.println("Cantidad\t" + cantidad);
		System.out.println("Unidades\t" + unidades);
		System.out.println("Precio\t\t" + precio);
		System.out.println("Importe\t\t" + importe);
		System.out.println("Iva\t\t" + iva);
		System.out.println("Total\t\t" + total + " Deberia ser: " + total + importe + iva);
		
	}

}
