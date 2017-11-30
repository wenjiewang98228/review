package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class test4 {

	static final Integer[] data1 = {11,22,33,44};
	static final Integer[] data2 = {77,44,66,88};
	
	static Set<Integer> getOriginalSet(Integer[] data){
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(data));
		return set;
	}
	
	static void print(Collection<Integer> col) {

		for(Integer i : col){
			System.out.print(i + "  ");
		}
		System.out.println("");
	}
	
	public static void main(String args[]) {
		Set<Integer> set1 = getOriginalSet(data1);
		Set<Integer> set2 = getOriginalSet(data2);
		print(set1);
		print(set2);
		
		set1.retainAll(set2);
		print(set1);
		
		set1 = getOriginalSet(data1);
		set2 = getOriginalSet(data2);
		set1.removeAll(set2);
		print(set1);
	}
}
