package ejemplosenclase.animales;

/**
 * Esta clase prueba diferentes animales y sus métodos.
 * 
 * @version 1.2/2020
 */
public class MainPrueba {
	/**
	 * Método main que crea un array de varios animales y para cada uno muestra en
	 * pantalla su nombre científico, su sonido, alimentos y hábitat
	 */
	public static void main(String[] args) {
		Animal gato, perro, lobo, leon; /*
										 * Define un array de cuatro elementos de tipo Animal
										 */
		gato = new Gato();
		perro = new Perro();
		lobo = new Lobo();
		leon = new León();

		System.out.println(lobo.getNombreCientífico());
		System.out.println("Sonido: " + lobo.getSonido());
		System.out.println("Alimentos: " + lobo.getAlimentos());

		System.out.println("Hábitat: " + lobo.getHábitat());
		System.out.println();

	}
}