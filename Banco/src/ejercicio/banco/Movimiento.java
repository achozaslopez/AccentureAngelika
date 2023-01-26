package ejercicio.banco;

import java.time.LocalDate;

public class Movimiento {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento() {
	}
	
	public String getConcepto() {
		return mConcepto;
	}
	
	public LocalDate getFecha() {
		return mFecha;
	}
	
	public double getImporte() {
		return mImporte;
	}
	
	public void setConcepto(String newMConcepto) {
		
	}
	
	public void setFecha(LocalDate newMFecha) {
		
	}
	
	public void setImporte(double newMImporte) {
		
	}

	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte
				+ ", getConcepto()=" + getConcepto() + ", getFecha()=" + getFecha() + ", getImporte()=" + getImporte()
				+ "]";
	}
	
}
