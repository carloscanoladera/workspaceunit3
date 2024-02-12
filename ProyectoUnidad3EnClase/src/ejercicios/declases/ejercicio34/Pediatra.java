package ejercicios.declases.ejercicio34;

public class Pediatra extends Medico{
	
	private Tipologia tipo;

	public Pediatra(String nombre, Tipologia tipo) {
		super(nombre);
		// TODO Auto-generated constructor stub
		
		this.tipo=tipo;
	}

	public Tipologia getTipo() {
		return tipo;
	}

	public void setTipo(Tipologia tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pediatra [tipo=" + tipo + ", nombre=" + getNombre() + "]";
	}
	
	

}
