package com.collection.set__2;

import java.util.Comparator;
import java.util.TreeSet;

class MyComprator implements Comparator {

	/*	
		
	//	 	In JVM wrote this Logic
		@Override
		public int compare(Object o1, Object o2) {
			Integer obj1 = (Integer) o1;
			Integer obj2 = (Integer) o2;
			return obj1.compareTo(obj2);
		}
	*/

	// This Logic to descending order
	@Override
	public int compare(Object o1, Object o2) {
		Integer obj1 = (Integer) o1;
		Integer obj2 = (Integer) o2;
		// return obj2.compareTo(obj1);
		return -obj1.compareTo(obj2);
		

	}

	/*	
		
		// Logic to insert data in Descending order ByDefualt JVM will insert data in ascending order
		// First Logic to descending order 
			@Override
			public int compare(Object o1, Object o2) {
				Integer obj1 = (Integer) o1;
				Integer obj2 = (Integer) o2;
				if (obj1 < obj2) 
					return +1;
				else if (obj1 > obj2)
					return -1;
				else
					return 0;
		
	*/

}

public class TreeSetComparatorDemoForInt__4 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComprator());
		t.add(1);
		t.add(10);
		t.add(50);
		t.add(60);
		System.out.println(t);

	}
}
