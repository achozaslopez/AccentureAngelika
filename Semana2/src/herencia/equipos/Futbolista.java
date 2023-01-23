package herencia.equipos;

public class Futbolista extends Miembro {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private int dorsal;
	private String demarcacion;
	
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
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	public Futbolista() {
		super();
		setId(contador++);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
	}
	
	
	public Futbolista(int i, String string, String string2, int j, int k, String string3) {
		
	}
	public void jugarPartido() {
		System.out.println(getNombre() + " dice: estoy jugando un partido");
	}
	
	public void entrenar() {
		System.out.println(getNombre() + " dice: estoy entrenando");
	}
	@Override
	public String toString() {
		return "Futbolista [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
}
