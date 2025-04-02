package com.collection_queue__7;

import java.util.PriorityQueue;

public class PriorityQueueDemo__1 {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		System.out.println(q.peek());
//		System.out.println(q.element()); //  R.E : NoSuchElementException
		for (int i = 0; i < 10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll()); // This is remove first head element
		System.out.println(q); 
		/*
		 
		 Our expected output is [1, 3, 2, 7, 4, 5, 6, 8, 9]
		 But we got this output [1, 3, 2, 7, 4, 5, 6, 8, 9] because some OS Operating System is not provide proper support for PriorityQueue   
		 */
	}
}
