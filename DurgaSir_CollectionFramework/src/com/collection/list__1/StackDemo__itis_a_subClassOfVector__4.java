package com.collection.list__1;

import java.util.Stack;

public class StackDemo__itis_a_subClassOfVector__4 {
	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>(); 
		
		/*
		If you'r want to push means add data in LIFO (last in first out) order otherwise goto vector(FIFO). 
		*/										
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println(s.search(1));

	}
}
