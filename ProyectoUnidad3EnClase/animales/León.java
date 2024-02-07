package ejemplosclase.animales;

/**
 * Esta clase concreta denominada León es una subclase de Felino.
 * 
 * @version 1.2/2020
 */
public class León extends Felino {
	/**
	 * Método que devuelve un String con el sonido de un león
	 * 
	 * @return Un valor String con el sonido de un león: "Rugido"
	 */
	@Override
	public String getSonido() {
		return "Rugido";
	}

	/**
	 * Método que devuelve un String con los alimentos de un león
	 * 
	 * @return Un valor String con la alimentación de un león: "Carnívoro"
	 */
	@Override
	public String getAlimentos() {
		return "Carnívoro";
	}

	/**
	 * Método que devuelve un String con el hábitat de un león
	 * 
	 * @return Un valor String con el hábitat de un león: "Praderas"
	 */
	@Override
	public String getHábitat() {
		return "Praderas";
	}

	/**
	 * Método que devuelve un String con el nombre científico de un león
	 * 
	 * @return Un valor String con el nombre científico de un león: "Panthera leo"
	 */
	@Override
	public String getNombreCientífico() {
		return "Panthera leo";
	}
}