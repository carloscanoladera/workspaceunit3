
package fundamentosorientacionaobjeto;
public abstract class  Coche {
	private String color;
	private String marca; 
	private String modelo;
	private double precio;
	private double coste;
	
	private static int numeroDeCoches=0;
	
	public abstract String getTipoCoche();
	
	public Coche (String color, String marca, String modelo,double precio, double coste) {
	
			this.color=color;
			this.marca=marca;
			this.modelo = modelo;
			this.precio=precio;
			this.coste= coste;
			Coche.incrementaElNumeroDeCoches();
	
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public void repintar(String color) {
		
		
		this.color=color;
	}
	
	
public double beneficios(double iva) {
		
		return (precio-coste) -impuestos(iva);
		
	}
	
	
	
	private double impuestos( double iva) {
		
		return (precio-coste)* iva;
	} 


	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	


public static int numeroDeCochesCreados() {
		
		
		return numeroDeCoches;
	}


public static void  incrementaElNumeroDeCoches() {
		
		numeroDeCoches = numeroDeCoches + 1;
		
	}

	
	
}

