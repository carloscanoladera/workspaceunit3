package ejercicios.declases.ejercicio3;

public enum EnumCalificacion {
	
	MUY_MALA("MUY MALA",0,2),
	MALA("MALA",2,5),
	REGULAR("REGULAR",5,7),
	BUENA("BUENA",7,8),
	MUY_BUENA("MUY BUENA",8,10);
	
	
	private String descripcion; 
	private int minCalification;
	private int maxCalification;

	EnumCalificacion(String descripcion,int minRange,int maxRange) {
		this.descripcion=descripcion;
		this.minCalification= minRange;
		this.maxCalification= maxRange;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getMinCalification() {
		return minCalification;
	}

	public int getMaxCalification() {
		return maxCalification;
	}



	

	
}
