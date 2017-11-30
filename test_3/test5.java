package test_2;

import java.util.EnumMap;

public class test5 {

	public enum Gender{
		FEMALE,MALE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Gender g : Gender.values())
			System.out.println(g.ordinal() + "  " + g.name());
		
		EnumMap<Gender,String> GenderMap = new EnumMap<Gender,String>(Gender.class);
		GenderMap.put(Gender.FEMALE, "Å®");
		GenderMap.put(Gender.MALE, "ÄĞ");
		
		for(Gender g : GenderMap.keySet()) {
			System.out.println(g + " " + GenderMap.get(g));
		}
		
	}

}
