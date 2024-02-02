package ejercicios.ingles.exercise28;

public class Circle {
	
	private double radius = 1.0;
	private String color ="Red";
	
	public Circle() {
		
		double radius = 1.0;
		String color ="Red";
		
	}
	
	public Circle(double radius) {
		this();		
		this.radius = radius;

	}

	
	public Circle(double radius, String color) {
		this();
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}


	public String getColor() {
		return color;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		
		
		return Math.PI*Math.pow(radius, 2);
		
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	

}
