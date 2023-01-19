package BuclesSaltos;

public class TablasMultiplicar {

	public static void main(String[] args) {
		int tabla;
		int i;
		
		for(tabla = 1; tabla <= 10; tabla++) { //Mientras tabla sea > que 1 y <= 10 realizará el bloque
			System.out.println("Tabla del " + tabla);//Imprime el nombre de la tabla
			
			for(i = 1; i <= 10; i++) {//Este bloque es para sacar el contenido de la tabla
				System.out.println(tabla + " x " + i + " = " + tabla * i);
			}
		}
		

	}

}
