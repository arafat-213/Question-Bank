package Question_15;

public class Fan {
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	double radius = 4;
	boolean f_on;
	int speed;
	String color;

	public Fan() {
		f_on = false; 
		speed = SLOW;
		color = "blue";
	}
	
	public Fan(String color, int speed, int radius, boolean state) {
		this.color = color;
		this.speed = speed;
		this.radius = radius;
		f_on = state;
	}

	public void display() {
		System.out.println("Color : " + color);
		System.out.println("Radius : " + radius);
		if (!f_on)
			System.out.println("Fan is off");
		else
			System.out.println("Speed : " + speed);
	}
}
