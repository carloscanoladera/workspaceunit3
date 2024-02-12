package ejemplosenclase.mamiferos;

import ejemplosclase.mamiferos.Medicamento.Posología;

public class MainMedicamento {
	/**
	 * Método que crea un medicamento y una posología para dicho medicamento. Luego,
	 * se muestran en pantalla tanto los datos del medicamento como de su posología
	 */
	public static void main(String args[]) {
		Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "Oral");
		/*
		 * Para crear una instancia de una clase interna se debe referir al objeto donde
		 * está contenida la clase interna
		 */
		Posología posología = medicamento.new Posología("Adultos y 	mayores de 16 años", 500, "6 horas",
				"No debe tomar este 	medicamento con el estómago vacío.");
		medicamento.setPosología(posología);
		medicamento.imprimir();
		/*
		 * Para invocar un método de la clase interna se debe indicar el nombre de la
		 * clase contenedora
		 */
		medicamento.posología.imprimir();
	}

}
