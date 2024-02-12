package ejercicios.declases.ejercicio34;

public class Ortodentista extends Medico{
	
	private TipologiaO tipo;

	public Ortodentista(String nombre, TipologiaO tipo) {
		super(nombre);
		// TODO Auto-generated constructor stub
		
		this.tipo=tipo;
	}

	public TipologiaO getTipo() {
		return tipo;
	}

	public void setTipo(TipologiaO tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ortodentista [tipo=" + tipo + ", nombre=" + getNombre() + "]";
	}
	
	

}
