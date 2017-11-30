package test_4;

import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Customer> set = new TreeSet<Customer>();
		
		Customer c1 = new Customer("Sin",25);
		Customer c2 = new Customer("Cos",26);
		
		set.add(c1);
		set.add(c2);
		
		for(Customer c : set)
			System.out.println(c.getName());
			
	}

}
