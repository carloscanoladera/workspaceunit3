package fundamentosorientacionaobjetos;

public class SUV extends Coche {
	
	private static final String  TYPE_SUV="SUV";

	public SUV(String color, String marca, String modelo, double precio, double coste) {
		
		super(color, marca, modelo, precio, coste);

	}
	
	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return TYPE_SUV;
	}
	

	@Override
	public String toString() {
		return "SUV [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}




	
	
	

}
