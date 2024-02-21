package ejercicios.declases.ejercicio55;


import ejercicios.declases.ejercicio55.modelo.Profesor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profesor prof = new Profesor("Profe","Gonzalez","94532223", 
			"Calle la rua 18", 2500.03,
			0.18, Profesor.CUERPO_SECUNDARIA,
			"Informatica", 10);
		
		System.out.println("Funciones " + prof.funciones());
		
		System.out.println(prof);

	}

}
