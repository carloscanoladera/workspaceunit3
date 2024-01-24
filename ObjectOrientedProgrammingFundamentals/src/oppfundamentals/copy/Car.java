package oppfundamentals.copy;

public abstract class Car {
	protected String color;
	private String brand; 
	private String model;
	private double price;
	private double cost;
	
	
	
	public static final String TAG = "Car Object";
	private static int numberOfCars =0;
	
	
	public abstract String getTypeOfCar();
	
	
	public Car() {
		
		incrementNumberOfCarsCreated();
	}
	
	public  Car (String color, String brand, String model) {
		
		this.color=color;
		this.brand=brand;
		this.model = model;
		incrementNumberOfCarsCreated();
	}
	
	
	public  Car (String color, String brand, String model, double price, double cost) {
	
			this.color=color;
			this.brand=brand;
			this.model = model;
			this.price=price;
			this.cost=cost;
	
			incrementNumberOfCarsCreated();
						
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void rePaint (String color) {
		
		
		this.color=color;
	}
	
	
	public double profits(double vanRate) {
		
		return (price-cost) -taxes(vanRate);
		
	}
	
	
	
	private double taxes( double vanRate) {
		
		return (price-cost)*vanRate;
	}
	
	
private double taxes( double vanRate, double localTaxes) {
		
		return (price-cost)*vanRate + (price-cost)*localTaxes;
		
		
}

	
	public static int numberOfCarsCreated() {
		
		
		return numberOfCars;
	}
	
	private static void  incrementNumberOfCarsCreated() {
		
		numberOfCars = numberOfCars + 1;
		
	}
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", model=" + model + "]";
	}
	

}
