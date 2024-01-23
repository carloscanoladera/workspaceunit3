package generics;

public class ClassDouble implements GenericInterfaceExample<Double>{

	@Override
	public Double addition(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1+op2;
	}

	@Override
	public Double substraction(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1-op2;
	}

	@Override
	public Double product(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1*op2;
	}

	@Override
	public Double division(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1/op2;
	}

}
