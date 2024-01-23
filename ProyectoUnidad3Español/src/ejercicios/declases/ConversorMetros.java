package ejercicios.declases;

/**
 * Esta clase define objetos de tipo ConversorMetros el cual permite realizar
 * conversiones entre diferentes unidades de medición de longitud.
 * 
 * @version 1.2/2020
 */
public class ConversorMetros {
	/*
	 * Atributo que define la cantidad de metros a convertir a diferentes unidades
	 * de longitud
	 */
	double metros;
	final int FACTOR_METROS_CM = 100; /*
										 * Factor de conversión de metros a centímetros
										 */
	final int FACTOR_METROS_MILIM = 1000; /*
											 * Factor de conversión de metros a milímetros
											 */
	final double FACTOR_METROS_PULGADAS = 39.37; /*
													 * Factor de conversión de metros a pulgadas
													 */
	final double FACTOR_METROS_PIES = 3.28; /*
											 * Factor de conversión de metros a pies
											 */
	final double FACTOR_METROS_YARDAS = 1.09361; /*
													 * Factor de conversión de metros a yardas
													 */

	/**
	 * Constructor de la clase ConversorMetros
	 * 
	 * @param metros Parámetro que define la cantidad de metros a convertir a otras
	 *               unidades de longitud
	 */
	public ConversorMetros(double metros) {
		this.metros = metros;
	}

	/**
	 * Método que convierte metros a centímetros
	 * 
	 * @return Resultado de la conversión de metros a centímetros
	 */
	public double convertirMetrosToCentímetros() {
		double centímetros;
		centímetros = FACTOR_METROS_CM * metros;
		return centímetros;
	}

	/**
	 * Método que convierte metros a milímetros
	 * 
	 * @return Resultado de la conversión de metros a milimetros
	 */
	public double convertirMetrosToMilímetros() {
		double milímetros;
		milímetros = FACTOR_METROS_MILIM * metros;
		return milímetros;
	}

	/**
	 * Método que convierte metros a pulgadas
	 * 
	 * @return Resultado de la conversión de metros a pulgadas
	 */
	public double convertirMetrosToPulgadas() {
		double pulgadas;
		pulgadas = FACTOR_METROS_PULGADAS * metros;
		return pulgadas;
	}

	/**
	 * Método que convierte metros a pies
	 * 
	 * @return Resultado de la conversión de metros a pies
	 */
	public double convertirMetrosToPies() {
		double pies;
		pies = FACTOR_METROS_PIES * metros;
		return pies;
	}

	/**
	 * Método que convierte metros a yardas
	 * 
	 * @return Resultado de la conversión de metros a yardas
	 */
	public double convertirMetrosToYardas() {
		double yardas;
		yardas = FACTOR_METROS_YARDAS * metros;
		return yardas;
	}

	
}