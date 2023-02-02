package juegocartas;

public class Carta {
    private String valor;
    private String palo;
    public static final int NUM_CARTAS = 52;
    
	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public static int getNumCartas() {
		return NUM_CARTAS;
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}
    
}

