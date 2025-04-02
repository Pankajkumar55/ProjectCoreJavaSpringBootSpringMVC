package com.map.map__6;

import java.util.WeakHashMap;

class Temp {
	public String toString() {
		return"pankaj";
	}
	public void finalize() {
		System.out.println("GC called");
	}
}

public class WeakHashMapDemo__5 {

	public static void main(String[] args) throws InterruptedException {
		Temp temp = new Temp();
		WeakHashMap wm = new WeakHashMap();
		wm.put(temp, 100);
		System.out.println(wm);
		temp = null;
		System.gc();

		System.out.println(temp);

	}
}
