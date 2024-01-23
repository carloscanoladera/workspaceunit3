package claseobject;

import herencia.Persona;

public class Estudiante  extends Persona {
	   
    private String escuela;
    private double nota;
    
    
    public Estudiante() {
        this.escuela = escuela;
        this.nota = nota;
    }

public Estudiante(String nombre, String direccion, String escuela, double nota) {        
	super(nombre,direccion);
	this.escuela = escuela;
       	 this.nota = nota;
   	 }
    
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    
}


