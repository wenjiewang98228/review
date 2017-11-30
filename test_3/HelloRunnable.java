package test_2;

public class HelloRunnable implements Runnable{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new HelloRunnable())).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello from a thread");
	}

}
