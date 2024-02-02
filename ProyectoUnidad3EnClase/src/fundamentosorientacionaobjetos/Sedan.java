package fundamentosorientacionaobjetos;

public class Sedan extends SUV{
	
	protected int numAsientos;

	public Sedan(String color, String marca, String modelo, double precio, double coste, int numAsientos) {
		super(color, marca, modelo, precio, coste);
		this.numAsientos=numAsientos;
		
	}

	@Override
	public String toString() {
		return "Sedan [numAsientos=" + numAsientos + ", getColor()=" + getColor() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}


	


}
