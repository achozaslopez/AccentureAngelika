package Operadores;

public class Vuelta {

	public static void main(String[] args) {

		//System.out.println(args[0]);
		String salida = "";
		for(String ele:args) {
			salida = salida + ele + " ";
		}
		System.out.println(salida);
		
		//Invertir el orden de las palabras del mensaje
		String[] mensaje = salida.split(" "); //Split metodo divide Strig por lo definido entre ()
		int fin = mensaje.length;
		String salida2 = "";
		for(int i = fin-1; i >= 0; i--) {
			salida2 = salida2 + mensaje[i] + " ";
		}
		
		System.out.println(salida2);
		
		//Invertir el orden letra a letra del mensaje
		String salida3 = "";
		int letras = salida.length();
		for(int i = letras - 1; i >= 0; i--) {
			salida3 += salida.charAt(i);
		}
		System.out.println(salida3);
		
		//Volvemos a invertir el orden pero cambiamos ax4, ex3, ix1, ox0, ux9
		
		String salida4 = "";
		int letras2 = salida.length();
		for(int i = letras2 - 1; i >= 0; i--) {
			char cambio = salida.charAt(i);
			cambio = conver(cambio);

			salida4 += cambio;
		}
		System.out.println(salida4);
		
		/* Cadena de entrada delimitada con cualquier caracter al principio y al final
		* Sin utilizar atributo length
		* Calculando la longitud buscando el caracter del final
		*/
		
		char cFinal = salida.charAt(0); //Caracter que abre la frase
		String salida5 = "";
		//Indicador que +1, condicion de salida se produce cuando char no sea distinto del caracter que abre
		for (int a = 1; (salida + cFinal).charAt(a) != cFinal; a++) {
			System.out.println(salida.charAt(a));
			salida5 = salida. charAt(a) + salida5;
		}
		System.out.println();
		System.out.println(salida5);
		
		//Como el ejercicio anterior pero sin calcular la longitud del String
		salida += (char) 0;
		int post = 0;
		String salida6 = "";
		while (salida.charAt(post) != (char) 0)
				salida6 = salida.charAt(post++) + salida;
		
		System.out.println(salida6);
		
	}

	public static char conver(char cambio) {
		switch (cambio ) {
		case 'a':
			cambio = '4';
			break;
		case 'e':
		case 'E':
			cambio = '3';
			break;
		case 'i':
			cambio = '1';
			break;
		case 'o':
			cambio = '0';
			break;
		case 'u':
			cambio = '9';
			break;
		}
		return cambio;
	}

}
