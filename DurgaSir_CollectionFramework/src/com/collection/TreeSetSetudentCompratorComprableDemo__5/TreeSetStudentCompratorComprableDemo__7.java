package com.collection.TreeSetSetudentCompratorComprableDemo__5;

import java.util.TreeSet;

public class TreeSetStudentCompratorComprableDemo__7 {
	public static void main(String[] args) {
		ComprableStudent s1 = new ComprableStudent(1, "pankaj");
		ComprableStudent s2 = new ComprableStudent(3, "kumar");
		ComprableStudent s3 = new ComprableStudent(2, "ranjan");
		ComprableStudent s4 = new ComprableStudent(5, "rohit");
		ComprableStudent s5 = new ComprableStudent(8, "aditya");

		TreeSet<ComprableStudent> t = new TreeSet<ComprableStudent>();
		t.add(s1);
		t.add(s5);
		t.add(s3);
		t.add(s4);
		t.add(s2);
		System.out.println(t);
		System.out.println(
				"============================================================================================");

		TreeSet<ComparatorStudent> t1 = new TreeSet<ComparatorStudent>(new ComparatorStudent());
		ComparatorStudent cs1 = new ComparatorStudent(1, "ranjan");
		ComparatorStudent cs2 = new ComparatorStudent(2, "sanjit");
		ComparatorStudent cs3 = new ComparatorStudent(3, "ram");
		ComparatorStudent cs4 = new ComparatorStudent(4, "sohan");
		ComparatorStudent cs5 = new ComparatorStudent(5, "mohan");
		ComparatorStudent cs6 = new ComparatorStudent(6, "ranjan"); // Don't insert because This is duplicate value

		t1.add(cs1);
		t1.add(cs2);
		t1.add(cs3);
		t1.add(cs4);
		t1.add(cs5);
		t1.add(cs6);
		System.out.println(t1);
	}
}
