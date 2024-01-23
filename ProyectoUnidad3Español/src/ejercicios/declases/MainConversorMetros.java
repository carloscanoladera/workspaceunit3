package ejercicios.declases;

public class MainConversorMetros {
	
	/**
	 * Método main que define una cierta cantidad de metros y los convierte a
	 * diferentes unidades de longitud
	 */
	public static void main(String args[]) {
		ConversorMetros conversor = new ConversorMetros(3.5);
		System.out.println("Metros = " + conversor.metros);
		System.out.println("Metros a centímetros = " + conversor.convertirMetrosToCentímetros());
		System.out.println("Metros a milímetros = " + conversor.convertirMetrosToMilímetros());
		System.out.println("Metros a pulgadas = " + conversor.convertirMetrosToPulgadas());
		System.out.println("Metros a pies = " + conversor.convertirMetrosToPies());
		System.out.println("Metros a yardas = " + conversor.convertirMetrosToYardas());
	}

}
