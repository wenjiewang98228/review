package test_2;

public class HelloThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new HelloThread()).start();
	}
	
	public void run() {
		System.out.println("hello from a thread");
	}

}
