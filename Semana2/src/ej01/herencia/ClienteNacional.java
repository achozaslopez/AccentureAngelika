package ej01.herencia;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class ClienteNacional extends Cliente {
	private String nif;
	
	public ClienteNacional() {
		super();
		
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}	
	
}
