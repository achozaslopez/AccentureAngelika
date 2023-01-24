package excepciones;
/**
 * 
 * @author Angelika Chozas Lopez
 *
 */
public class DivisionPorCeroMiExcepcion {

	public static void main(String[] args) throws Exception {
		int a = 0;
		int b = 300;
		int c;
		
		try {//Con este bloque se capturan las excepciones
			c = b / a;
			System.out.println("El resultado es " + c);
		}catch(ArithmeticException e) {
			throw new Exception("Se ha producido un error");//El mensaje de error es el que hemos indicado aqui
		}finally {//Esto se ejecutará se produzca o no el error
			System.out.println( "El programa se ha finalizado");
		}

	}

}
