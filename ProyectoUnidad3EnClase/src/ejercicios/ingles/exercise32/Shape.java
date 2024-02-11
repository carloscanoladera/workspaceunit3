package ejercicios.ingles.exercise32;

public abstract class Shape {
	
	private String color="red";
	private boolean filled=true;
	
	
	public Shape() {
		
	}


	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	
	public abstract double getArea() ;
	public abstract double getPerimeter();

	public String getColor() {
		return color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}



	
	
	

}
