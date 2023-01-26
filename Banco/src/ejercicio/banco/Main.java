package ejercicio.banco;

import java.time.LocalDate;

public class Main {
	public static Cuenta cuenta1;
	public static Tarjeta tarjeta1;
	public static Debito debito1;
	public static Credito credito1;
	public static Movimiento movimiento1;

	public static void main(String[] args) throws Exception {
		cuenta1 = new Cuenta("123456789","Angelika Chozas");
		cuenta1.ingresar(9000.50);
		cuenta1.ingresar("Ahorros", 3000);
		cuenta1.retirar(12.50);
		cuenta1.retirar("Cafetera", 380);
		
		tarjeta1 = new Tarjeta("2345234523452345","Angelika Chozas",LocalDate.of(2030, 10, 30));
		
		debito1 = new Debito("2345234523452345","Angelika Chozas",LocalDate.of(2030, 10, 30));
		debito1.setCuenta(cuenta1);
		debito1.ingresar(35);
		debito1.retirar(15);
		
		credito1 = new Credito("4321432143214321","Angelika Chozas",LocalDate.of(2028, 11, 12),3000);
		credito1.setCuenta(cuenta1);
		credito1.ingresar(120);
		credito1.retirar(25);
		
		movimiento1 = new Movimiento();
		cuenta1 = verMovimientos();
		
	}

	private static Cuenta verMovimientos() {
		System.out.println(cuenta1);
		System.out.println(tarjeta1);
		System.out.println(debito1);
		System.out.println(credito1);
		return null;
	}

}
