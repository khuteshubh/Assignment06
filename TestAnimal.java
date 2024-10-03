abstract class Animal{
    protected String type;
    abstract public void sound();
    abstract public void move();

    Animal(String type){
        this.type = type;

    }
}

class Dog extends Animal{

    Dog(String type) {
        super(type);
    }

    @Override
    public void sound() {
        System.out.println(type +" is barks" );

    }

    @Override
    public void move() {
        System.out.println(type + " runs");
    }
}

class Cat extends Animal{

    Cat(String type){
        super(type);
    }

    @Override
    public void sound() {
        System.out.println(type + " is meows");
    }

    @Override
    public void move() {
        System.out.println(type + " leaps");
    }
}

class Birds extends Animal{

    Birds(String type){
        super(type);
    }

    @Override
    public void sound() {
        System.out.println(type + " is chirps ");
    }

    @Override
    public void move() {
        System.out.println(type + " is flies");
    }
}


public class TestAnimal {
    public static void main(String args[]){
        Dog dog = new Dog("dog");
        dog.sound();
        dog.move();

        System.out.println("=================================");

        Cat cat = new Cat("cat");
        cat.sound();
        cat.move();

        System.out.println("=================================");

        Birds birds = new Birds("birds");
        birds.sound();
        birds.move();



    }
}
