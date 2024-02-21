package ejercicios.declases.ejercicio55.modelo;

public class Conserje extends EmpleadoEducacion{

	   @Override
	   public String funciones() {
			
			return "Realizar labores de conserje";
		}
	
	   
		@Override
		public double calcularSueldo() {
		
			return this.getSueldoBruto()- impuestos();
		}
	   
		protected double impuestos() {
			
			return this.getSueldoBruto()*this.getIrpf();
		}
		
		
		@Override
		public String toString() {
			return "Conserje [nombre=" + ", nombre=" + getNombre()
			+ ", apellidos=" + getApellidos() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion()
			+ ", sueldoBruto" + getSueldoBruto() + ", irpf)=" + getIrpf() + "]";
		}
		
}
