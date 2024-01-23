package uses;

public class ImmutableEmployee {

	private String name;
	private int age;
	private int role;
	private int yearsofexperience;

	public ImmutableEmployee() {
	}

	public ImmutableEmployee(String name, int age, int role, int yearsofexperience) {
		this.name = name;
		this.age = age;
		this.role = role;
		this.yearsofexperience = yearsofexperience;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRole() {
		return role;
	}

	public int getYearsofexperience() {
		return yearsofexperience;
	}

}
