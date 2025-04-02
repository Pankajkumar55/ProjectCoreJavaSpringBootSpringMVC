package com.collection.set__2;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompratorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String obj1 = (String) o1;
		String obj2 = o2.toString();
//		return obj2.compareTo(obj1); // Descending order
		return obj1.compareTo(obj2); // Ascending order
	}
	 
	
}




public class TreeSetComparatorDemoForString__5 {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>(new MyCompratorDemo());
		ts.add("pankaj");
		ts.add("chandan");
		ts.add("kumar");
		ts.add("ramkumar");
		ts.add("prasad");
		System.out.println(ts);
		
	}
	
}
