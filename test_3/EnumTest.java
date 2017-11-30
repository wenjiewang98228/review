package test_2;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class EnumTest {
	

	public enum Color{RED,GREEN,BLUE;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumSet<Color> colorSet = EnumSet.allOf(Color.class);
		
		System.out.println(colorSet.size());
		
		EnumMap<Color,String> colorMap = new EnumMap<Color,String>(Color.class);
		colorMap.put(Color.RED,"red");
		colorMap.put(Color.GREEN, "green");
		colorMap.put(Color.BLUE, "blue");
		
		for(Map.Entry<Color, String> entry : colorMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
	}

}
