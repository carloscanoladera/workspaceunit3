package enclase.modelo;

public class Coche {
	private String color;
	private String marca; 
	private String modelo;
	
	public Coche() {
		
		
	}
	
	public Coche (String color, String marca, String modelo) {
	
		
			limpiaModelo();
			this.color=color;
			this.marca=marca;
			this.modelo = modelo;
	
	}
	
	
	
	private void limpiaModelo() {
		
		this.modelo="";
		
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

	@Override
	public String toString() {
		return "Car [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	

}
