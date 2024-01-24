package enumerates;

import enumerates.ComplexEnumerateStudent;

public class AppEnumerates {
	
	public static void main(String args[]) 	    { 
		
		ComplexEnumerateStudent studentType1 = ComplexEnumerateStudent.EXCHANGE_STUDENT;
		ComplexEnumerateStudent studentType2 = ComplexEnumerateStudent.STATE_STUDENT;
		
		ComplexEnumerateStudent studentType3 = ComplexEnumerateStudent.valueOf("NATIONAL_STUDENT");
		
		System.out.println("Properties for student " + studentType1 + " are: ");
		System.out.println("Description: " + studentType1.getDescription() +
				
				" Id: " + studentType1.getId()
				+" Name: " + studentType1.getName());
		
		
		
		System.out.println("Ordinal for student " + studentType3+ " "+ studentType3.ordinal());
		
		
	}

}
