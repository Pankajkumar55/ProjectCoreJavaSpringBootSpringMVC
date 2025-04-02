package com.map.map__6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo__3 {
//	in map difference between HashMap and LinkedHasMap in HashMap insertion order is not preserved and LinkedHashMap insertion order is preserved
	public static void main(String[] args) {
		LinkedHashMap lm = new LinkedHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
//		JVM will use equals method for content comparison 
		lm.put(i1, "pankaj");
		lm.put(i2, "kumar");
		lm.put("pankaj", 100);
		lm.put("mohan", 250);
		lm.put("rohit", 360);
		lm.put("chandan", 480);
		System.out.println(lm);

//		How to synchronized version of LinkedHashMap
		Map m = Collections.synchronizedMap(lm);

	}
}
