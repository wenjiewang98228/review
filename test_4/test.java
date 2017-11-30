package test_3;

import java.util.HashSet;
import java.util.Set;

public class test {

	public static void main(String args[]) {
		Set<Customer> set = new HashSet<Customer>();
		
		Customer c1 = new Customer("11",25);
		Customer c2 = new Customer("11",25);
		set.add(c1);
		set.add(c2);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(set.size());

	}
	
}
