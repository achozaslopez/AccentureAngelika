package herencia.equipos;

public class Entrenador extends Miembro{
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String idFederacion;
	
	private static int contador = 500;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getIdFederacion() {
		return idFederacion;
	}
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	public Entrenador(int i, String string, String string2, int j, String string3) {
		super();
		setId(contador++);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		setIdFederacion(idFederacion);
	}
	
	public void dirigirPartido() {
		System.out.println(getNombre() + " dice: estoy dirigiendo un partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println(getNombre() + " dice: estoy dirigiendo un entrenamiento");
	}
	@Override
	public String toString() {
		return "Entrenador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", idFederacion=" + idFederacion + "]";
	}
	
}
