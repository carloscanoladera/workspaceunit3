package enumerates;

//Declaration of enum in java :

//Enum declaration can be done outside a Class or inside a Class but not inside a Method.

// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)
enum Color {
	RED, GREEN, BLUE;
}

public class EnumExampleColor {

	public static void main(String args[]) {
		Color c1 = Color.RED;
		Color c2 = Color.BLUE;

		Color c3 = Color.valueOf("GREEN");
		System.out.println(c1);

		System.out.println(c1 + " color order is " + c1.ordinal());
		System.out.println(c2 + " color order is " + c2.ordinal());
		System.out.println(c3 + " color order is " + c3.ordinal());
		if (!c1.equals(c2)) {

			System.out.println(c1 + " color and " + c2 + " color are different");

		}

	}
}
