package uses;
public class Employee {

    private String name;
    private int age;
    private int role;
    private int yearsofexperience;

    public Employee() {
    	
    	
    }

    public Employee(String name, int age, int role, int yearsofexperience) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.yearsofexperience = yearsofexperience;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getYearsofexperience() {
		return yearsofexperience;
	}

	public void setYearsofexperience(int yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}

    

}
