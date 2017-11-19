package chapter_7_6;

public class Circle {

	private int radius;
	
	public Circle(int radius) {
		setRadius(radius);
	}

	public double calArea() {
		return 3.14*radius*radius;
	}
	
	public double calGirth() {
		return 2*3.14*radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
