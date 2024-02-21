package binding;

class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}

public class MainAnimal {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.makeSound();
	}
}
