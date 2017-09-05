/*Describe abstract class called Shape which has three subclasses say
	Triangle,Rectangle,Circle. Define one method area() in the abstract class and
	override this area() in these three subclasses to calculate for specific object i.e.
	area() of Triangle subclass should calculate area of triangle etc. Same for
	Rectangle and Circle */

package Question_6;

public abstract class Shape {
	double area;
	public abstract double getArea();

}

class Triangle extends Shape {
	double base,height;
	
	Triangle(double b,double h){
		base=b;
		height=h;
		area=base*height/2;
	}
	public double getArea() {
		return area;
	}
}

class Rectangle extends Shape{
	double length,width;
	Rectangle(double l, double w){
		length=l;
		width=w;
		area=length*width;
	}
	public double getArea() {
		return area;
	}
}

class Circle extends Shape {
	final double PI = 3.14;
	double rad;
	
	Circle(double rad) {
		this.rad=rad;
		area=PI*rad;
	}
	
	public double getArea() {
		return area;
	}
}