abstract class GeometricShape{
    String type;
    abstract public void area();
    abstract public void perimeter();

    GeometricShape(String type){
        this.type = type;
    }

}

class Circle extends GeometricShape{
    int r;

    Circle(String type,int r){
        super(type);
        this.r = r;
    }
    @Override
    public  void area(){
        System.out.println("area of " + type + " is " + (3.14*r*r));
    }
    @Override
    public void perimeter(){
        System.out.println("perimeter of" + type + " is " + (2*3.14*r));

    }
}

class Rectangle extends GeometricShape{
    int l,b;
    Rectangle(String type,int l,int b){
        super(type);
        this.l = l;
        this.b = b;

    }

    @Override
    public void area(){
        System.out.println("Area of " + type + " is " + (l*b));
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of " + type + " is " + (2*l*b));
    }
}

class Triangle extends GeometricShape{
    int base,height;
    int s;

    Triangle(String type,int base,int height,int s){
        super(type);
        this.base = base;
        this.height = height;
        this.s = s;
    }

    @Override
    public void area(){
        System.out.println("area of " + type + " is " + (0.5*base*height));
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of " + type + " is " + (s*base*height));
    }
}

public class TestShape {
    public static void main(String args[]){
        Circle circle = new Circle("circle",4);
        circle.area();
        circle.perimeter();

        System.out.println("==============================");

        Rectangle rectangle = new Rectangle("Rectangle",4,6);
        rectangle.area();
        rectangle.perimeter();

        System.out.println("==============================");

        Triangle triangle = new Triangle("Triangle",20,40,20);
        triangle.area();
        triangle.perimeter();



    }
}
