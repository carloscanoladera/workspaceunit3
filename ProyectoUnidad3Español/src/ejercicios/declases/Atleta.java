package ejercicios.declases;

/**
 * Esta clase define objetos que representan un Atleta con un identificador,
 * nombre, selección a la que pertenecen, tiempo obtenido en la competición y
 * tiempo del equipo.
 * 
 * @version 1.2/2020
 */
public class Atleta {
	/*
	 * Atributo estático que se incrementa con la creación de un atleta y se asigna
	 * como identificador
	 */
	static int contador = 0; /*
								 * Atributo estático que cuenta los atletas creados
								 */
	int identificador; // Atributo que define el identificador de un atleta
	String nombre; // Atributo que define el nombre de un atleta
	/*
	 * Atributo que define el tiempo obtenido por un atleta en una competicion
	 * atlética
	 */
	double tiempo;
// Atributo estático que define el nombre de la selección de un atleta
	static String selección = "Colombia";
	/*
	 * Atributo estático que totaliza los tiempos de cada atleta para obtener el
	 * tiempo del equipo
	 */
	static double tiempoEquipo;

	/**
	 * Constructor de la clase Atleta
	 * 
	 * @param nombre Parámetro que define el nombre completo del atleta
	 * @param tiempo Parámetro que define el tiempo obtenido por el atleta en una
	 *               competición deportiva
	 */
	public Atleta(String nombre, double tiempo) {
		/*
		 * Cuando se crea un atleta se incrementa este contador para calcular el total
		 * de atletas
		 */
		contador++;
		identificador = contador; // Se asigna el contador al identificador
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	/**
	 * Método para acumular el tiempo total del equipo a partir de la suma de los
	 * tiempos de cada atleta en una carrera de 400 metros
	 */
	public void correr400metros() {
		tiempoEquipo = tiempoEquipo + tiempo;
	}

	/**
	 * Método para mostrar en pantalla los datos de un atleta
	 */
	public void imprimir() {
		System.out.println("Identificador del atleta = " + identificador);
		System.out.println("Nombre del atleta = " + nombre);
		System.out.println("Tiempo del atleta = " + tiempo + "segundos");
		System.out.println();
	}

	/**
	 * Método estático para mostrar en pantalla el nombre de la selección del equipo
	 */
	public static void imprimirSelección() {
		System.out.println("Selección = " + selección);

	}

	/**
	 * Método estático para mostrar en pantalla el tiempo obtenido por el equipo
	 */
	public static void imprimirTiempoEquipo() {
		System.out.println("Tiempo del equipop = " + tiempoEquipo + "segundos");
	}

	
}