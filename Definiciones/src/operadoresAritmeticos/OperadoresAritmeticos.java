package operadoresAritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 5;
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		int division = num1 / num2;
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("División: " + division);
		
		
		//Operadores de Asignación
		num1 += 58;
		System.out.println(num1);
		
		//Operadores Unarios
		num1 = -num1;
		System.out.println(num1);
		
		//Operador Instanceof
		String nombre = "Angelika";
		boolean comparacion = (nombre instanceof String);
		System.out.println(comparacion);
		
		//Operadores incrementales
		int num3 = 3;
		int incremento = num3++;
		int decremento = num3--;
		
		System.out.println(incremento);
		System.out.println(decremento);
		
		int incrementoAntes = ++num3;
		int decrementoAntes = --num3;
		
		System.out.println(incrementoAntes);
		System.out.println(decrementoAntes);
		
		//Operadores Relacionales
		
		int igual1 = 5;
		int igual2 = 5;
		if(igual1==igual2) {
			System.out.println("Son iguales");
			
		//Operadores Lógicos
			int precio = 35;
			boolean cantidad = true;
			
			if(precio < 0 | cantidad) {
				System.out.println("El precio es mayor que cero o resultado es true");
				
			if(precio < 0 && cantidad) {
				System.out.println("El precio es mayor que cero y resultado es true");	
			}
			
			if(!cantidad) {
				System.out.println("Si cantidad es false");
			}else {
				System.out.println("Si cantidad es true");
			}
		}
			//Operador ternario Condicional
			/*int valor = cantidad?precio:60;
			int ternario = precio>25?
		
			
			int calculo = 4 * 3 + 2 - 5 / 20 + precio > 20?10:20;*/
	}

}
		
	}
