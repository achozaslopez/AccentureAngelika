package Ejercicio3;

public class DatosArrayFor {

	public static void main(String[] args) {
		int[][] diaMes = new int [5][7]; //Se inicializa el array con un tamaño
		int contador = 0; //Añadimos un contador 
		
		//Se rellena el array con un ciclo for
		for(int i=0; i < diaMes.length & contador < 31; i++) {
			for(int b=0; b < diaMes[i].length & contador < 31; b++) {
				diaMes[i][b] = ++contador;
				System.out.println(diaMes[i][b]);
			}
		}
		
	}

}
