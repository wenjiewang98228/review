package chapter_5_2;

public class CheckingAccount extends BankAccount {

	private int num = 0;
	
	public CheckingAccount(long accNum,double balance,int num) {
		super(accNum,balance);
		setNum(num);
	}
	@Override
	public String withdraw(double money) {
		// TODO Auto-generated method stub
		String info;
		num = num + 1;
		
		if(num > 10) {
			money += 1;
		}
		else {
			
		}
		
		if(balance < money) {
			info = "账号透支！";
		}
		else {
			info = "支出成功！";
		}
		
		return info;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
