package test_1;

public class Point {
	static {
		System.out.println("hello");
	}
	
	public void print() {
		System.out.println("hi");
	}

	public static void main(String args[]) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point();
		p2.print();
	}

}
