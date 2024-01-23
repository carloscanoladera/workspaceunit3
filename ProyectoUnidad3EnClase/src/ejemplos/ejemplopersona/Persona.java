package ejemplos.ejemplopersona;

import java.time.LocalDate;
import java.util.ArrayList;



public class Persona {
	
	//posee nombre, apellido, número de documento de identidad y año de nacimiento
	
	private String nombre;
	private String apellidos;
	private long id;
	private int anoNacimiento;
	private static int numPersonas;

	
	static {
		
		numPersonas=0;
				
	}	
	
	public Persona() {
		
		numPersonas++;
	}
	
	public Persona (String nombre, String apellidos, long id,int anoNacimiento) {
		
		this.nombre=nombre;		
		this.apellidos=apellidos;
		this.id=id;
		this.anoNacimiento= anoNacimiento;
		numPersonas++;
	}
	
	public static int getNumPersonas() {
		
		
		return numPersonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	
	
	public int calculaEdad(int anoActual) {		
			
		
		return  anoActual -anoNacimiento;		
		
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", anoNacimiento="
				+ anoNacimiento + "]";
	}
	
	
	
}
