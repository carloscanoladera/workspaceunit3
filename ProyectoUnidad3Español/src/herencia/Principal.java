package herencia;

import claseobject.Estudiante;

/**
 *
 * @author carlo
 */
public class Principal {
    
    
    public static void main (String [] args) {
        
        Persona persona= new Persona("Pipi","Calle de arriba");
        Estudiante estudiante= new Estudiante("Popo","Calle de abajo","Informatica",8);
        EstudianteInternacional estudianteinternacional= 
                new EstudianteInternacional("Pupu","Calle de en medio","Informatica",8,"Urabia");
    
         System.out.println("Persona, nombre " + persona.getNombre()
                 + " Direccion: " + persona.getDireccion());
         
          System.out.println("sstudiante, nombre " + estudiante.getNombre()+
                  " Direccion: " + estudiante.getDireccion()
          + " Grado: " + estudiante.getEscuela() + " Nota: "+ estudiante.getNota());
          
           System.out.println("sstudiante, nombre " +
                   estudianteinternacional.getNombre()+ " Direccion: " 
                   + estudianteinternacional.getDireccion()
          + " Grado: " + estudianteinternacional.getEscuela() + " Nota: "
                   + estudianteinternacional.getNota() + " Pais: " 
                   + estudianteinternacional.getPais());
    
           
           
           Persona persona2 = (Persona) estudianteinternacional;
           
           System.out.println("sstudiante, nombre "+ persona2.getNombre()+" Transformado en persona");
                 
           
            Estudiante estudiante2 = (Estudiante) estudianteinternacional; 
             System.out.println("estudiante, nombre "+ persona2.getNombre()+" Transformado en estudiante");
            
            EstudianteInternacional casteadoinverso = (EstudianteInternacional) persona2;
            
             System.out.println("estudiante en clase Persona nombre "+ persona2.getNombre()+" Transformado en estudiante internacional de nuevo");
    } 
    
}
