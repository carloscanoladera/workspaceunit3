package interfacesherencia;

public class MyCalculator implements Calculator{

	@Override
	public void add(double x, double y) {
		
		double result = x+y;
		printResult(result);
		
	}

	@Override
	public void subtract(double x, double y) {
		
		double result = x-y;
		printResult(result);
		
		
	}

	@Override
	public void multiply(double x, double y) {
		// TODO Auto-generated method stub
		
		double result = x*y;
		printResult(result);
		
	}

	@Override
	public void divide(double x, double y) {
		// TODO Auto-generated method stub
		
		double result = x/y;
		printResult(result);
		
	}

	@Override
	public void printResult(double result) {
		// TODO Auto-generated method stub
		
		System.out.println("The result is : " + result);
		
	}
	
	
	

}
