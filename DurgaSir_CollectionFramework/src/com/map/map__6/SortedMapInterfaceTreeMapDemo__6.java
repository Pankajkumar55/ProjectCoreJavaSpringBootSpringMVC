package com.map.map__6;

import java.util.TreeMap;

public class SortedMapInterfaceTreeMapDemo__6 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(104, "pankaj");
		tm.put(101, "ranjan");
		tm.put(103, "pankaj");
		tm.put(105, "pankaj");
		tm.put(106, "pankaj");
//		tm.put(null, "pankaj"); // NullPointerException
//		tm.put("kumar", "pankaj"); //  java.lang.ClassCastException: 

		System.out.println(tm);

	}
}
