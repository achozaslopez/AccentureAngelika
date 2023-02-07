package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;

import java.util.List;

import rf.curso.S4_MiniApi2.dao.CountryDao;
import rf.curso.S4_MiniApi2.modelos.Country;

public class CountryController {
	
	CountryDao cDao;

	public CountryController() throws SQLException{
		cDao = new CountryDao();
	}
	
	public List<Country>leerTodos() throws Exception {
		return cDao.obtenerCountries();
	
	}
	
	public Country leerUno(String country_id) throws SQLException {
		return cDao.buscar(country_id);
	}
	
	public void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
	
	public void actualizar(Country country) throws SQLException {
		 cDao.editar(country);
	}
	
	public void borrar(Country country) throws SQLException {
		 cDao.eliminar(country);
	}
	
	public void borrar(String country_id) throws SQLException {
		 cDao.eliminar(country_id);
	}
	
}
