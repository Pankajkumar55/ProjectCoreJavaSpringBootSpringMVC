package com.collection.TreeSetSetudentCompratorComprableDemo__5;

import java.util.Comparator;

public class ComparatorStudent implements Comparator {
	int sId;
	String sName;

	public ComparatorStudent(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "ComparatorStudent [sId=" + sId + ", sName=" + sName + "]";
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		ComparatorStudent cs1 = (ComparatorStudent) obj1;
		;
		ComparatorStudent cs2 = (ComparatorStudent) obj2;
		String name = cs1.sName;
		String name2 = cs2.sName;

		return name.compareTo(name2);
	}

	public ComparatorStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
