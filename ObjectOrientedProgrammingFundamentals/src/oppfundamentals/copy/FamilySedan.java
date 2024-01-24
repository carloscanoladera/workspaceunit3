package oppfundamentals.copy;

public class FamilySedan extends Sedan{
	
	

	public FamilySedan(String color, String brand, String model, double price, double cost, int numSeats) {
		super(color, brand, model, price, cost, numSeats);
		// TODO Auto-generated constructor stub
	}


	public void printNumAsientos() {
		
		System.out.println("Number of seats " + numSeats);
		
	}

}
