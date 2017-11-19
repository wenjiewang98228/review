package chapter_5_3;

public class test {

	public void myDraw(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t = new test();
		t.myDraw(new Circle());
		t.myDraw(new Triangle());
		t.myDraw(new Square());
		
		Circle c = new Circle();
		c.draw();
		
		Poly demo = new Poly();
		Shape[] shapes = new Shape[4];
		
		for(int i = 0; i < 4; i++) {
			shapes[i] = demo.createShape();
			shapes[i].draw();
		}
		
	}

}
