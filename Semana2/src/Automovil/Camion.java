package Automovil;

public class Camion extends Vehiculo {
	private int pesoMax;
	private int precio;
	
	
	public Camion(int numMarchas, int velocidadMax, int numChasis, int numRuedas, int matricula, String modelo,
			int marchas, int pesoMax, int precio) {
		super(numMarchas, velocidadMax, numChasis, numRuedas, matricula, modelo, marchas);
		this.pesoMax = pesoMax;
		this.precio = precio;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Camion [pesoMax=" + pesoMax + ", precio=" + precio + "]";
	}
	
}
