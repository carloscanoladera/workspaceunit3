package oppfundamentals;

public class SUV extends Car{
	
	
	private static final String  TYPE_SUV="SUV";
	
	public SUV() {
		
		super();
	}

	public SUV(String color, String brand, String model, double price, double cost) {
		super(color, brand, model, price, cost);
		// TODO Auto-generated constructor stub
		
		
		this.color= color;
	}

	@Override
	public String toString() {
		return "SUV [color=" + color +   ", brand=" + this.getBrand() + ", model=" + this.getModel() + "]";
	}

	@Override
	public String getTypeOfCar() {
		// TODO Auto-generated method stub
		return "SUV";
	}
	
	
	
	
	
	
	

}
