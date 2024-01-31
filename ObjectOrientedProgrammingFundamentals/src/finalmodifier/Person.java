package finalmodifier;

public class Person {

	private String firstName;
	private String lastName;
	protected final String person = "Person";

	public Person() {

	}

	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		// person="Person2";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getFullName() {

		return this.firstName + " " + this.lastName;
	}
	
	public  String getFullName(String aka) {

		return this.firstName + " " + this.lastName + " " + aka;
	}

}
