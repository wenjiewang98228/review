package test_5;

import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Customer> set = new TreeSet<Customer>(new CustomerComparator());
		
		set.add(new Customer("sin",12));
		set.add(new Customer("cos",13));
		
		for(Customer c : set)
			System.out.println(c.getName());
	}

}
