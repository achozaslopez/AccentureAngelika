package Automovil;

public class Vehiculo {
	private int numMarchas;
	private int velocidadMax;
	private int numChasis;
	private int numRuedas;
	private int matricula;
	private String modelo;
	private int marchas;
	
	static int contador;
	
	static {
		contador = 1500;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vehiculo.contador = contador;
	}

	public Vehiculo(int numMarchas, int velocidadMax, int numChasis, int numRuedas, int matricula, String modelo,
			int marchas) {
		super();
		this.numMarchas = numMarchas;
		this.velocidadMax = velocidadMax;
		this.numChasis = numChasis;
		this.numRuedas = numRuedas;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marchas = marchas;
	}

	@Override
	public String toString() {
		return "Vehiculo [numMarchas=" + numMarchas + ", velocidadMax=" + velocidadMax + ", numChasis=" + numChasis
				+ ", numRuedas=" + numRuedas + ", matricula=" + matricula + ", modelo=" + modelo + ", marchas="
				+ marchas + "]";
	}

	
}
