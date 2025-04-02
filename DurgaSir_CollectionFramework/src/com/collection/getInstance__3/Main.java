package com.collection.getInstance__3;

class SingleTonClassDemo {
	/*
	
	how to create useDefined Singleton class ?
	: A singleton class is Java class which is allow to create only one Object if program is trying to create a second or many Object 
	  then class don't allow to create a object and return first object always 
	
	*/

	static SingleTonClassDemo singleTonClassDemo; // Variable

	// static factory method
	public static SingleTonClassDemo getInstance() {

		if (singleTonClassDemo == null)
//		if (singleTonClassDemo == singleTonClassDemo)  if you want crate a new object always if a object is existing
			return singleTonClassDemo = new SingleTonClassDemo();
		else
			return singleTonClassDemo;
	}

	private SingleTonClassDemo() {
		// it is a private constructor
	}

}

public class Main {
	public static void main(String[] args) {
		SingleTonClassDemo sDemo = SingleTonClassDemo.getInstance(); // getObject
		SingleTonClassDemo sDemo2 = SingleTonClassDemo.getInstance(); // getObject
		System.out.println(sDemo == sDemo2); // it's compare two Object
		System.out.println(sDemo.hashCode() + " " + sDemo2.hashCode());
	}
}