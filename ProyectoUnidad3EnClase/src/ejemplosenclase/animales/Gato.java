package ejemplosenclase.animales;

/**
 * Esta clase concreta denominada Gato es una subclase de Felino.
 * 
 * @version 1.2/2020
 */
public class Gato extends Felino {
	/**
	 * Método que devuelve un String con el sonido de un gato
	 * 
	 * @return Un valor String con el sonido de un gato: "Maullido"
	 */
	@Override
	public String getSonido() {
		return "Maullido";
	}

	/**
	 * Método que devuelve un String con los alimentos de un gato
	 * 
	 * @return Un valor String con la alimentación de un gato: "Ratones"
	 */
	@Override
	public String getAlimentos() {
		return "Ratones";
	}


	@Override
	public String getHábitat() { return "Doméstico"; } 
	
	/**
	 * Método que devuelve un String con el hábitat de un gato
	 * 
	 * @return Un valor String con el hábitat de un gato: "Doméstico"
	 * 
	 *         public String getHábitat() { return "Doméstico"; } /** Método que
	 *         devuelve un String con el nombre científico de un gato
	 * @return Un valor String con el nombre científico de un gato: "Felis
	 *         silvestris catus"
	 */
	@Override
	public String getNombreCientífico() {
		return "Felis silvestris catus";

	}


}