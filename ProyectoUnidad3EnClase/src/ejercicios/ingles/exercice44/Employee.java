package ejercicios.ingles.exercice44;

public class Employee implements Comparable<Employee> {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName, int salary) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {

		return this.firstName + " " + this.lastName;
	}

	public int getAnnualSalary() {

		return this.salary * 12;
	}

	public int raiseSalary(int percent) {

		Double percentage = (double) percent / 100;
		double salaryDec = this.salary;
		salaryDec = salaryDec + salaryDec * percentage;
		setSalary((int) Math.round(salaryDec));

		// setSalary(Long.valueOf(Math.round(Double.valueOf(percent)/100*Double.valueOf(this.getSalary())+Double.valueOf(this.getSalary()))).intValue());

		return this.salary;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
				
		
		return this.salary>o.getSalary()?1:(this.salary==o.getSalary()?0:-1) ;
	}

}
