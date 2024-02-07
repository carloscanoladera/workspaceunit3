package ejercicios.declases.ejercicio3;

public class Pelicula {

	private String nombre;
	private String director;
	private EnumPeliculas genero;

	// duracion en minutos
	private int duracion;
	private int annio;
	private double calificacion;

	public Pelicula() {

	}

	public Pelicula(String nombre, String director, EnumPeliculas genero, int duracion, int annio,
			double calificacion) {

		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.duracion = duracion;
		this.annio = annio;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDirector() {
		return director;
	}

	public EnumPeliculas getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getAnnio() {
		return annio;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setGenero(EnumPeliculas genero) {
		this.genero = genero;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setAnnio(int annio) {
		this.annio = annio;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion="
				+ duracion + ", annio=" + annio + ", calificacion=" + calificacion + "]";
	}

	public boolean esPeliculaEpica() {

		return this.duracion >= 180;
	}

	public String calcularValoración() {

		String resultado = "";

		if (this.calificacion <= EnumCalificacion.MUY_MALA.getMaxCalification()) {

			resultado = EnumCalificacion.MUY_MALA.getDescripcion();
		} else if (this.calificacion <= EnumCalificacion.MALA.getMaxCalification()) {

			resultado = EnumCalificacion.MALA.getDescripcion();
		} else if (this.calificacion <= EnumCalificacion.REGULAR.getMaxCalification()) {

			resultado = EnumCalificacion.REGULAR.getDescripcion();
		} else if (this.calificacion <= EnumCalificacion.BUENA.getMaxCalification()) {

			resultado = EnumCalificacion.BUENA.getDescripcion();
		} else {

			resultado = EnumCalificacion.MUY_BUENA.getDescripcion();
		}

		return resultado;

	}
	
	
	public boolean esSimilar(Pelicula pelicula) {
		
		
		return (this.genero.equals(pelicula) &&
				this.calificacion==pelicula.getCalificacion());
	}

}
