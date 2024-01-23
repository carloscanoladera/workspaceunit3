package interfaces.multipleinterfaces;

public class Dog implements Sound,Feed{

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("It loves meat");
		
		if (this.animal || Feed.animal) 
			System.out.println("I'm an animal");
		
	}

	@Override
	public void produceSound() {
		// TODO Auto-generated method stub
		System.out.println("Wof Wof");
	}



}
