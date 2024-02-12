package ejercicios.declases.ejercicio31;

public abstract class Persona implements Humano {

	private String nombre;
	private String apellidos;
	private String NIF;

	private Direccion direccion;

	public Persona() {

	}

	public Persona(String nombre, String apellidos, String nIF, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		NIF = nIF;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion
				+ "]";
	}

}
