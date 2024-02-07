package ejemplosclase.profesores;

/**
 * Esta clase denominada ProfesorTitular es una subclase de Profesor
 * 
 * @version 1.2/2020
 */
public class ProfesorTitular extends Profesor {
	
	
	private int anos=0;
	
	
	public ProfesorTitular(int anos) {
		super();
		this.anos = anos;
	}

	/**
	 * Método que sobreescribe el método imprimir heredado de la clase padre
	 * Profesor
	 */
	protected void imprimir() {
		System.out.println("Es un profesor titular.");
	}
	
	/**
	* Método que imprime en pantalla la cantidad de años que tiene un
	* profesor siendo titular
	*/
	protected void imprimirAños() {
	System.out.println("Años = " + this.anos);
	}
}