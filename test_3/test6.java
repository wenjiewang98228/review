package test_2;

public class test6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s  = new String("hello world");
		System.out.println(s.indexOf(101));
		
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		
		String str3 = "ABC";
		String str4 = "ABC";
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.compareTo(str4));
		
		String a = "ABC";
		String b = "AB";
		String c = b + "C";
		System.out.println(a == c); 
		System.out.println(a.compareTo(c));
	}

}
