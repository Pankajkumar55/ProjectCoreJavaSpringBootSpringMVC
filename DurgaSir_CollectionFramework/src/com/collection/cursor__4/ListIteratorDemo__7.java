package com.collection.cursor__4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo__7 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.addLast("pankaj");
		a.addLast("chadan");
		a.addLast("rohit");
		a.addLast("prabhu");

		System.out.println("Total size of arrayList " + a.size());

		ListIterator listIterator = a.listIterator();
	//	System.out.println(listIterator.getClass().getName());  // This is Print class name those class which is return by ListIterator Class Object
		while (listIterator.hasNext()) {
			String it = (String) listIterator.next();
			if (it.equalsIgnoreCase("pankaj")) {
				listIterator.remove(); // it is remove this
			} else if (it.equalsIgnoreCase("prabhu")) {
				listIterator.set("Prabhu Jee"); // set method will do work of concatnation
			} else if (it.equalsIgnoreCase("rohit")) {
				listIterator.add("ranjan"); // it is add after next index of rohit
			}

		}
		System.out.println(a);
		System.out.println("Total size of arrayList " + a.size());
	}
}
