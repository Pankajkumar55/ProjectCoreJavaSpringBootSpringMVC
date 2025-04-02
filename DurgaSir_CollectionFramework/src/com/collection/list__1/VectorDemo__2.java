
package com.collection.list__1;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorDemo__2 {
	public static void main(String[] args) {
		Vector<Object> a = new Vector<Object>();
		a.add("a");
		a.add(10);
		a.add('m');
		a.add(null);

		System.out.println(a); // [a, 10, m, null]
		a.remove(2);
		System.out.println(a); // [a, 10, null]
		a.add(2, 'n');
		System.out.println(a); // [a, 10, n, null]
		a.add(1, 'm');
		System.out.println(a); // [a, m, 10, n, null]
		System.out.println(a.size()); // 5

		System.out.println(a instanceof Serializable); // true
		System.out.println(a instanceof Cloneable); // true
		System.out.println(a instanceof RandomAccess); // true

		/*
		 RandomAccess is marker(empty) Interface  
		*/

//	   By default Vector is synchronized.

	}
}