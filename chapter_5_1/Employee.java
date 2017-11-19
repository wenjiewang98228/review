package chapter_5;

public class Employee {

	private int empNum;
	private String name;
	private String deptCode;
	
	public Employee(int num,String name,String code) {
		setEmpNum(num);
		setName(name);
		setDeptCode(code);
	}
	
	public String getBaseDetails()
	{
		String info = "";
		info += "\n���±�ţ�" + empNum + "\n������" + name + "\n���ű��룺 " + deptCode;
		return info;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	
}
