package ej04.operadores;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Prediccion {
	/**
	 *  Intenta predecir que resultado daría el siguiente código; 
	 *  después puedes escribirlo y ejecutarlo para comprobar el resultado
	 *  @param args
	 */
	public static void main(String[] args) {
		int valor = 0;
		valor=23;
		valor+=10;
		final String RESULTADO = "Resultado a="; //Genero una constante que guarda el mensaje que se repite
		//El resultado de valor es 33
		System.out.println(RESULTADO + --valor);//El decrementar valor el resultado es 32
		System.out.println(RESULTADO + ++valor);//Al incrementar el resultado anterior el resultado vuelve a ser 33
		System.out.println(RESULTADO + valor++);//Es igual que el anterior 33
		System.out.println(RESULTADO + valor--);//Incrementa el valor anterior 34
		System.out.println(RESULTADO + valor);//Muestra el valor de la variable
		
		
	}

}
