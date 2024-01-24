package oppfundamental;

public class AppInheritance {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		i=0;
		
		SUV myTeslaSUV = new SUV("red","Tesla",
				"Model S High Performace", 50000,30000);
		
		i= i + Car.numberOfCarsCreated();
		
		System.out.println("My new SUV:" + myTeslaSUV.toString());
		
		System.out.println("Total cars created: "+ Car.numberOfCarsCreated());
		
		myTeslaSUV.rePaint("White");
		
		System.out.println("My new SUV repainted:" + myTeslaSUV.toString());
		
		

		
		Car car2 = new Sedan("red","BMW",
				"320", 50000,30000,4 );
		
	
		
		car2.toString();
		
		
		
	}

}
