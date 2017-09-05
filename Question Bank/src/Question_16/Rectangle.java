package Question_16;

public class Rectangle {
	double x,y,height,width;
	public Rectangle() {
		x=y=0;
		height=width=1;
	}
	
	public Rectangle(double x,double y,double h, double w) {
		this.x=x;
		this.y=y;
		height=h;
		width=w;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPeri() {
		return 2*(height+width);
	}
	
	public boolean check(double x1, double y1)
	{
		if((x1>= x-(width/2) && x1<= x+(width/2)) && (y1>=y-(height/2) && y1<=y+(height/2)))
			return true;
		else
			return false;
	}
}
