package test_1;

import java.util.Set;
import java.util.TreeSet;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(9);
		set.add(6);
		set.add(4);
		
		for(int i : set)
			System.out.println(i);
	}

}
