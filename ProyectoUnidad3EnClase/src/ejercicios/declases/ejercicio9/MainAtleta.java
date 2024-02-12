package ejercicios.declases.ejercicio9;

public class MainAtleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atleta at1 = new Atleta("Alejandro Perlaza",9.55);
		Atleta at2 = new Atleta("Anthony Zambrano",9.28);
		Atleta at3 = new Atleta("Diego Palomeque",9.53);
		Atleta at4 = new Atleta("Gilmar Herrera",9.29);
		System.out.println(at4);
		Atleta.imprimeNombre();
		Atleta.imprimeTiempoTotal();
	}

}
