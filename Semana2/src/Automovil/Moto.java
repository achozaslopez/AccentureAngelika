package Automovil;

public class Moto extends Vehiculo{
	private int cantidadDeposito;
	
	public Moto(int numMarchas, int velocidadMax, int numChasis, int numRuedas, int matricula, String modelo,
			int marchas) {
		super(numMarchas, velocidadMax, numChasis, numRuedas, matricula, modelo, marchas);
		
	}

	public int getCantidadDeposito() {
		return cantidadDeposito;
	}

	public void setCantidadDeposito(int cantidadDeposito) {
		this.cantidadDeposito = cantidadDeposito;
	}

	@Override
	public String toString() {
		return "Moto [cantidadDeposito=" + cantidadDeposito + "]";
	}
	

}
