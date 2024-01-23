package herencia;

import claseobject.Estudiante;

public class EstudianteInternacional extends Estudiante{
    
    private String Pais;

    
    public EstudianteInternacional(){
        
        
    }
        public EstudianteInternacional(String nombre, String direccion, String escuela, double nota,String Pais) {
     super(nombre,direccion,escuela,nota);
        this.Pais = Pais;
         this.Pais = Pais;
    }
    

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

}
