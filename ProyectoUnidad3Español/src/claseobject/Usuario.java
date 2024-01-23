package claseobject;

import java.util.Objects;

public class Usuario{
	
	private int identificador=0;
        private String nombre;
        
        
        public Usuario(int identificador, String nombre) {
		
		this.identificador= identificador;
                this.nombre=nombre;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	
       	@Override
	public boolean equals(Object obj) {
                    
               
			
		return (obj.equals(this));
	}
		
		
	      	
	public boolean equals(Usuario obj) {
                    
             
			
		return ((this.identificador ==  obj.identificador) &&
                        (this.nombre.equals(obj.nombre)));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(identificador, nombre);
	} 
	
	@Override
	public String toString() {
		return "Usuario [identificador=" + identificador + ", nombre=" + nombre + "]";
	}

	
	public static void main(String[] args) {
		
		Object o = new Object();
		Usuario e = new Usuario(12,"Objeto1");
		
		Usuario e2 = new Usuario(12, "Objeto1");
		
		if (!o.equals(e)) 
			System.out.println("Son Objetos distintos");
		
		if (!e.equals(o)) 
			System.out.println("Son Objetos distintos");
		
		
		if (e.equals(e2)) 
			System.out.println("Son Objetos iguales");
	}

}

