package com.collection.set__2;

import java.util.HashSet;

public class HashSetDemo__1 {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
		h.add("pankaj");
		h.add(10);
		h.add('s');
		h.add('P');
		h.add(null); // null is allowed

		System.out.println("Duplicate data : " + h.add('s')); // I'm trying to insert duplicate but duplicate is not
																// allowed so it is return false
		System.out.println(h); // insertion order is not preserved because set is insert data based on HashCode

	}
}
