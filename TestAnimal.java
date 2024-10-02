abstract class Animal {

	public abstract void sound();

	public abstract void move();
}

class Dog extends Animal {

	public void sound() {
		System.out.println("Dog barks: Woof Woof!");
	}

	public void move() {
		System.out.println("Dog runs on four legs.");
	}
}

class Cat extends Animal {

	public void sound() {
		System.out.println("Cat meows: Meow Meow!");
	}

	public void move() {
		System.out.println("Cat walks gracefully.");
	}
}

class Bird extends Animal {

	public void sound() {
		System.out.println("Bird chirps: Chirp Chirp!");
	}

	public void move() {
		System.out.println("Bird flies in the sky.");
	}
}

public class TestAnimal {

	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();

		System.out.println("Dog:");
		dog.sound();
		dog.move();

		System.out.println("\nCat:");
		cat.sound();
		cat.move();

		System.out.println("\nBird:");
		bird.sound();
		bird.move();
	}

}
