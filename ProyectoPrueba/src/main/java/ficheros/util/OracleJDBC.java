package ficheros.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ficheros.modelos.Country;

public class OracleJDBC {
	private static Connection conn;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL ="jdbc:oracle:thin:@95.17.8.252:1521:xe";
	private final static String DATABASE = "";
	private final static String USUARIO ="hr";
	private final static String PASSWORD = "hr";
	
	public final static String SQL_LEER_TODOS = "Select * from Employees";
	
	
	public Connection abrir() throws SQLException {
		
		System.out.println("Oracle Connection Testing");
		
		try {
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			System.out.println("where is you Oracle JDBC Driver?");
			e.printStackTrace();
			return null;
		}
		System.out.println("Driver Registred");
		
		
		conn = null;
		
		try {
			conn = DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
		}catch(SQLException e) {
			System.out.println("Error conexion");
			e.printStackTrace();
			return null;
		}
		return conn;
		

	}
	
	public void cerrar() throws SQLException {
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
	
	
}
