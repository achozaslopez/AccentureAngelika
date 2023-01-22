package ej02.agroalimentaria;

public class Producto {

		private String fechaCaducidad;
		private int numeroLote;
		
		public Producto() {
			super();
			
		}
		public String getFechaCaducidad() {
			return fechaCaducidad;
		}
		public void setFechaCaducidad(String fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}
		public int getNumeroLote() {
			return numeroLote;
		}
		public void setNumeroLote(int numeroLote) {
			this.numeroLote = numeroLote;
		}
		
		

}
