package com.abstraction_abstractClass_11__14_8_2024;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.meth1();
        a.meth2();

    }

    void meth1() {
        System.out.println("Class A abstract method overridden");
    }
}
