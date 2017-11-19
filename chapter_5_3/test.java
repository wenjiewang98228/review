package chapter_5_2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount SA = new SavingAccount(01521654,50000,0.10);
		
		CheckingAccount CA = new CheckingAccount(0215456,10000,11);
		
		System.out.println("SAÏÖÓÐ´æ¿î£º" + SA.getBalance());
		
		SA.deposit(10000);
		System.out.println(SA.withdraw(80000));
		System.out.println(SA.withdraw(20000));
		
		CA.deposit(20000);
		System.out.println(CA.withdraw(80000));
		System.out.println(CA.withdraw(10000));
	}

}
