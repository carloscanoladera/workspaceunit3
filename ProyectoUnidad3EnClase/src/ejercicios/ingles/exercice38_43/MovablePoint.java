package ejercicios.ingles.exercice38_43;

public class MovablePoint implements Movable {
	
	private int x=0;
	private int y=0;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint() {
		
		x=0;
		y=0;
	}
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	
	
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.y+= this.ySpeed;
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.y-= this.ySpeed;
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.x-= this.xSpeed;
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.x+= this.xSpeed;
	}
	
	

}
