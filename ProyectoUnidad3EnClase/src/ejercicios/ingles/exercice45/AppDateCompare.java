package ejercicios.ingles.exercice45;

public class AppDateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date date = new Date(1,2,2002);
		Date date2 = new Date(1,1,2002);
		
		
		if (date.compareTo(date2)==1) {
			
			
			System.out.println(date + " is greater than " +date2);
		} else if (date.compareTo(date2)==0) {
			
			System.out.println(date + " equals to " +date2);
		} else {
			
			System.out.println(date + " is less than " +date2);
		}
	}

}
