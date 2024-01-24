package enumerados;

public enum EnumCoches {
	
	ELECTRICO(1, "Motor eléctrico", "SEV"),
	DIESEL(2, "Motor Diesel", "DV"),
	GAS(3, "Motor de gas", "GV"),	
	HIDROGENO(4, "Motor de hidrógeno", "HEV");

	
	private int id;
	private String tipoMotor;
	private String tipoCoche;
	
	private EnumCoches(int id, String tipoMotor, String tipoCoche) {
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.tipoCoche = tipoCoche;
	}

	public int getId() {
		return id;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public String getTipoCoche() {
		return tipoCoche;
	}

	

	
	
	
}
