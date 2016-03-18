package mrchenproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class HashTesr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Object> set = new HashSet<Object>();
		System.out.println(set.add(123));
		System.out.println(set.size());
		List<Object> list = new ArrayList<Object>();
		list.add(null);
		System.out.println(list.size());
		java.util.Map<String, String> map = new HashMap<String, String>();
		map.put(null, null);
		
	}

}
