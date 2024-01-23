package genericas;

public class ClassLong implements GenericInterfaceExample<Long> {

	@Override
	public Long suma(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1+op2;
	}

	@Override
	public Long resta(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1-op2;
	}

	@Override
	public Long producto(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1*op2;
	}

	@Override
	public Long division(Long op1, Long op2) {
		// TODO Auto-generated method stub
		return op1/op2;
	}
	
	
}
