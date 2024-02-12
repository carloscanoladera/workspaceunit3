package ejercicios.ingles.exercice44;

import java.util.Comparator;

public class ComparatorForEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		
		String name1 = o1.getLastName() + " " + o1.getFirstName();
		String name2 = o2.getLastName() + " " + o2.getFirstName();
		
		return name1.compareTo(name2);
	}

}
