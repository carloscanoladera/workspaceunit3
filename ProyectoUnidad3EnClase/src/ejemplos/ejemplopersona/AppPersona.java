package ejemplos.ejemplopersona;

import java.util.Scanner;

public class AppPersona {
	
	 static boolean enEjecucion=false;
	 
	 private int variableObjeto=0;
	
	 static {	
		
		 enEjecucion=true;	
		
	}
	 
	 static boolean estaEnEjecucion () {
		 
		 return enEjecucion;
	 }
	 
	 public int getVariableObjeto() {
		 
		 return variableObjeto;
	 }
	 
	 public void setVariableObjeto(int variableObjeto) {
		 
		 this.variableObjeto=variableObjeto;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variableObjeto=2;
		
		//devuelveVariableObjeto();
		
		
		AppPersona app= new AppPersona();
		
		app.variableObjeto=2;
		app.setVariableObjeto(2);
		
		System.out.println("Personas creadas:" + app.getVariableObjeto());
		
		enEjecucion=true;
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
		
		System.out.println("Programa en ejecución " + AppPersona.estaEnEjecucion());
		
		Scanner sc = new Scanner(System.in);
		
		
		
		Persona jesus = new Persona("Jesús", "Soto", 666, 2004);
		
		
		System.out.println(jesus);
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
		
		
		Persona alumno = new Persona();
		
		System.out.println("Vamos a crear un objeto persona. Introduce el nombre:"); 
		
		String nombre = sc.nextLine();
		
		alumno.setNombre(nombre);
		
		System.out.println("Introduce el apellido:");
		
		alumno.setApellidos(sc.nextLine());
		
		System.out.println("Introduce el id:");
		
		alumno.setId(sc.nextLong());		
		
		System.out.println("Introduce el año de nacimiento:");
		
		alumno.setAnoNacimiento(sc.nextInt());		
		
		System.out.println(alumno);
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
		

	}

}
