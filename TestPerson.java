
class Person{
    final String name;
    final int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestPerson {
    public static void main(String args[]){
        Person person = new Person("rohi",23);
        System.out.println(person);

    }
}
