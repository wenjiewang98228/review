package test_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1", "Mon");
		map.put("2", "Tues");
		map.put("3", "Wedn");
		
		for(String key:map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
	

}
