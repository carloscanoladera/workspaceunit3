package enclase.modelo;

public class SUV extends Coche{

	private static final String  TYPE_SUV="SUV";
	
	
	public SUV(String color, String marca, String modelo, double precio, double coste) {
		super(color, marca, modelo, precio, coste);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SUV [color=" + this.getColor() +   ", marca=" + this.getMarca() + ", modelo=" + this.getModelo() + "]";
	}

	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return TYPE_SUV;
	}



}

