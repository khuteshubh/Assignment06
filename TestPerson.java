package assignment6Q1;

class Person{
	final String name;
	final int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	
	
	
	
	
	
	
}

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Rahul", 24);
		System.out.println(person1);
		
		
		

	}

}
