package chapter_5;

public class FulltimeEmp extends Employee {
	
	private double baseSalary;
	private int workedAge;

	public FulltimeEmp(int num, String name, String code,double baseSalary,int workedAge) {
		super(num, name, code);
		// TODO Auto-generated constructor stub
		setBaseSalary(baseSalary);
		setWorkedAge(workedAge);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getWorkedAge() {
		return workedAge;
	}

	public void setWorkedAge(int workedAge) {
		this.workedAge = workedAge;
	}

	public double calSalary() {
		return baseSalary + 500 * (workedAge - 1);
	}
	
	public String getDetails() {
		String info = "";
		return info += "\n人事编号：" + getEmpNum() + "\n姓名：" + getName() + "\n部门编码： " + getDeptCode()
				+ "\n基本工资：" + getBaseSalary() + "\n工龄：" + getWorkedAge() + "\n工资：" + calSalary();
	}
}
