package oppfundamentals;

public class SUVElectric extends Car implements ElectricInterface, ISeats{
	private static final String  TYPE_SUV_ELECTRIC="SUVElectric";
	private double bateryCapacity=0;
	private double compsumption=0;
	private int numberOfSeats=0;
	
	
	public SUVElectric(String color, String brand, 
			String model, double price, double cost,
			double batteryCapacity, double compsumption,
			int seats) {
		super(color, brand, model, price, cost);
		
		this.bateryCapacity=batteryCapacity;
		this.compsumption= compsumption;
		this.numberOfSeats=seats;
		
	}
	
	
	
	

	@Override
	public String getTypeOfCar() {
		// TODO Auto-generated method stub
		return TYPE_SUV_ELECTRIC;
	}





	@Override
	public double batteryCapacity() {
		// TODO Auto-generated method stub
		return bateryCapacity;
	}





	@Override
	public double powerComsumptionPerHundred() {
		// TODO Auto-generated method stub
		return powerComsumptionPerHundred();
	}





	@Override
	public int numberOfSeats() {
		// TODO Auto-generated method stub
		return numberOfSeats;
	}





	@Override
	public String toString() {
		return "SUV [color=" + color +   ", brand=" + this.getBrand() +
				", model=" + this.getModel() + 	", bateryCapacity=" +
				bateryCapacity +  ", compsumption=" +  compsumption +   
				", numberOfSeats=" + numberOfSeats + "]";
	}










	@Override
	public boolean equals(Object obj) {
	
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SUVElectric suv = (SUVElectric) obj;
		if (bateryCapacity == suv.bateryCapacity && 
				numberOfSeats == suv.numberOfSeats &&
				this.getModel().equals(suv.getModel()) &&
				this.getColor().equals(suv.getColor()) &&
					this.getBrand().equals(suv.getBrand())	)
			
			return true;
		
		else 
			return false;
	}

	@Override
	public int hashCode() {

		
	String  stringOfFields =	bateryCapacity + this.bateryCapacity +
				 this.numberOfSeats +
				this.getModel() +
				this.getColor() +
					this.getBrand();
	
	
		return stringOfFields.hashCode();
	}

	
}
