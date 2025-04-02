package com.map.map__6;

import java.util.Hashtable;
import java.util.Properties;

class Tempp {
	int i;

	public Tempp(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return i + "";
	}

	@Override
	public int hashCode() {
		return i;
	}

}

public class HashTableDemo__8 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Tempp(5), "pankaj");
		ht.put(new Tempp(8), "kumar");
		ht.put(new Tempp(23), "pan");
		ht.put(new Tempp(3), "ranjan");
		ht.put(new Tempp(4), "chandan");
//		ht.put(new Tempp(7), null);  // NullPointerException

		System.out.println(ht);
		
	}
}
