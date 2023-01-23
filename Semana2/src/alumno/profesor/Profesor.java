package alumno.profesor;

public class Profesor extends Persona{
	float salario;
	String fechaContratacion;
	
	public Profesor(String codPersona, String nombre, int edad, String telContacto, float f, String string) {
		super(codPersona, nombre, edad, telContacto);
		this.salario = salario;
		this.fechaContratacion = fechaContratacion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Profesor salario=" + salario +", fechaContratacion=" + fechaContratacion;
	}

}
