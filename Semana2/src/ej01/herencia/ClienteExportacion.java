package ej01.herencia;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class ClienteExportacion extends Cliente {
	private String VAT;


	public ClienteExportacion() {
		super();
		this.getNombre();
		this.getDireccion();
		this.getCorreoElectronico();
		this.getVAT();
		
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}


}
