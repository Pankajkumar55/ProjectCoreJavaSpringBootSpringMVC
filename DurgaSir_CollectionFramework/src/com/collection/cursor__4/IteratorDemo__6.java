package com.collection.cursor__4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo__6 {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		for (int i = 1; i < 20; i++) {
			a.add(i);

		}
		System.out.println("Total size of arrayList " + a.size());

		/*
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {  // forEach Loop
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");
		}
		*/

		Iterator itr = a.iterator(); // create Iterator Object with the help of iterator() method
		while (itr.hasNext()) {
			Integer o = (Integer) itr.next();
			if (o % 2 == 0) {
				System.out.print(o + " ");

			} else {

				itr.remove(); // else block also execute in this case
			}
		}
		System.out.println("\nTotal size of arrayList " + a.size());
	}

}
