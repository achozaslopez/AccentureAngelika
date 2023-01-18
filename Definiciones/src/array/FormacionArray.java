package array;

public class FormacionArray {

	public static void main(String[] args) {
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int diasMes2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] year = new int [5];
		
		int[][] elMes= new int [5][7];
		
		System.out.println(diasMes.length); //Numero de elemento que tiene el array
		System.out.println(elMes.length);
		System.out.println(elMes[0].length);

	}

}
