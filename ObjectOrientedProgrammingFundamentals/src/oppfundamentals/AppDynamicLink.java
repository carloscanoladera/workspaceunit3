package oppfundamentals;
public class AppDynamicLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car miTesla = new SUV ("red","Tesla","Model S High Performace", 50000,30000);
		
	
		
		Car miBMWi = new Sedan("blue"," BMW","i5",50000,40000,4);
		
		
		
		System.out.println(miTesla.toString());
		
		System.out.println(miBMWi.toString());
	}

}
