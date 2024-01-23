package generics;

public class ClassLong implements GenericInterfaceExample<Long> {

	@Override
	public Long addition(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1+op2;
	}

	@Override
	public Long substraction(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1-op2;
	}

	@Override
	public Long product(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1*op2;
	}

	@Override
	public Long division(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1/op2;
	}
	
	
}
