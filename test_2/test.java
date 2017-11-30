package test_1;

public class test {

	public double px,py;
	
	public test(double x,double y) {
		px = x;
		py = y;
	}
	
	public static double distance(test t1,test t2) {
		double xdiff,ydiff;
		xdiff = t1.px-t2.px;
		ydiff = t1.py-t2.py;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	
	public static double random(double low,double high) {
		double r = Math.random();
		return (low+r*(high-low));
	}
	
	public void show() {
		System.out.println("x="+this.px);
		System.out.println("y="+this.py);
	}
	
	public static void main(String args[]) {
		test t1 = new test(random(0.0,2.0), random(-1.0,0.0));
		t1.show();
		test t2 = new test(random(-1.0,1.0),random(-2.0,1.0));
		t2.show();
		test t3 = new test(random(0.0,1.0),random(-9.0,-8.0));
		t3.show();
		System.out.println(test.distance(t1, t2));
		System.out.println(t1.distance(t2,t3));
	}
}
