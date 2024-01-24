package oppfundamentals.copy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Car myTesla = new SUV("red","Tesla","Model S High Performace", 50000,30000);
		
		System.out.println(myTesla);
		
		Car myBMWi = new Sedan("blue"," BMW","i5",50000,40000,4);

		System.out.println(myBMWi);
		
		myBMWi.rePaint("white");
		
		System.out.println("MYBMW after repaint " + myBMWi);
		
		System.out.println("color Property access via Method " + myBMWi.getColor());
		
		
		System.out.println("Income from BMW sale:" + myBMWi.profits(0.10));
		System.out.println("Income from Tesla sale:" + myTesla.profits(0.10));
		
		System.out.println("Total cars created: "+ Car.numberOfCarsCreated());
		
		
		
		Car myTeslaSUVElectric = new SUV("red","Tesla","Model S High Performace", 50000,30000);

		myTeslaSUVElectric.rePaint("green");
		
	}

}
