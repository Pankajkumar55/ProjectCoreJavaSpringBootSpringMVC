package com.collection.list__1;

import java.util.LinkedList;

public class LinkedListDemo__3 {

	public static void main(String[] args) {
		LinkedList<Object> li = new LinkedList<Object>();
		li.add("a");
		li.add(10);
		li.add('m');
		li.add(null);
		System.out.println(li); // [a, 10, m, null]
		li.set(0, "Pankaj");
		li.remove(1);
		System.out.println(li); // [Pankaj, m, null]
		li.addFirst("pankajkumar");
		System.out.println(li); // [pankajkumar, Pankaj, m, null]

	}
}
