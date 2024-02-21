package ejercicios.ingles.exercice38_43;

public class MovableCircle implements Movable{
	
	private int radius=1;
	private MovablePoint center;
	
	public MovableCircle() {
		this.radius=1;
		this.center= new MovablePoint();
	}
	
	public MovableCircle(int radius, MovablePoint center) {
		super();
		this.radius = radius;
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public MovablePoint getCenter() {
		return center;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setCenter(MovablePoint center) {
		center = center;
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", Center=" + center + "]";
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.center.moveRight();
	}
	
	
	
	

}
