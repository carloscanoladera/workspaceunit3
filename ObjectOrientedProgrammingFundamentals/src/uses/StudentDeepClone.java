package uses;

class Reference2 implements Cloneable {

	public Reference2() {

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class StudentDeepClone implements Cloneable {
	private int stuId;
	private String name;
	private Reference2 reference;

	public int getStuId() {
		return stuId;
	}

	public void setEstId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reference2 getReference() {
		return reference;
	}

	public void setReference(Reference2 reference) {
		this.reference = reference;
	}

	StudentDeepClone(int rollno, String name) {
		this.stuId = rollno;
		this.name = name;
		this.reference = new Reference2();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		StudentDeepClone copy = (StudentDeepClone) super.clone();

		copy.setReference((Reference2) this.reference.clone());
		return copy;
	}

	public static void main(String args[]) {
		try {
			StudentDeepClone s1 = new StudentDeepClone(1, "Carlos");

			StudentDeepClone s2 = (StudentDeepClone) s1.clone();

			System.out.println(s1.getStuId() + " " + s1.getName() + " reference : " + s1.getReference());
			System.out.println(s2.getStuId() + " " + s2.getName() + " reference : " + s2.getReference());

		} catch (CloneNotSupportedException c) {
		}

	}

}
