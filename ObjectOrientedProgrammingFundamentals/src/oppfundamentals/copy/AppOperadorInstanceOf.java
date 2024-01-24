package oppfundamentals.copy;
public class AppOperadorInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car miTesla = new SUV ("red","Tesla","Model S High Performace", 50000,30000);
		
	
		
		Car miBMWi = new Sedan("blue"," BMW","i5",50000,40000,4);

		
		
		if (miTesla instanceof SUV) {
			
			System.out.println("miTesla car is a SUV");
		}
		
		
		if (miTesla instanceof Sedan) {
			
			System.out.println("miTesla is  a Sedan");
		} else {
			

			System.out.println("miTesla car is not a Sedan");

			if (miTesla instanceof Car)  {
				
				System.out.println("miTesla is a Car");
			}
			
		}
		
		

	}

}
