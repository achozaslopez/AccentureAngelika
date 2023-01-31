package juegocartas;

public class Cartas {
    int numero;
    String palo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return "Cartas [numero=" + numero + ", palo=" + palo + ", getNumero()=" + getNumero() + ", getPalo()="
				+ getPalo() + "]";
	}

}

