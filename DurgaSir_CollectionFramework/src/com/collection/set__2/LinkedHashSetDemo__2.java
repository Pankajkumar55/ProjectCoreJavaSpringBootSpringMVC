package com.collection.set__2;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo__2 {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> h = new LinkedHashSet<Object>();  // if you want to insertion order is preserved or don't want to insert null value then you should go for LinkedHashSet
		h.add("pankaj");
		h.add(10);
		h.add('s');
		h.add('P');
		h.add(1);
		h.add(null); // null is allowed

		System.out.println("Duplicate data : " + h.add('s')); // I'm trying to insert duplicate but duplicate is not allowed so it is return false
		System.out.println(h); // insertion order is not preserved because set is insert data based on HashCode
		
	
	}
}
