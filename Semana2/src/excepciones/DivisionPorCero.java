package excepciones;
/**
 * 
 * @author Angelika Chozas Lopez
 *
 */
public class DivisionPorCero {

	public static void main(String[] args) {
		int a = 0;
		int b = 300;
		int c;
		
		try {//Con este bloque se capturan las excepciones
			c = b / a;
			System.out.println("El resultado es " + c);
		}catch(ArithmeticException e) {// Cuando se produzca ArithmeticException se dispara la excepcion
			System.err.println( "Se ha producido un error");
		}finally {//Esto se ejecutará se produzca o no el error
			System.out.println( "El programa se ha finalizado");
		}

	}

}
