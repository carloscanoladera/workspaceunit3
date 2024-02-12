package ejemplosenclase.profesores;

/**
 * Esta clase prueba las clase Profesor y ProfesorTitular utilizando el
 * polimorfismo
 * 
 * @version 1.2/2020
 */
public class MainProfesores {
	/**
	 * Método main que crea un Profesor pero instanciando la clase ProfesorTitular.
	 * ¿Qué se imprimirá en pantalla?
	 */
	public static void main(String[] args) {
		Profesor profesor1 = new ProfesorTitular(10);
		profesor1.imprimir();
	}
}