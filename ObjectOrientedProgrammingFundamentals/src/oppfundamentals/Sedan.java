package oppfundamentals;

public class Sedan extends Car {

	protected int numSeats;

	private final String TypeOfCar = "SEDAN"; 
	
	public Sedan() {

	}

	public Sedan(String color, String brand, String model, double price, double cost, int numSeats) {
		super(color, brand, model, price, cost);
		// TODO Auto-generated constructor stub
		this.numSeats= numSeats;
	}



	@Override
	public String getTypeOfCar() {
		// TODO Auto-generated method stub
		return TypeOfCar;
	}

}
