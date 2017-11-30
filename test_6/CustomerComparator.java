package test_5;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())>0) return 1;
		if(o1.getName().compareTo(o2.getName())<0) return -1;
		return 0;
	}

	
}
