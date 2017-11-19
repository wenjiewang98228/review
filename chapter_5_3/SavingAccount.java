package chapter_5_2;

public class SavingAccount extends BankAccount {

	private double rate = 0;
	
	public SavingAccount(long accNum,double balance,double rate) {
		super(accNum,balance);
		setRate(rate);
	}
	
	
	public String withdraw(double money) {
		// TODO Auto-generated method stub
		double interest;
		String info;
		
		interest = balance * rate;
		
		if(balance + interest > money ) {
			balance -= money;
			info = "取款成功！\n余额（含利息）为：" + (balance + interest) + "\n";
		}
		else {
			info = "余额不足!\n余额（含利息）为：" + (balance + interest) + "\n";
		}
		
		return info;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
