package com.collection.list__1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo__1  {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
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

		LinkedList<Object> l = new LinkedList<Object>();
		System.out.println(l instanceof RandomAccess); // false

		/*
		 RandomAccess is marker(empty) Interface  
		*/

//	   By default ArrayList is not-synchronized. How to get synchronized version of ArrayList ?  
//     public static  List synchronizedList(List list) This is method which is static method and it's available in Collections Class and we can pass any List object in this method 
		List <Object> list = Collections.synchronizedList(a);
//		Now list (ArrayList) is synchronized. 

	}
}
