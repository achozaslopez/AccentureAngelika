package ejercicio.banco;

import java.util.ArrayList;


public class Cuenta {
	final int TITULAR_MAX = 40;
	final int TITULAR_MIN = 15;
	private String mNumero;
	private String mTitular;
	private ArrayList<Movimiento> mMovimientos;
	
	public Cuenta(String numero, String titular) throws Exception {
		//if(Filtros.cumpleLongitud(mTitular, TITULAR_MAX, TITULAR_MIN)) {
			this.mNumero = numero;
			mTitular = titular;
			mMovimientos = new ArrayList<Movimiento>();
		//}else {
		//	throw new Exception("Error en el tamaño del titular");
		//}
		
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
		this.mTitular = getmTitular();
	}

	public ArrayList<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(ArrayList<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
	
	public void addMovimiento(String concepto, double x) {
		
	}
	
	public void addMovimiento(Movimiento m) {
		
	}
	
	public double getSaldo() {
		double saldo = 2000;
		for (Movimiento m : mMovimientos) {
			saldo += m.getImporte();
		}
		return saldo;
	}
	
	public void ingresar(double x) throws Exception {
		ingresar("Ingreso en efectivo ", x);
	}
	
	public void ingresar(String concepto, double x) throws Exception {
		if (x <= 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		addMovimiento(concepto, x);	
	}

	public void retirar(double x) throws Exception {
		if (x <= 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < x) {
			throw new Exception("Saldo insuficiente");
		}
		retirar("Retirada de efectivo ", x);
	}
	
	public void retirar(String concepto, double x) throws Exception {
		if (x <= 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < x) {
			throw new Exception("Saldo insuficiente");
		}
		
		addMovimiento(concepto, -x);
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [TITULAR_MAX=" + TITULAR_MAX + ", TITULAR_MIN=" + TITULAR_MIN + ", mNumero=" + mNumero
				+ ", mTitular=" + mTitular + ", mMovimientos=" + mMovimientos + ", getmNumero()=" + getmNumero()
				+ ", getmTitular()=" + getmTitular() + ", getmMovimientos()=" + getmMovimientos() + ", getSaldo()="
				+ getSaldo() + "]";
	}


	//public void verMovimientos(){
		//ListarMovimientos.print("Listado Movimientos");
	//}
}