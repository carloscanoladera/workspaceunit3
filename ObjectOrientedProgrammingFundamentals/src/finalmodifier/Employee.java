package finalmodifier;

public final class Employee extends Person {

	private int id;

	private int salary;

	public Employee() {

		// person="Employee";

	}

	public Employee(int id, String firstName, String lastName, int salary) {

		super(firstName, lastName);
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {

		return this.salary * 12;
	}

	/*
	 * @Override public final String getFullName() {
	 * 
	 * return this.firstName + " " + this.lastName ; }
	 */

}
