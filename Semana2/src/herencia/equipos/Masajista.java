package herencia.equipos;

public class Masajista extends Miembro{
	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista(String titulacion, int aniosExperiencia) {
		super();
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	
}
