package objectclass;

import java.util.Objects;

public class User{
	
	private int identifier=0;
        private String name;
        
        
        public User(int identifier, String name) {
		
		this.identifier= identifier;
                this.name=name;
        }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }
	
	
       	@Override
	public boolean equals(Object obj) {
                    
               
			
		return (obj.equals(this));
	}
		
		
	      	
	public boolean equals(User obj) {
                    
             
			
		return ((this.identifier ==  obj.identifier) &&
                        (this.name.equals(obj.name)));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(identifier, name);
	} 
	
	@Override
	public String toString() {
		return "User [identifier=" + identifier + ", name=" + name + "]";
	}

	
	public static void main(String[] args) {
		
		Object o = new Object();
		User e = new User(12,"Objeto1");
		
		User e2 = new User(12, "Objeto1");
		
		if (!o.equals(e)) 
			System.out.println("Objects are the same");
		
		if (!e.equals(o)) 
			System.out.println("Objects are different");
		
		
		if (e.equals(e2)) 
			System.out.println("Object e equals to e2 ");
	}

}

