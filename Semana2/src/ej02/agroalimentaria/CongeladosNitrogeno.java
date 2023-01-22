package ej02.agroalimentaria;

public class CongeladosNitrogeno extends ProductosCongelados{
	private String metodoCongelacion;
	private int tiempoExposicion;
	
	public CongeladosNitrogeno() {
		super();
		
	}
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}
	public int getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	

}
