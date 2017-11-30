package test_3;

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
		if(this.name.equals(other.getName())&&this.age == other.getAge())
			return true;
		else return false;
	}
	
	public int hashCode() {
		return this.getAge();
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
	
	
}
