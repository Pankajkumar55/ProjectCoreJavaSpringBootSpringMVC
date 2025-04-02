package com.collection.set__2;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompratorDemoo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String obj1 = o1.toString();
		String obj2 = o2.toString();
//			return obj1.compareTo(obj2);  // ascending order
		return obj2.compareTo(obj1); // descending order
	}

}

public class TreeSetComparatorDemoForStringBuffer__6 {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(new StringBuffer("pankaj"));
		ts.add(new StringBuffer("kumar"));
		ts.add(new StringBuffer("chandan"));
		ts.add(new StringBuffer("mahaur"));

		System.out.println(ts);
	}

}
