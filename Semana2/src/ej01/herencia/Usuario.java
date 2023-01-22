package ej01.herencia;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Usuario extends Persona {
	private String codigoUsuario;

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	public static String autorizar() {
		return "Autorizado";
	}
	
	String creado = Persona.crear();
	
}
