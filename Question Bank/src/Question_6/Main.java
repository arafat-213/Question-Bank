package Question_6;

public class Main {
	public static void main(String[] args) {
		
		Triangle T1 = new Triangle(12,10);
		System.out.println("Area of Triangle : "+T1.getArea());
		
		Rectangle R1 = new Rectangle(10,5);
		System.out.println("Area of Rectangle : "+R1.getArea());
		
		Circle C1 = new Circle(5.6);
		System.out.println("Area of Circle : "+C1.getArea());
	}
}
