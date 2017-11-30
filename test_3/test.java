package test_2;

import java.io.Console;

public class test {
	public static void main(String args[]) {
	Console con = System.console();
	
	if(con == null) {
		System.err.println("no console");
		System.exit(1);
	}
	
	
	String login = con.readLine("enter");
	
	char[] passwd = con.readPassword("123456");
	
	con.printf(login);
	
	con.printf(passwd.toString());
	}
	
	

}