package ejercicio.banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	public Debito(String numero, String titular, LocalDate fecha) {
		super(numero,titular,fecha);
	}
	
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}
	
	public void ingresar(double x) throws Exception {
		getmCuentaAsociada().ingresar("Ingreso en cajero automático ", x);
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		getmCuentaAsociada().retirar("Compra en : ", x);
	}
	
	public void retirar(double x) throws Exception {
		getmCuentaAsociada().retirar("Retirada en cajero automático ", x);
	}

}
