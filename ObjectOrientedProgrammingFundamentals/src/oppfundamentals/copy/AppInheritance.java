package oppfundamentals.copy;

public class AppInheritance {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		i=0;
		

		
		
		
		SUVElectric myTeslaSUVElectric = new SUVElectric("red","Tesla",
				"Model S High Performace", 50000,30000,
				100, 17, 7);
		
		i= i + Car.numberOfCarsCreated();
		
		System.out.println("My new SUV:" + myTeslaSUVElectric.toString());
		
		System.out.println("Total cars created: "+ Car.numberOfCarsCreated());
		
		myTeslaSUVElectric.rePaint("White");
		
		System.out.println("My new SUV repainted:" + myTeslaSUVElectric.toString());
		
		
		
		Car car1 = new SUVElectric("red","Tesla",
				"Model S High Performace", 50000,30000,
				100, 17, 7);
		
		Car car2 = new Sedan("red","BMW",
				"320", 50000,30000,4 );
		
		car1.toString();
		
		car2.toString();
		
		
		
	}

}
