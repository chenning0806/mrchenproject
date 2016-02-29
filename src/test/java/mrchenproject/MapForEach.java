package mrchenproject;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		map.put("d", "d");
		for (String entry : map.keySet()) {
			System.out.println(entry+"--"+map.get(entry));
		}
		
	}

}
