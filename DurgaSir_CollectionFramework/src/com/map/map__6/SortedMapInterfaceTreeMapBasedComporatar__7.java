package com.map.map__6;

import java.util.Comparator;
import java.util.TreeMap;

class MyCompratorDemoInMap implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1);
//		reverse sorting of String
	}

}

public class SortedMapInterfaceTreeMapBasedComporatar__7 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap(new MyCompratorDemoInMap());
		tm.put("aaa", 1500);
		tm.put("zzz", 13);
		tm.put("lll", 50);
		tm.put("eee", 10);
		System.out.println(tm);
		
	}
}
