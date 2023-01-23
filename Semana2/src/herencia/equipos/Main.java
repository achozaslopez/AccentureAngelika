package herencia.equipos;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Angelika Chozas Lopez
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Miembro> lista = new ArrayList<Miembro>();
		lista.add(new Futbolista(1,"Roger","García",26, 93,"delantero"));
		lista.add(new Entrenador(1,"Luis","Perez",48,"123456"));
		lista.add(new Masajista("fisio", 10));

	}

}
