package usos;

class Referencia2 implements Cloneable{
	
	public Referencia2() {
	
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}


public class ClonacionEstudianteProfunda  implements Cloneable {
	private int estId;
	private String nombre;
	private Referencia2 referencia;
	
	
	public int getEstId() {
		return estId;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Referencia2 getReferencia() {
		return referencia;
	}

	public void setReferencia(Referencia2 referencia) {
		this.referencia = referencia;
	}

	ClonacionEstudianteProfunda(int rollno, String nombre) {
		this.estId = rollno;
		this.nombre = nombre;
		this.referencia = new Referencia2();
	}

	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ClonacionEstudianteProfunda copia=  (ClonacionEstudianteProfunda) super.clone();
		
		copia.setReferencia( (Referencia2) this.referencia.clone());
		return copia;
	}

	public static void main(String args[]) {
		try {
			ClonacionEstudianteProfunda s1 = new ClonacionEstudianteProfunda(1, "Carlos");

			ClonacionEstudianteProfunda s2 = (ClonacionEstudianteProfunda) s1.clone();

			System.out.println(s1.getEstId() + " " + s1.getNombre()+ " referencia : " + s1.getReferencia());
			System.out.println(s2.getEstId() + " " + s2.getNombre()+ " referencia : " + s2.getReferencia());

		} catch (CloneNotSupportedException c) {
		}

	}


}
