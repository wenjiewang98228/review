package chapter_5_2;

public abstract class BankAccount {

	protected long accNum;
	protected double balance;
	
	public BankAccount(long accNum,double balance) {
		setAccNum(accNum);
		setBalance(balance);
	}


	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double money) {
		this.balance += money;
		System.out.println("Óà¶îÎª£º" + this.balance);
	}
	
	public abstract String withdraw(double money);
}
