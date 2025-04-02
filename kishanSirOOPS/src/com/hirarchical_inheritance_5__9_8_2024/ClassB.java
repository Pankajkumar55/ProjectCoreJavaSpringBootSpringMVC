package com.hirarchical_inheritance_5__9_8_2024;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.classbMethod();
    }

    // Child Class
    void classbMethod() {
        System.out.println("classB() called");
    }
}
