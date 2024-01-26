package finalmodifier;

public final class Employee extends Person {

	private int id;

	private int salary;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName, int salary) {

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

	public int raiseSalary(int percent) {

		Double percentage = (double) percent / 100;
		double salaryDec = this.salary;
		salaryDec = salaryDec + salaryDec * percentage;
		setSalary((int) Math.round(salaryDec));

		// setSalary(Long.valueOf(Math.round(Double.valueOf(percent)/100*Double.valueOf(this.getSalary())+Double.valueOf(this.getSalary()))).intValue());

		return this.salary;

	}
	
	//@Override
	//public String getName() {
		
	//}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", getId()=" + getId() + ", getSalary()=" + getSalary()
				 + "]";
	}

	
	
}
