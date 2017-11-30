package test_2;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private String name;
	private int age;
	
	public Customer(String name,int age) {
		setName(name);
		setAge(age);
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Customer)) return false;
		Customer other = (Customer)o;
		if(this.name.equals(other.getName()) && this.age == other.getAge())
			return true;
		else return false;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Customer> set = new HashSet<Customer>();
		Customer c1 = new Customer("liu",16);
		Customer c2 = new Customer("chen",18);
		Customer c3 = new Customer("liu",16);
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set.size());
		System.out.println(c1.equals(c3));
	}

}
