package ejercicios.ingles.exercice38_43;

public class AppMovable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovablePoint point = new MovablePoint(3, 4, 2, 3);
		MovableCircle circle = new MovableCircle(3, new MovablePoint(2,2,3,4));
		System.out.println(point);
		System.out.println(circle);
		point.moveLeft();
		point.moveDown();
		circle.moveUp();
		System.out.println("AfterMoving:\n"+point);
		System.out.println("AfterMoving:\n"+circle);
	}

}
