package uses;

class Reference {

	public Reference() {

	}
}

public class StudentClone implements Cloneable {
	private int stuId;
	private String name;
	private Reference reference;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int estId) {
		this.stuId = estId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reference getReference() {
		return reference;
	}

	public void setReference(Reference reference) {
		this.reference = reference;
	}

	StudentClone(int rollno, String nombre) {
		this.stuId = rollno;
		this.name = nombre;
		this.reference = new Reference();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			StudentClone s1 = new StudentClone(1, "Carlos");

			StudentClone s2 = (StudentClone) s1.clone();

			System.out.println(
					s1.getStuId() + " Object name " + s1.getName().getBytes() + " reference : " + s1.getReference());
			System.out.println(
					s2.getStuId() + " Object name " + s2.getName().getBytes() + " reference : " + s2.getReference());

		} catch (CloneNotSupportedException c) {
		}

	}

}
