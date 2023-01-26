package ejercicio.banco;

import java.time.LocalDate;

 public class Tarjeta {
	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;
	
	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	public Tarjeta(String numero, String titular, LocalDate fechaCaducidad) {
		numero = mNumero;
		titular = mTitular;
		fechaCaducidad = LocalDate.from(fechaCaducidad); 
	}
	

	
	public void ingresar(double x) throws Exception {
		
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		
	}
	
	public void retirar(double x) throws Exception {
		
	}
	
	public void setCuenta(Cuenta c) {
		mCuentaAsociada = c;
	}

	@Override
	public String toString() {
		return "Tarjeta [mCuentaAsociada=" + mCuentaAsociada + ", mFechaDeCaducidad=" + mFechaDeCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + ", getmCuentaAsociada()=" + getmCuentaAsociada()
				+ ", getmFechaDeCaducidad()=" + getmFechaDeCaducidad() + ", getmNumero()=" + getmNumero()
				+ ", getmTitular()=" + getmTitular() +  "]";
	}
	
}
