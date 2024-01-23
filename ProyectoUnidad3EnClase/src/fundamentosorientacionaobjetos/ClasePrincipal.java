package fundamentosorientacionaobjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj= new Object();
		Coche miCoche = new Coche();
		String s = new String("hola");
		String s2= "Hola";
		
		System.out.println(miCoche.toString());
		System.out.println(obj.toString());
		//ATRIBUTOS PUBLICOS NO
		//miCoche.publica="publica";
		
		Coche miTesla = new Coche("Rojo","Tesla","S");
		miTesla.repintar("Amarillo");
		System.out.println(miTesla);
		
		//System.out.println(Coche.numCoches);
		System.out.println(Coche.numCoches());
		
		miTesla.setModelo("S High Performance");
		System.out.println(miTesla);
		
		miCoche.setMarca("Ford");		
		miCoche.setModelo("Mondeo");
		System.out.println(miCoche);
		
		miCoche.setColor(miTesla.getColor());
	

	}

}
