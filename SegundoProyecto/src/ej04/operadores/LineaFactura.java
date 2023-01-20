package ej04.operadores;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class LineaFactura {
	/**
	 *  Programa que calcule una linea de factura
	 *  Importe = cantidad multiplicado por las unidades y multiplicado por el precio
	 *	total es el resultado de multiplicar el importe por 1,21. 
	 *	Ten en cuenta que puedes necesitar utilizar «cast»
	 *	Valor de iva es el 21% del importe.
	 *	Debes presentar en salida,también el valor correcto 
	 *	si no convirtiéramos el total a «int».
	 *  @param args
	 */
	static final int IVA = 21; //Declaro el iva como una constante
	
	public static void main(String[] args) {
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40;
		double importe = cantidad * unidades * precio; //El valor de importe es el resultado de multiplicar la cantidad x unidades x precio
		double iva = importe * IVA/100;  //Para conseguir el valor del iva debemos dividir la constante IVA entre 100 y lo multiplicamos por el importe
		int total = (int) (importe + iva);
		

		System.out.println("Cantidad\t" + cantidad);
		System.out.println("Unidades\t" + unidades);
		System.out.println("Precio\t\t" + precio);
		System.out.println("Importe\t\t" + importe);
		System.out.println("Iva\t\t" + iva);
		System.out.println("Total\t\t" + total + " Deberia ser: " + total + importe + iva);

	}

}
