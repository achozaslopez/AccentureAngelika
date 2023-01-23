package herencia.equipos;

public class Miembro {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
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
	
	public Miembro() {
		super();
		setId(contador++);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}
	public void concentrarse() {
		System.out.println(getNombre() + " dice: estoy concentrado");
	}
	
	public void viajar() {
		System.out.println(getNombre() + " dice: estoy de viaje");
	}
	
}
