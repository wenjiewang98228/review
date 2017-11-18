package chapter_4;

public class Circle {
	
	private static int count;

	private int radius;
	
	public Circle(int theRadius) {
		setRadius(theRadius);
		count++;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calculateCircumference() throws Exception{
		if(getRadius() <=0) {
			Exception e = new Exception("半径不正确");
			throw e;
		}
		else return 2*3.14*radius;
	}
	
	public double calsulateArea() throws Exception{
		if(getRadius()<=0) {
			Exception e = new Exception("半径不正确");
			throw e;
		}
		else return 3.14*radius*radius;
	}
	
	public String getDetails() throws Exception {
		String info;
		return info = this.radius + "  " + this.calculateCircumference() + "  " + this.calsulateArea();
	}
	
	public static int getCount() {
		return count;
	}
}
