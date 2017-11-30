package test_2;

import java.util.HashSet;
import java.util.Set;

public class test2 {

	public static void main(String args[]) {
		Set<String> s = new HashSet<String>();
		String s1 = new String("hello");
		String s2 = s1;
		String s3 = new String("world");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		System.out.println(s.size());
	}
}
