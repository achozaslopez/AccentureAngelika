package ej01.herencia;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Persona {
	private int id;
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	public static String crear() {
		return "Se ha creado correctamente";
	}
	
	public static String borrar() {
		return "Se ha eliminado correctamente";
	}
	
	public static String enviarMensaje() {
		return "Se ha enviado el mensaje";
	}	
}
