package ficheros.controller;

import java.sql.SQLException;
import java.util.List;

import ficheros.dao.CountryDao;
import ficheros.modelos.Country;

public class CountryController {
	
	CountryDao cDao;

	public CountryController() throws SQLException{
		cDao = new CountryDao();
	}
	
	public List<Country> leerTodos() throws Exception {
		return cDao.leerTodos();
		
	}
	
	public void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
	
	public int actualizar(Country country) throws SQLException {
		return cDao.actualizar(country);
	}
	
	public int borrar(Country country) throws SQLException {
		return cDao.delete(country);
	}
	
}
