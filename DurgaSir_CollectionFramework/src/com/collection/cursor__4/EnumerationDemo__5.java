package com.collection.cursor__4;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo__5 {
// it is used only for Legacy class
	public static void main(String[] args) {

		Vector<Object> v = new Vector<Object>();

		for (int i = 0; i < 20; i++) {
			v.addElement(i);
		}
		System.out.println(v.size()); // 20
		Enumeration<Object> e = v.elements();
		/*
		we can create Enumeration object using by elements() method. 
		*/

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			Integer i = (Integer) o;
			System.out.print(i+" ");
		}

	}
}
