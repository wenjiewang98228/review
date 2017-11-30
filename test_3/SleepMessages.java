package test_2;

public class SleepMessages {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		String info[] = {"Mares eat oats","Does eat oats","Little lambs eat ivy","A kid will eat ivytoo"};
		
		for(int i = 0; i < info.length; i++) {
			Thread.sleep(400);
			System.out.println(info[i]);
		}
	}

}
