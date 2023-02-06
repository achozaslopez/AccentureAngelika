package ficheros.dao;

import java.sql.SQLException;
import java.util.List;

import ficheros.modelos.Country;

public interface CountryDaoI {
	
	public Country leerUno(String country_id);
	public List<Country> leerTodos() throws Exception;		//Listado de Countries
	public int actualizar(Country country) throws SQLException; //Recibir registro autorizado
	public int delete(Country country)throws SQLException;		//Elimina registro autorizado
	public int delete(String country_id) throws SQLException;
	public Country insert(Country country) throws SQLException;
	int delete(int country_id) throws SQLException;
}
