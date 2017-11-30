package test_2;

public class StaticCircle {
	static {
		System.out.println("Circle");
	}
	
	private static int count = 0;
	private int r;
	
	
	
	public StaticCircle(int r) {
		this.r = r;
		count++;
		
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticCircle sc1 = new StaticCircle(4);
		
		
		System.out.println(StaticCircle.getCount());
		System.out.println(sc1.getCount());
		StaticCircle sc2 = new StaticCircle(10);
		System.out.println(sc2.getCount());
	}

}
