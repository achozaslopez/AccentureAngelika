package excepciones;
/**
 * 
 * @author Angelika Chozas Lopez
 *
 */
public class DivisionPorCeroLanza {

	public static void main(String[] args) {
		int a = 0;
		int b = 300;
		int c;
		
		try {//Con este bloque se capturan las excepciones
			c = b / a;
			System.out.println("El resultado es " + c);
		}finally {//Esto se ejecutará se produzca o no el error
			System.out.println( "El programa se ha finalizado");
		}

	}

}
