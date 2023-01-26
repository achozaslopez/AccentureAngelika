package ejercicio04;
/**
 * 
 * @author Angelika Chozas López
 *
 *	Clase padre SmartDevice
 */
public class SmartDevice {
	protected String pantalla;
	protected double peso;
	protected double tamanio;
	protected String duracionBateria;
	protected String dimensiones;
	protected String color;
	protected String marca;
	/**
	 * 
	 * Clase SmartPhone que hereda de SmartDevice
	 *
	 */
	public static class SmartPhone extends SmartDevice {
		private int memoria;
		private String sistemaOperativo;
		private String procesador;
		private int resolucion;
		private int ppp;
		
		/**
		 * Constructor vacio
		 */
		public SmartPhone() {}
		/**
		 * Constructor con parametros
		 * @param String pantalla
		 * @param double peso
		 * @param double tamanio
		 * @param String duracionBateria
		 * @param String dimensiones
		 * @param String color
		 * @param String marca
		 * @param int memoria
		 * @param String sistemaOperativo
		 * @param String procesador
		 * @param int resolucion
		 * @param int ppp
		 */
		public SmartPhone(String pantalla, double peso, double tamanio, String duracionBateria,
				  String dimensiones, String color, String marca, int memoria, String sistemaOperativo, 
				  String procesador, int resolucion, int ppp) {
			this.pantalla = pantalla;
			this.peso = peso;
			this.tamanio = tamanio;
			this.duracionBateria = duracionBateria;
			this.dimensiones = dimensiones;
			this.color = color;
			this.marca = marca;
			this.memoria = memoria;
			this.sistemaOperativo = sistemaOperativo;
			this.procesador = procesador;
			this.resolucion = resolucion;
			this.ppp = ppp;
		}
		/**
		 * Metodo toString SmartPhone
		 */
		@Override
		public String toString() {
			return "SmartPhone [memoria=" + memoria + ", sistemaOperativo=" + sistemaOperativo + ", procesador="
					+ procesador + ", resolucion=" + resolucion + ", ppp=" + ppp + ", pantalla=" + pantalla + ", peso="
					+ peso + ", tamanio=" + tamanio + ", duracionBateria=" + duracionBateria + ", dimensiones="
					+ dimensiones + ", color=" + color + ", marca=" + marca + "]";
		}
	}
	/**
	 * 
	 * Clase SmartWatch que hereda de SmartDevice
	 *
	 */
	public static class SmartWatch extends SmartDevice{
		private boolean llamadasBluetooth;
		/**
		 * Constructor vacio
		 */
		public SmartWatch() {}
		/**
		 * Constructor con parametro
		 @param String pantalla
		 * @param double peso
		 * @param double tamanio
		 * @param String duracionBateria
		 * @param String dimensiones
		 * @param String color
		 * @param String marca
		 * @param boolean llamadasBluetooth
		 */
		public SmartWatch(String pantalla, double peso, double tamanio, String duracionBateria,
						  String dimensiones, String color, String marca, boolean llamadasBluetooth) {
			this.pantalla = pantalla;
			this.peso = peso;
			this.tamanio = tamanio;
			this.duracionBateria = duracionBateria;
			this.dimensiones = dimensiones;
			this.color = color;
			this.marca = marca;
			this.llamadasBluetooth = llamadasBluetooth;
		}
		
		/**
		 * Metodo toString SmartWatch
		 */
		@Override
		public String toString() {
			return "SmartWatch [llamadasBluetooth=" + llamadasBluetooth + ", pantalla=" + pantalla + ", peso=" + peso
					+ ", tamanio=" + tamanio + ", duracionBateria=" + duracionBateria + ", dimensiones=" + dimensiones
					+ ", color=" + color + ", marca=" + marca + "]";
		}
	}
}
