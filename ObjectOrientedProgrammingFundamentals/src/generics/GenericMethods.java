package generics;

public class GenericMethods {
	
	public static <T,U> void print(T arg1, U arg2) {
		
		
		System.out.println(arg1+ "\n" + arg2);
		
	}
	
	public static <T extends Number,U extends Number> boolean compare(T a, U b) {
		
		return a.equals(b);
		
	}
	
	public static <T extends Number> T number(T num) {
		
		
		return num;
	}

	public static void main(String[] args) {
	
		
		
		print (5, "");
		
		compare(5,Integer.valueOf(5));
		
		number(Double.valueOf(5.0));
	}

}
