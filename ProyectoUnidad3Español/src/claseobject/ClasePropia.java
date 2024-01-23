package claseobject;

class ClaseInterna {
    
    public ClaseInterna() {
        
        
    }
}

public class ClasePropia {
  
    public ClasePropia() {
        super();
        System.out.println("Clase propia. Cuando creo el objeto en  new creo el constructor");
    }
    

     public static void main (String [] args) {
         
         Object o= new Object();
         ClasePropia miclase = new ClasePropia();
         
         o.equals(miclase);
          miclase.equals(o);
          
          o.hashCode();
          miclase.hashCode();
          
          ClaseInterna cl = new ClaseInterna(); 
         
     }
     
}
