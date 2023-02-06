package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	private static Connection conn;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL ="jdbc:oracle:thin:@95.17.8.252:1521:xe";
	private final static String DATABASE = "";
	private final static String USUARIO ="hr";
	private final static String PASSWORD = "hr";
	
	public final static String SQL_LEER_TODOS = "Select * from Employees";
	public final static String SQL_LEER_COUNTRY = "Select * from Country";
	
	public static void main(String[] argv) throws SQLException {
		
		System.out.println("Oracle Connection Testing");
		
		try {
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			System.out.println("where is you Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Registred");
		
		
		conn = null;
		
		try {
			conn = DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
		}catch(SQLException e) {
			System.out.println("Error conexion");
			e.printStackTrace();
			return;
		}
		lecturaCountry();
		lectura();
		if(conn != null) {
			System.out.println("You made it, take control your database now");
			conn.close();
		}else {
			System.out.println("Failed to make connection");
		}

	}
	public static void lectura() throws SQLException {
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(SQL_LEER_TODOS);
		
		while (rs.next()) {
			System.out.println(rs.getString("First_name"));
		}
	}
	
	public static void lecturaCountry() throws SQLException {
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(SQL_LEER_COUNTRY);
		
		while (rs.next()) {
			Country ctr = new Country();
			ctr.setCountry_id(rs.getString("country_id"));
			ctr.setCountry_name(rs.getString("country_name"));
			ctr.setRegion_id(rs.getString("region_id"));
			listarCtr(ctr);
		}
	}
	public static void listarCtr(Country ctr) {
		System.out.println(ctr.getCountry_id());
	}
}
