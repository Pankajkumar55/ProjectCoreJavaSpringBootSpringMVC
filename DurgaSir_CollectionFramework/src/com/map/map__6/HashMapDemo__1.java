package com.map.map__6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo__1 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("pankaj", 100);
		m.put("ranjan", 500);
		m.put("sohan", 700);
		m.put("mohan", 900);
		System.out.println(m); // {key=value,key=value}
		System.out.println(m.put("pankaj", 110));
		Set s = m.keySet();
		System.out.println(s); // [key]
		Collection c = m.values();
		System.out.println(c); // [value]
		Set s1 = m.entrySet(); // Change map to set
		System.out.println(s1); // print set value
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
			if (m1.getKey().equals("pankaj")) {
				m1.setValue(100000); // change value which of key pankaj
			}
		}
		System.out.println(m);
	}
}
