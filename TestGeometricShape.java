abstract class GeometricShape {

	abstract void area();

	abstract void perimeter();

}

class Circle extends GeometricShape {

	int r;
	static double PI = 3.14;

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	void area() {
		double area = 2 * PI * r * r;
		System.out.println(area);
	}

	@Override
	void perimeter() {
		double peri = 2 * PI * r;
		System.out.println(peri);
	}

}

class Rectangle extends GeometricShape {

	int l, b;

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	void area() {
		double area = 0.5 * l * b;
		System.out.println(area);
	}

	@Override
	void perimeter() {
		double peri = 2 * (l + b);
		System.out.println(peri);
	}

}

class Triangle extends GeometricShape {
	int s1, s2, s3;

	public Triangle(int s1, int s2, int s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	void area() {
		double area = (s1 + s2 + s3) / 2;
		System.out.println(area);
	}

	@Override
	void perimeter() {
		double peri = s1 + s2 + s3;
		System.out.println(peri);

	}

}



	public static void main(String[] args) {
		Circle circle = new Circle(2);
		circle.area();
		circle.perimeter();
		System.out.println("--------------------------------------");
		Rectangle rectangle = new Rectangle(2, 3);
		rectangle.area();
		rectangle.perimeter();
		System.out.println("--------------------------------------");
		Triangle triangle = new Triangle(5, 5, 5);
		triangle.area();
		triangle.perimeter();
		
		
	}

}
