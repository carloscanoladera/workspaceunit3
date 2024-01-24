package enclase.modelo;



public class AppHerencia {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV miTeslaSUV = new SUV("red","Tesla","Model S High Performace", 50000,30000);
		
	
		
		System.out.println("Mi nuevo SUV:" + miTeslaSUV.toString());
		
		System.out.println("Total de coches creados: "+ Coche.numeroDeCochesCreados());
		
		
		miTeslaSUV.repintar("blanco");
		
		
		System.out.println("Mi nuevo SUV repintado:" + miTeslaSUV.toString());

		
		Sedan coche2 = new Sedan("azul","BMW",
				"320", 50000,30000,4);
		
		
		
		System.out.println("Mi nuevo Sedan:" + coche2.toString());

	}

}
