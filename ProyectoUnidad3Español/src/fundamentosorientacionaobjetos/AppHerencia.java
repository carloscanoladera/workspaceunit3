package fundamentosorientacionaobjetos;



public class AppHerencia {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV miTeslaSUV = new SUV("red","Tesla","Model S High Performace", 50000,30000);
		
	
		
		System.out.println("Mi nuevo SUV:" + miTeslaSUV.toString());
		
		System.out.println("Total de coches creados: "+ Coche.numeroDeCochesCreados());
		
		
		miTeslaSUV.repintar("blanco");
		
		
		System.out.println("Mi nuevo SUV repintado:" + miTeslaSUV.toString());

		SUVElectrico coche1 = new SUVElectrico("rojo","Tesla",
				"Model S High Performace", 50000,30000,20,7,5);
		
		Sedan coche2 = new Sedan("azul","BMW",
				"320", 50000,30000,4);
		
		System.out.println("Mi nuevo SUV:" + coche1.toString());
		
		System.out.println("Mi nuevo Sedan:" + coche2.toString());

	}

}
