package ej02.agroalimentaria;

public class ProductosFrescos extends Producto{
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos() {
		super();
		
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	

}
