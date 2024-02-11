package ejercicios.ingles.exercise32;

public class Rectangle extends Shape{
	private double width=1.0;
	private double height=1.0;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, boolean filled,double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}



	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*this.width+ 2*this.height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + getColor() + ", filled="
				+ isFilled() + "]";
	}

	
	
}
