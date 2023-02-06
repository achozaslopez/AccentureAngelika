package ficheros.util;

import java.util.List;

import ficheros.controller.CountryController;
import ficheros.modelos.Country;

public class Main {

	public static void main(String[] args) throws Exception{

		CountryController cc = new CountryController();
		List<Country> ll = cc.leerTodos();
		listarCtr(ll);
		
	}
	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
}
