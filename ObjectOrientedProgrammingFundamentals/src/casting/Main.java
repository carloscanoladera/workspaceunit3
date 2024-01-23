package casting;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Pipi", "Calle de arriba");
		Student student = new Student("Popo", "Calle de abajo", "Informatica", 8);
		InternationalStudent internationalstudent = new InternationalStudent("Pupu", "Calle de en medio", "Informatica",
				8, "Urabia");

		System.out.println("Person, name " + person.getName() + " Address: " + person.getAddress());

		System.out.println("student, name " + student.getName() + " Address: " + student.getAddress() + " College: "
				+ student.getSchool() + " Score: " + student.getScore());

		System.out.println("student, name " + internationalstudent.getName() + " Address: "
				+ internationalstudent.getAddress() + " College: " + internationalstudent.getSchool() + " Score: "
				+ internationalstudent.getScore() + " Country: " + internationalstudent.getCountry());

		Person person2 = (Person) internationalstudent;

		System.out.println("student, name " + person2.getName() + " Converting to Person");

		Student student2 = (Student) internationalstudent;
		System.out.println("student, name " + person2.getName() + " Converting to student");

		InternationalStudent reverseCasting = (InternationalStudent) person2;

		System.out.println("student in  " + person2.getName()
				+ " Converting to international student again");
	}

}
