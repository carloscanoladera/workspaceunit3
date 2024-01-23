package claseobject;
public class EjemploEqualsHashCode {

 public static void main (String [] args) {
         
         Object o1= new Object();
         Object o2 = new Object();
         
     
        
          
          o1.hashCode();
          o2.hashCode();
          
          System.out.println("Para OBJECT");
         
          System.out.println("hashcode de o1 " + o1.hashCode());
          System.out.println("hashcode de o1 " + o2.hashCode());
          System.out.println("Son iguales los objetos o1 y o2 " + o1.equals(o2));
          
          System.out.println("toString  de o1 " + o1.toString());
          System.out.println("toString de o2 " + o2.toString());
          
          
          
         
          String s1 = new String("er");
          String s2 = new String("er");
        	
      
          System.out.println("Para STRING");
          
       
          System.out.println("hashcode de s1 " + s1.hashCode());
          System.out.println("hashcode de s2 " + s2.hashCode());
          System.out.println("Son iguales la cadena s1 y s2 " + s1.equals(s2));
          
          System.out.println("toString  de s1 " + s1.toString());
          System.out.println("toString de s2 " + s2.toString());
         
     }
     
	
}
