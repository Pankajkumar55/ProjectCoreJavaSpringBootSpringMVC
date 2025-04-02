package com.map.map__6;

import java.util.IdentityHashMap;

public class IndentityHashMapDemo__4 {
	public static void main(String[] args) {
		IdentityHashMap im=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
//		JVM will use == Operator for Reference comparison 
		im.put(i1,"pankaj");
		im.put(i2,"kumar");
		System.out.println(im);
	}
}
