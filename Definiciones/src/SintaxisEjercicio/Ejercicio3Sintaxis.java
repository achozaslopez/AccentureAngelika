package SintaxisEjercicio;

public class Ejercicio3Sintaxis {

	public static void main(String[] args) {
		/*
		 * La clase declara 3 variables de numero entero
		 * a la variable _contador le da el valor 25
		 * a las variables PasaDo y alcance les da el valor _contador
		 * 
		 * */
		
		
		int $nombre;
		 int PasaDo;
		 int alcance;//He añadido ; al final
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 PasaDo=_contador;//He modificado el nombre de la variable por la que ya estaba declarada

		 System.out.println($nombre + " / " + _contador);
		 System.out.println("En \"Java\" puede\n que tengamos que utilizar\n caracteres especiales");

	}

}
