package casting;

public class Student extends Person {

	private String school;
	private double score;

	public Student() {
		this.school = school;
		this.score = score;
	}

	public Student(String name, String address, String school, double score) {
		super(name, address);
		this.school = school;
		this.score = score;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
