package ejercicios.declases;

/**
 * Esta clase define objetos de tipo Planeta con un nombre, cantidad de
 * satélites, masa, volumen, diámetro, distancia al sol, tipo de planeta y si es
 * observable o no.
 * 
 * @version 1.2/2020
 */

enum tipoPlaneta {
	GASEOSO, TERRESTRE, ENANO
}
public class Planeta {
// Atributo que define el nombre de un planeta
	String nombre = null;
// Atributo que define la cantidad de satélites que tiene un planeta
	int cantidadSatélites = 0;
// Atributo que define la masa de un planeta
	double masa = 0;
// Atributo que define el volumen de un planeta
	double volumen = 0;
// Atributo que define el diámetro de un planeta
	int diámetro = 0;
// Atributo que define la distancia al sol de un planeta
	int distanciaSol = 0;

// Atributo que define el tipo de planeta como un valor enumerado
	

// Atributo que define el tipo de planeta
	tipoPlaneta tipo;
// Atributo que define si el planeta es observable o no
	boolean esObservable = false;


	Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaSol,
			tipoPlaneta tipo, boolean esObservable) {
		this.nombre = nombre;
		this.cantidadSatélites = cantidadSatélites;
		this.masa = masa;
		this.volumen = volumen;
		this.diámetro = diámetro;
		this.distanciaSol = distanciaSol;
		this.tipo = tipo;
		this.esObservable = esObservable;
	}

	/**
	 * Método que imprime en pantalla los datos de un planeta
	 */
	void imprimir() {
		System.out.println("Nombre del planeta = " + nombre);
		System.out.println("Cantidad de satélites = " + cantidadSatélites);
		System.out.println("Masa del planeta = " + masa);
		System.out.println("Volumen del planeta = " + volumen);
		System.out.println("Diámetro del planeta = " + diámetro);
		System.out.println("Distancia al sol = " + distanciaSol);
		System.out.println("Tipo de planeta = " + tipo);
		System.out.println("Es observable = " + esObservable);
	}

	/**
	 * Método que calcula y devuelve la densidad de un planeta
	 * 
	 * @return La densidad calculada del planeta
	 */
	double calcularDensidad() {
		return masa / volumen;
	}

	/**
	 * Método que determina y devuelve si un planeta es exterior o no
	 * 
	 * @return Valor booleano que indica si el planeta es exterior o no
	 */
	boolean esPlanetaExterior() {
		float límite = (float) (149597870 * 3.4);
		/*
		 * Un planeta exterior está situado más allá del cinturón de asteroides
		 */
		/*
		 * El cinturón se encuentra entre 2,1 y 3,4 UA (UA = 149.597.870 Km)
		 */
		if (distanciaSol > límite) {
			return true;
		} else {
			return false;
		}
	}
}