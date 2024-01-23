package fundamentosorientacionaobjetos;

public class AppLigaduraDinamica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miTesla = new SUV ("rojo","Tesla","Model S High Performace", 50000,30000);
		
	
		
		Coche miBMWi = new Sedan("azul"," BMW","i5",50000,40000,4);
		
		
		
		System.out.println(miTesla.toString());
		
		System.out.println(miBMWi.toString());
	}

}
