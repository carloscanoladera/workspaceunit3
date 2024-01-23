package ejercicios.declases;

public class MainAtleta {
	
	/**
	 * Método main para instanciar cuatro atletas, mostrar sus datos en pantalla y
	 * obtener el tiempo total del equipo
	 */
	public static void main(String args[]) {
		Atleta atleta1 = new Atleta("Alejandro Perlaza", 9.55);
		atleta1.correr400metros();
		Atleta atleta2 = new Atleta("Anthony Zambrano", 9.28);
		atleta1.correr400metros();
		Atleta atleta3 = new Atleta("Diego Palomeque", 9.53);
		atleta1.correr400metros();
		Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);
		atleta1.correr400metros();
		Atleta.imprimirSelección();
		atleta1.imprimir();
		atleta2.imprimir();
		atleta3.imprimir();
		atleta4.imprimir();
		Atleta.imprimirTiempoEquipo();
	}

}
