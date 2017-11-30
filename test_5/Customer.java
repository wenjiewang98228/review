package test_4;

public class Customer implements Comparable{

	private String name;
	private int age;
	
	public Customer(String name, int age) {
		setName(name);
		setAge(age);
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


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Customer other = (Customer) o;
		if(this.name.compareTo(other.getName())>0) return 1;
		if(this.name.compareTo(other.getName())<0) return -1;
		
		return 0;
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
	
}
