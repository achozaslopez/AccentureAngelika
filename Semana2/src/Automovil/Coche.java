package Automovil;

public class Coche extends Vehiculo implements CuatroXCuatro{
	private String color;
	private int numPuertas;
	private String modelo;
	private boolean situacion4x4;
	
	public Coche(int numMarchas, int velocidadMax, int numChasis, int numRuedas, int matricula, String modelo,
			int marchas) {
		super(numMarchas, velocidadMax, numChasis, numRuedas, matricula, modelo, marchas);
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isSituacion4x4() {
		return situacion4x4;
	}


	public void setSituacion4x4(boolean situacion4x4) {
		this.situacion4x4 = situacion4x4;
	}


	@Override
	public void activarReductora(boolean activar) {
		situacion4x4 = activar;
	}
}
