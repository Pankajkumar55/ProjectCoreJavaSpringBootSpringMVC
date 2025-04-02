package com.collection_queue__7;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComporatorDemo implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}

}

public class PriorityQueueComporatorDemo__2 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(new MyComporatorDemo());
		pq.offer("z");
		pq.offer("a");
		pq.offer("d");
		pq.offer("f");
		pq.offer("i");
		pq.offer("l");
		System.out.println(pq);
		/*
		Some Operating System is not provide proper support for PriorityQueue 
		*/
	}
}
