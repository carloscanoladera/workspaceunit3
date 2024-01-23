package enclase;

import enclase.modelo.Coche;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche cocheVacio = new Coche();
		
		
		Coche cocheRellenado = new Coche("rojo", "Ford" , "Ford T");
		
		cocheRellenado.repintar("blanco");
		
		System.out.println(cocheRellenado.toString());
		
		
		cocheRellenado.setModelo("Ford Mondeo");
		
		System.out.println(cocheRellenado.toString());
		
		System.out.println("Marca del coche: " + cocheRellenado.getMarca());
		
		Math.sin(23);
		

		
	}

}
