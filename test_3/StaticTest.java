package test_2;

public class StaticTest {

		static {
			System.out.println("hi");
		}
		
		public void print() {
			System.out.println("hello");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest st1 = new StaticTest();
		st1.print();
		StaticTest st2 = new StaticTest();
		st2.print();
	}

}
