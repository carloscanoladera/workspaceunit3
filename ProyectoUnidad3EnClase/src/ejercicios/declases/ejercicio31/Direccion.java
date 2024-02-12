package ejercicios.declases.ejercicio31;

public class Direccion {
	
	private String Calle;
	private String Ciudad;
	private int codigoPostal;
	private int pais;

	public Direccion() {
		
		
	}
	
	public Direccion(String calle, String ciudad, int codigoPostal, int pais) {
		super();
		Calle = calle;
		Ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}

	public String getCalle() {
		return Calle;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public int getPais() {
		return pais;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [Calle=" + Calle + ", Ciudad=" + Ciudad + ", codigoPostal=" + codigoPostal + ", pais=" + pais
				+ "]";
	}
	
	

}
