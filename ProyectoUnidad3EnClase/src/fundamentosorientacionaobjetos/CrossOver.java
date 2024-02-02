package fundamentosorientacionaobjetos;
public class CrossOver extends Coche {
	
	private static final String  TYPE_CO="CrossOver";
	
	public CrossOver(String color, String marca, String modelo, double precio, double coste) {

		super();
	}
	
	

	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return TYPE_CO;
	}

	@Override
	public String toString() {
		return "CrossOver [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}




	
	
	

}