package ficheros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ficheros.modelos.Country;
import ficheros.util.MontadorSQL;
import ficheros.util.OracleJDBC;

public class CountryDao implements CountryDaoI{ //Dao habla con la base de datos
	
	private Connection conn;
	public final static String SQL_LEER_COUNTRY = "Select * from Country"; //Aqui van todos los querys necesarios
	public final static String SQL_ACTUALIZAR_COUNTRY = "updates countries_ACL set countru_id = ? where country_id = ?";
	public final static String SQL_ELIMINAR_COUNTRY = "delete countries_ACL where country_id = ?";
	
	public CountryDao() throws SQLException {
		OracleJDBC ora = new OracleJDBC();
		conn = ora.abrir();
	}

	@Override
	public Country leerUno(String country_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> leerTodos() throws Exception {
		ResultSet rs = null;
		List<Country> salida = new ArrayList();
		
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRY);
			
			while(rs.next()) {
				salida.add(carga(rs));
			}
		}catch(SQLException e) {
			throw new Exception(SQL_LEER_COUNTRY + " " + e.getMessage());
		}
		return null;
	}

//	@Override
//	public int actualizar(Country country) throws SQLException {
//	try {
//		
//			PreparedStatement ps = conn.prepareStatement(SQL_ACTUALIZAR_COUNTRY);
//			ps.setString(1, country.getCountry_id());
//			ps.setString(2, country.getCountry_name());
//			ps.setString(3, country.getRegion_id());
//			return ps.executeUpdate();
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	return 0;
//	}
	
	public int actualizar(Country country) throws SQLException {
		String sql = "Update countries_ACL set " + MontadorSQL.montaSqlI(country);
		sql = MontadorSQL.addSalida(sql, "country_id", country.getCountry_id(), " ");
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql);
	}
	
	@Override
	public int delete(Country country) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_ELIMINAR_COUNTRY);
		try {
			ps = conn.prepareStatement(SQL_ELIMINAR_COUNTRY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ps.setString(1, country.getCountry_id());
		return ps.executeUpdate();
	}
	
	@Override
	public int delete(String country_id) throws SQLException {
			
			PreparedStatement ps = conn.prepareStatement(SQL_ELIMINAR_COUNTRY);
			try {
				ps = conn.prepareStatement(SQL_ELIMINAR_COUNTRY);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ps.setString(1, country_id);
			return ps.executeUpdate();
		}

	@Override
	public Country insert(Country country) throws SQLException {
		String sql = "insert into countries_ACL " + MontadorSQL.montaSqlI(country);
		System.out.println(sql);
		Statement stm = conn.createStatement();
		stm.executeUpdate(sql);
		return country;
	}

	public Country carga(ResultSet rs) throws SQLException {
		Country ctr = new Country();
		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getString("region_id"));
		return ctr;
	}

	@Override
	public int delete(int country_id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
