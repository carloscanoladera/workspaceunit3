package ejercicios.ingles.exercise29;

public class Staff extends Person{
	
	private String school;
	private double pay;
	
	
	public Staff() {
		
	}
	
	public Staff(String school, double pay) {
		super();
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public double getPay() {
		return pay;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	
	
	
}
