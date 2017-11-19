package chapter_6_3;

import java.util.ArrayList;

public class School {

	private int name;
	private String address;
	private String phone;
	private ArrayList<Department> departmentList;
	
	public School(int name,String address,String phone) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		departmentList = new ArrayList<Department>(3);
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}
	
	public void addDept(Department dept) {
		departmentList.add(dept);
	}
}
