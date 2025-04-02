package com.task_1_8_7_2024;

class ClassAA implements Cloneable {

	public ClassAA Clone() throws CloneNotSupportedException {

		ClassAA A1 = (ClassAA) super.clone();
		return A1;
	}

}

public class ClassD {
	public static void main(String[] args) throws CloneNotSupportedException {
		ClassAA classA = new ClassAA();

	}

}
