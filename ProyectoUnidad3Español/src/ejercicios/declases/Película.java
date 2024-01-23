package ejercicios.declases;

/**
 * Esta clase define objetos que representan una Película. Una película tiene un
 * nombre, un director, un tipo, una duración, un año de estreno y una
 * calificación realizada por los usuarios.
 * 
 * @version 1.2/2020
 */


public class Película {
// Atributo que define el nombre de la película
	private String nombre;
// Atributo que define el director de la película
	private String director;

// Tipo de película como un valor enumerado

	public enum tipo {
		ACCIÓN, COMEDIA, DRAMA, SUSPENSO
	};

// Atributo que define el tipo de película
	tipo género;
// Atributo que define la duración de la película
	private int duración;
// Atributo que define el año de estreno de la película
	private int año;
// Atributo que define la calificación de la película por el público
	private double calificación;

	/**
	 * Constructor de la clase Película
	 * 
	 * @param nombre       Parámetro que define el nombre o título de la película
	 * @param director     Parámetro que define el nombre completo del director de
	 *                     la película
	 * @param género       Parámetro que define el género de la película
	 * @param duración     Parámetro que define la duración de una película (en
	 *                     minutos)
	 * @param año          Parámetro que define el año de estreno de la película
	 * @param calificación Parámetro que define la calificación de la pelicula
	 *                     realizada por el público
	 */

	public Película(String nombre, String director, tipo género, int duración, int año, double calificación) {
		this.nombre = nombre;
		this.director = director;
		this.género = género;
		this.duración = duración;
		this.año = año;
		this.calificación = calificación;
	}

	/**
	 * Método que devuelve el nombre de una película
	 * 
	 * @return El nombre de una película
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el nombre de una película
	 * 
	 * @param nombre Parámetro que define el nombre de una película
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el director de una película
	 * 
	 * @return El director de una película
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Método que establece el director de una película
	 * 
	 * @param director Parámetro que define el director de una película
	 */
	private void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Método que devuelve el género de una película
	 * 
	 * @return El género de una película
	 */
	public tipo getGénero() {
		return género;
	}

	/**
	 * Método que establece el género de una película
	 * 
	 * @param género Parámetro que define el género de una película
	 */
	private void setGénero(tipo género) {
		this.género = género;
	}

	/**
	 * Método que devuelve la duración de una película
	 * 
	 * @return La duración de una película
	 */
	public int getDuración() {
		return duración;
	}

	/**
	 * Método que establece la duración de una película
	 * 
	 * @param duración Parámetro que define la duración de una película
	 */
	private void setDuración(int duración) {
		this.duración = duración;
	}

	/**
	 * Método que devuelve el año de una película
	 * 
	 * @return El año de estreno de una película
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Método que establece el año de estreno de una película
	 * 
	 * @param año Parámetro que define el año de una película
	 */

	private void setAño(int año) {
		this.año = año;
	}

	/**
	 * Método que devuelve la calificación de una película
	 * 
	 * @return La calificación de una película
	 */
	public double getCalificación() {
		return año;
	}

	/**
	 * Método que establece la calificación de una película
	 * 
	 * @param calificación Parámetro que define la calificación de una película
	 */
	private void setCalificación(double calificación) {
		this.calificación = calificación;
	}

	/**
	 * Método que imprime en pantalla los datos de una película
	 */
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Director: " + director);
		System.out.println("Género: " + género);
		System.out.println("Duración: " + duración);
		System.out.println("Año: " + año);
		System.out.println("Calificación: " + calificación);
	}

	/**
	 * Método que determina si una película se puede considerar como épica
	 * 
	 * @return Valor booleano que determina si una película es épica o no
	 */
	public boolean esPelículaEpica() {
		/*
		 * Una película se considera épica si tiene una duración igual o superior a 180
		 * minutos
		 */
		if (duración >= 180) {
			return true;
		} else {

			return false;
		}
	}

	/**
	 * Método que determina la valoración cualitativa de una película
	 * 
	 * @return Valoración de una película
	 */
	private String calcularValoración() {
		if (calificación >= 0 && calificación <= 2) { /*
														 * Entre [0, 2] se considera "Muy mala"
														 */
			return "Muy mala";
		} else if (calificación > 2 && calificación <= 5) { /*
															 * Entre (2, 5] se considera "Mala"
															 */
			return "Mala";
		} else if (calificación > 5 && calificación <= 7) { /*
															 * Entre (5,7] se considera "Regular"
															 */
			return "Regular";
		} else if (calificación > 7 && calificación <= 8) { /*
															 * Entre (7,8] se considera "Buena"
															 */
			return "Buena";
		} else if (calificación > 8 && calificación <= 10) { /*
																 * Entre (8,10] se considera "Excelente"
																 */
			return "Excelente";
		} else {
			return "No tiene asignada una valoración válida";
		}
	}

	/**
	 * Método que determina si una película es similar a otra
	 * 
	 * @return Valor booleano que determina si una película es similar a otra
	 */
	public boolean esSimilar(Película película) {
		/*
		 * Dos películas son similares si ambas son del mismo género y si tienen la
		 * misma valoración
		 */
		if (película.género == género && película.calcularValoración() == calcularValoración()) {
			return true;
		} else {
			return false;
		}

	}
	/**
	 * Método main que crea dos películas, imprime sus datos en pantalla, determina
	 * si son épicas y si son similares
	 */

}
