package chapter_5_4;

public class Rectangle implements Shape {

	private int length;
	private int width;
	
	public Rectangle(int length,int width) {
		setLength(length);
		setWidth(width);
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public int calGirth() {
		// TODO Auto-generated method stub
		return 2*(length + width);
	}

}
