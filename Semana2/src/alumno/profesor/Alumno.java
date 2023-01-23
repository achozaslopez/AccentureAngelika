package alumno.profesor;

public class Alumno extends Persona{
	int curso;
	
	public Alumno(String codPersona, String nombre, int edad, String telContacto, int i) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
			
}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Curso alumno=" + curso;
	}
}