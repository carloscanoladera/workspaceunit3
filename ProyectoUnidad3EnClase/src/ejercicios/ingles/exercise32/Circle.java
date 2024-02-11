package ejercicios.ingles.exercise32;

public class Circle extends Shape {

	private double radius = 1.0;

	
	public Circle(String color, boolean filled) {

		super(color, filled);

		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filled, double radius) {

		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + getColor() + ", filled=" + isFilled() + "]";
	}

	
	
}
