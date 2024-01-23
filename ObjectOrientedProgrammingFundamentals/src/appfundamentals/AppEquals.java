package appfundamentals;

import oppfundamentals.SUVElectric;

public class AppEquals {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SUVElectric myTeslaSUVElectric = new SUVElectric("red","Tesla",
				"Model S High Performace", 50000,30000,
				100, 17, 7);
		
		
		SUVElectric myTeslaSUVElectric2 = new SUVElectric("red","Tesla",
				"Model S High Performace", 55000,32000,
				100, 17, 7);
		
		
		System.out.println("Are both cars equal? " + myTeslaSUVElectric.equals(myTeslaSUVElectric2));
		
		
		System.out.println("myTesla hashCode " + myTeslaSUVElectric.hashCode());
		System.out.println("myTesla2 hashCode " + myTeslaSUVElectric.hashCode());
	}

}
