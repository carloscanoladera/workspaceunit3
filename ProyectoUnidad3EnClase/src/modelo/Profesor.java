package educacion.modelo;

import educacion.constantes.Constantes;

public class Profesor extends EmpleadoEducacion {
	


	

	private String especialidad;
	private String cuerpo;
	private int experiencia;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String apellidos, 
			String telefono, 
			String direccion, double sueldoBruto,
			double irpf, String especialidad,
			String cuerpo, int experiencia) {
		
		super(nombre, apellidos, telefono, 
				direccion, sueldoBruto, irpf);
		this.especialidad=especialidad;
		this.cuerpo=cuerpo;
		this.experiencia=experiencia;
		
		// TODO Auto-generated constructor stub
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
   @Override
   public double calcularSueldo() {
		
		return this.getSueldoBruto() 
				- this.impuestos() 
				+ this.bonusExperiencia()
				 ;
	}
   
   @Override
   protected double impuestos() {
		
		return this.getSueldoBruto()*this.getIrpf();
	}
	
   
   private double bonusExperiencia() {
	   
	   return Constantes.BONUS*this.getExperiencia();
   }
	
   @Override
   public String funciones() {
		
		return "Enseñar materias de su especialidad";
	}
	
}