package mrchenproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] arg) {
		
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 50000000; i++) {
			list.add(i);
		}
		
		long t = System.currentTimeMillis();
		list.add(500, 1);
		System.out.println(System.currentTimeMillis()-t);
		
		
		long t2 = System.currentTimeMillis();
		list.add(1);
		System.out.println(System.currentTimeMillis()-t2);
		
	}
}
