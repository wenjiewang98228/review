package chapter_5_6;

public abstract class Door {

	private int length;
	private int width;
	
	public Door(int length,int width) {
		setLength(length);
		setWidth(width);
	}

	public abstract void open();
	public abstract void close();

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
	
	
}
