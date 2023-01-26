package ejercicio.banco;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Vector;

public class Credito extends Tarjeta {
	private double mCredito;
	private Vector<Movimiento> mMovimientos;
	
	public static final double COMISION = 0.05;
	public static final double MINIMO_COMISION = 3.0;
	
	private LocalDate fMovimiento = LocalDate.now();
	
	public LocalDate getfMovimiento() {
		return fMovimiento;
	}

	public void setfMovimiento(LocalDate fMovimiento) {
		this.fMovimiento = fMovimiento;
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public Credito(String numero, String titular, LocalDate fechaCaducidad, double credito) {
		super(numero, titular, fechaCaducidad);
		mCredito = credito;
		mMovimientos = new Vector<Movimiento>();
	}
	
	public double getCreditoDisponible(){
		return mCredito + getSaldo();
	}
	
	public void ingresar(double x) throws Exception {
		if (x < 0) {
			throw new Exception("No es posible ingresar saldo negativo");
		}
		Movimiento m = new Movimiento();
		m.setFecha(getfMovimiento());
		m.setConcepto("Ingreso en cuenta asociada (cajero automático)");
		m.setImporte(x);
		mMovimientos.addElement(m);
	}
	
	public void liquidar(int mes, int anio) {
		Movimiento liquidar = new Movimiento();
		liquidar.setConcepto("Liquidación de operaciones tarj. crédito, " + mes + " de " + anio);
		double saldo = 0.0;
		for (int i = this.mMovimientos.size() - 1; i >= 0; i--) {
			Movimiento m = mMovimientos.elementAt(i);
			if (m.getFecha().getMonthValue() == mes && m.getFecha().getYear() == anio) {
				saldo += m.getImporte();
				mMovimientos.remove(i);
			}
		}
		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
			Movimiento m = (Movimiento)it.next();
			if(m.getFecha().getMonthValue() == mes && m.getFecha().getYear() == anio) {
				saldo += m.getImporte();
				it.remove();
			}
		}
		liquidar.setImporte(saldo);
		
		if(saldo != 0) {
			getmCuentaAsociada().addMovimiento(liquidar);
		}
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		Movimiento m = new Movimiento();
		m.setFecha(getfMovimiento());
		m.setConcepto("Compra a crédito en: " + datos);
		m.setImporte(x);
		mMovimientos.addElement(m);
	}
	
	public double getSaldo() {
		double saldo = 0.0;
		for (int i = 0; i < this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento)mMovimientos.elementAt(i);
			saldo += m.getImporte();
		}
		return saldo + getmCredito();
	}
	
	public void retirar (double x) throws Exception {
		if (x > 0) {
			x = x + (x * COMISION < MINIMO_COMISION ? MINIMO_COMISION : COMISION);
			if (x > getCreditoDisponible()) {
				throw new Exception("Crédito insuficiente");
			}
			Movimiento m = new Movimiento();
			m.setFecha(getfMovimiento());
			m.setConcepto("Retirada en cajero automático");
			m.setImporte(-x);
			mMovimientos.addElement(m);
		}
	}
}
