package ejercicios.declases.ejercicio9;

public class Atleta {

	private static int numAtletas=0;
	private static double tiempoEquipo=0;
	private static final String  seleccion="Colombia";
	private int id;
	private String nombre;
	private double tiempo;
	
	
	
	public Atleta( String nombre, double tiempo) {
		
		numAtletas++;
		this.id = numAtletas;
		this.nombre = nombre;
		this.tiempo = tiempo;
		
		
		tiempoEquipo+= tiempo;
		
		
	}



	public int getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public double getTiempo() {
		return tiempo;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	
	public static void correrCuatrocientosMetros(double tiempoEquipo) {
		
		Atleta.tiempoEquipo=tiempoEquipo;
	}
	
	
	public static void imprimeNombre() {
		
		System.out.println(Atleta.seleccion);
		
		
	}
	
	public static void imprimeTiempoTotal() {
		
		System.out.println(Atleta.tiempoEquipo);
		
		
	}



	@Override
	public String toString() {
		return "Atleta [id=" + id + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
	}
	
	
	
	 

}
