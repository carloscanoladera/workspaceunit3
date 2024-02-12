package ejercicios.declases.ejercicio31;

public class Estudiante extends Persona {
	
	private int idEstudiante;

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion, int idEstudiante) {
		super(nombre, apellidos, nIF, direccion);
		this.idEstudiante=idEstudiante;
		// TODO Auto-generated constructor stub
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", Nombre=" + getNombre() + ", Apellidos="
				+ getApellidos() + ", NIF=" + getNIF() + ", Direccion()=" + getDireccion() + "]";
	}

	@Override
	public void identificate() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass());
	}
	
	
	

}
