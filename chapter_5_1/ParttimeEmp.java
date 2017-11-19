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
		return "\n人事编号：" + getEmpNum() + "\n姓名：" + getName() + "\n部门编码： " + getDeptCode()
		+ "\n工时间：" + getHours() + "\n工资：" + calSalary();
	}*/
	
	public String getBaseDetails() {
		return super.getBaseDetails() + "\n工时间：" + getHours() + "\n工资：" + calSalary();
	}
	
}
