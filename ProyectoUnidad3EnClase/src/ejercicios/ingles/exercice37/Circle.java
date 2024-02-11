package ejercicios.ingles.exercice37;

public class Circle implements GeometricFigure {

	private double radius = 1.0;

	
	public Circle() {

		super();

		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {

		
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
		return "Circle [radius=" + radius +  "]";
	}

	
	
}
