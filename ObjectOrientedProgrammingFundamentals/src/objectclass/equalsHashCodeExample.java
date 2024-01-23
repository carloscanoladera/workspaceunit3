package objectclass;

public class equalsHashCodeExample {
	
	public static void main (String [] args) {
        
        Object o1= new Object();
        Object o2 = new Object();
        
        Object o3 = o1;
       
         
   
         
         System.out.println("For OBJECT");
        

         System.out.println("are o1 and o2 equal? " + o1.equals(o2));
         
         System.out.println("are o1 and o3 equal? " + o1.equals(o3));
         
         
         System.out.println("o1 hashcode  " + o1.hashCode());
         System.out.println("o2 hashcode " + o2.hashCode());
         System.out.println("o3 hashcode " + o3.hashCode());
         
         System.out.println("toString  for o1" + o1.toString());
         System.out.println("toString for o2" + o2.toString());
         
         
         
        
         String s1 = new String("er");
         String s2 = "er";
       	
     
         System.out.println("For STRING");
         
      

         System.out.println("are bot strings, s1 y s2 equal?" + s1.equals(s2));
         
         
         System.out.println("s1 hashcode " + s1.hashCode());
         System.out.println("s2 hashcode " + s2.hashCode());
         
         System.out.println("toString  de s1 " + s1.toString());
         System.out.println("toString de s2 " + s2.toString());
        
    }
	

}
