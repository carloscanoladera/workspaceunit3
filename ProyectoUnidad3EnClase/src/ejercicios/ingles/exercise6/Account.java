package ejercicios.ingles.exercise6;

public class Account {
	
	private String id;
	private String name;
	private int balance;
	
	public Account() {
		
		
	}
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

    public void credit(int amount) {
    	
    	this.balance+= amount;
    	
    }
    
  public void debit(int amount) {
    	
    	if (balance >= amount) { 
    		balance-=amount;
    	}else {
    		
    		System.out.println("The amount to withdraw is greater than the balance");
    	}
    	
    }
    
   public void transferTo(Account another, int amount) {
	   
	   
	  	if (balance >= amount) { 
    		balance-=amount;
    		 another.credit(amount);
    	}else {
    		
    		System.out.println("The amount to transfer is greater than the balance");
    	}
	   
	  
   }
    
	
	
	
	
}
