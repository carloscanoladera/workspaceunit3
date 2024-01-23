package ejercicios.declases;

public class MainArticuloCientifico {

	/**
	 * Método main que instancia un artículo científico y muestra sus datos en
	 * pantalla
	 */
	public static void main(String args[]) {
		String[] palabras = { "Física", "Espacio", "Tiempo" };
		ArtículoCientífico artículo = new ArtículoCientífico("La teoría especial de la relatividad", "Albert Einstein",
				"Física, Espacio ,Tiempo", "Anales de Física", 1913,
				"Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
		artículo.imprimir();
	}
	
}
