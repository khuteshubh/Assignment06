
class A{
    public static void print(){
        System.out.println("Parent");
    }
}

class B extends A{
    public static void print(){
        System.out.println("Child");
    }
}

public class TestParent {
    public static void main(String args[]){

        A objA = new A();
        objA.print();

        B objB = new B();
        objB.print();
        A obj = new B();
        obj.print();

        A.print();
        B.print();



    }


}
