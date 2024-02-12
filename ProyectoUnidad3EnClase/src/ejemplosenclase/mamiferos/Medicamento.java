package ejemplosenclase.mamiferos;

/**
 * Esta clase denominada Medicamento modela un medicamento con los atributos
 * nombre del medicamento, su fabricante, vía en que se administra el
 * medicamento y una posología para el medicamento
 * 
 * @version 1.2/2020
 */
public class Medicamento {
	String nombre; // Atributo que define el nombre de un medicamento
	String fabricante; /*
						 * Atributo que define el nombre del fabricante de un medicamento
						 */
	String víaAdministración; /*
								 * Atributo que define la vía de administración de un medicamento
								 */
	Posología posología; /*
							 * Atributo que define la posología de un medicamento
							 */

	/**
	 * Constructor de la clase Medicamento
	 * 
	 * @param nombre            Parámetro que define el nombre del medicamento
	 * @param fabricante        Parámetro que define el nombre del fabricante del
	 *                          medicamento
	 * @param víaAdministración Parámetro que define la vía de administración del
	 *                          medicamento
	 */
	Medicamento(String nombre, String fabricante, String víaAdministración) {
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.víaAdministración = víaAdministración;
	}

	/**
	 * Método que establece la posología de un medicamento
	 * 
	 * @param posología Parámetro que define la posología que se recomienda para un
	 *                  medicamento
	 */
	void setPosología(Posología posología) {
		this.posología = posología;
	}

	/**
	 * Método que muestra en pantalla los datos de un medicamento
	 */
	void imprimir() {
		System.out.println("Nombre del medicamento = " + nombre);
		System.out.println("Fabricante del medicamento = " + fabricante);
		System.out.println("Vía de administración = " + víaAdministración);
	}

	/**
	 * Esta clase "interna" se denomina Posología y modela la forma en que se debe
	 * tomar un medicamento. Para ello, se indican los tipos de usuarios, la dosis
	 * recomendada, el periodo de tiempo de aplicación del medicamento y
	 * recomendaciones adicionales
	 */
	class Posología {
		String usuarios; /*
							 * Atributo que define los tipos de usuarios de un medicamento
							 */
		int dosis; /*
					 * Atributo que define la dosis a aplicar de un medicamento
					 */
		String periodo; /*
						 * Atributo que define el periodo de aplicación de un medicamento
						 */
		String recomendaciones; /*
								 * Atributo que define las recomendaciones para un medicamento
								 */

		/**
		 * Constructor de la clase Posología
		 * 
		 * @param usuarios        Parámetro que define los usuarios del medicamento
		 * @param dosis           Parámetro que define la dosis del medicamento
		 * @param periodo         Parámetro que define el tiempo y regularidad de
		 *                        administración del medicamento
		 * @param recomendaciones Parámetro que define posibles recomendaciones
		 *                        adicionales sobre el uso del medicamento
		 */

		Posología(String usuarios, int dosis, String periodo, String recomendaciones) {
			this.usuarios = usuarios;
			this.dosis = dosis;
			this.periodo = periodo;
			this.recomendaciones = recomendaciones;
		}

		/**
		 * Método que muestra en pantalla los datos de una posología
		 */
		void imprimir() {
			System.out.println("Usuarios = " + usuarios);
			System.out.println("Dosis = " + dosis);
			System.out.println("Periodo = " + periodo);
			System.out.println("Recomendaciones = " + recomendaciones);
		}
	}

	
}
