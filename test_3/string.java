package test_2;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = "hello";
		String s4 = "world";
		String s5 = new String("world");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s4.compareTo(s5));
		System.out.println(s3.compareTo(s4));
		
		System.out.println(s3.indexOf('e', 0));
		System.out.println(s2.contains("ll"));
		System.out.println(s5.substring(2,4));
		
		System.out.println(s4.concat(s1));
		System.out.println("1561".trim());
		System.out.println(s3.toUpperCase());
		
		int n = 123;
		System.out.println(String.valueOf(n));
		
		String s = "123";
		System.out.println(Integer.parseInt(s));
	}

}
