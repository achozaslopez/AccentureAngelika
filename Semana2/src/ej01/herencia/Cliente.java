package ej01.herencia;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Cliente extends Persona {
	private int numeroCliente;
	private String fechaAlta;
	
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public static String verFechaAlta() {
		return "La fecha de alta es: **/**/**** ";
	}
	
	
}
