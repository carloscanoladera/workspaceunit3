package generics;
public class GenericClassExample<T> { 
	
	private T operand1;
	private T operand2;
	
	
	public GenericClassExample(T operand1, T operand2) {
		
		
		this.operand1=operand1;
		this.operand2=operand2;
		
		
	}

public T getOperand1() {
		return operand1;
	}





	public void setOperand1(T operand1) {
		this.operand1 = operand1;
	}





	public T getOperand2() {
		return operand2;
	}





	public void setOperand2(T operand2) {
		this.operand2 = operand2;
	}


public String displayType () {
		
		return operand1.getClass().toString();
		
	}

	
	public boolean comparation() {
		
		return  operand1.equals(operand2);
		
	}
	
	public boolean comparationExternal(T op3) {
		
		
		return operand1.equals(op3);
	}
	
	
	@Override
	public String toString() {
		return "GenericClassExample [operand1=" + operand1 + ", operand2=" + operand2 + "]";
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		
		Double param =1.0;
		
		GenericClassExample<Double> genericDouble = new GenericClassExample<Double> (Double.valueOf(1),Double.valueOf(2));
		
		
		System.out.println("My generic class is typed as " + genericDouble.displayType());
		
		
		System.out.println("Both operands are equal? The response is " + genericDouble.comparation());
		
	System.out.println(" operand1 are the parameter? The response is " + genericDouble.comparationExternal(param));
		
GenericClassExample<Integer> genericInteger = new GenericClassExample<Integer> (Integer.valueOf(1),Integer.valueOf(2));
		
		
		System.out.println("My generic class is typed as " + genericInteger.displayType());
		
	
		System.out.println("Both operands are equal? The response is " + genericInteger.comparation());

		
	}

}
