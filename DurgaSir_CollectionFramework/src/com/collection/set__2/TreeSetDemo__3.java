package com.collection.set__2;

import java.util.TreeSet;

public class TreeSetDemo__3 {
	public static void main(String[] args) {
		TreeSet<Object> t = new TreeSet<Object>();
		/*	
		
		t.add(null)
		if you insert a null value a empty TreeSet Then it's allowed because if only one null value then don't need to compare 	

		*/
		t.add("A");
		t.add("a");
		t.add("Z");
		t.add("G");
		t.add("L");
//		 t.add(50);  // Exception java.lang.ClassCastException, Because TreeSet don't allow heterogeneous data

		t.add("f");

		/*	
		
		t.add(null);  Exception java.lang.NullPointerException because adding some elements in TreeSet you will inserted
		null value then rise a NullPointerException bacase any data compare to null will give NullPointerExeption
		System.out.println(t);
		
		*/

	}
}
