package com.thisKeyword_methodChaining_2__27_7_2024;

public class ClassB {
    ClassB() {
        this(); // Recursive constructor invocation ClassB()
    }

    public static void main(String[] args) {
        new ClassB().meth();
    }

    void meth() {
    	System.out.println("meth1 called");

    }
}
