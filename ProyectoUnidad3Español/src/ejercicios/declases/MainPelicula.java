package ejercicios.declases;

import ejercicios.declases.Película.tipo;

public class MainPelicula {
	
	public static void main(String ags[]) {
		Película película1 = new Película("Gandhi", "Richard Attenborough",	tipo.DRAMA,191,1982,8.3);
		Película película2 = new Película("Thor", "Kenneth Branagh", tipo.ACCIÓN, 115,2011,7.0);
		película1.imprimir();
		System.out.println();
		película2.imprimir();
		System.out.println();
		System.out.println("La película " + película1.getNombre() + " es épica: " + película1.esPelículaEpica());
		System.out.println("La película " + película2.getNombre() + " es épica: " + película2.esPelículaEpica());
		System.out.println("La película " + película1.getNombre() + " y la película " + película2.getNombre() + " son similares = " +
		película1.esSimilar(película2));
		}

}
