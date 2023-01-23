package Automovil;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		lista.add(new Coche("Negro",5,"Seat"));
		lista.add(new Camion(31,120000));
		lista.add(new Moto(22));

	}

}
