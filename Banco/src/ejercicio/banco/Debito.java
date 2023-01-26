package ejercicio.banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	public Debito(String numero, String titular, LocalDate fecha) {
		super(numero,titular,fecha);
	}
	
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}
	@Override
	public void ingresar(double x) throws Exception {
		getmCuentaAsociada().ingresar("Ingreso en cajero automático ", x);
	}
	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		getmCuentaAsociada().retirar("Compra en : ", x);
	}
	@Override
	public void retirar(double x) throws Exception {
		getmCuentaAsociada().retirar("Retirada en cajero automático ", x);
	}

	@Override
	public String toString() {
		return "Debito [getSaldo()=" + getSaldo() + ", getmCuentaAsociada()=" + getmCuentaAsociada()
				+ ", getmFechaDeCaducidad()=" + getmFechaDeCaducidad() + ", getmNumero()=" + getmNumero()
				+ ", getmTitular()=" + getmTitular() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
