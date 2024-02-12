package ejercicios.declases.ejercicio34;

public class Medico {
	
	private String nombre;
	
	public Medico() {
		
	}

	public Medico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + "]";
	}
	
	

}
