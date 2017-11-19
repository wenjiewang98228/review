package chapter_5;

public class ParttimeEmp extends Employee{

	private int hours;
	
	public ParttimeEmp(int num, String name, String code,int hour) {
		super(num, name, code);
		// TODO Auto-generated constructor stub
		this.hours = hour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double calSalary() {
		return 50 * hours;
	}
	
	/*public String getDtetails() {
		return "\n���±�ţ�" + getEmpNum() + "\n������" + getName() + "\n���ű��룺 " + getDeptCode()
		+ "\n��ʱ�䣺" + getHours() + "\n���ʣ�" + calSalary();
	}*/
	
	public String getBaseDetails() {
		return super.getBaseDetails() + "\n��ʱ�䣺" + getHours() + "\n���ʣ�" + calSalary();
	}
	
}
