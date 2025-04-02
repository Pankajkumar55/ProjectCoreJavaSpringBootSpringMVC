package com.singleInheritance_understandingConstructor_7__10_8_2024;

public class ClassB extends ClassA {
    ClassB() {
        System.out.println("Class B default Constructor");
    }

    ClassB(int i) {
        System.out.println("Class B parametrized Constructor : " + i);
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        new ClassB(500);
        b.meth2();
    }

    void meth2() {

        System.out.println("Class B method()");
        super.meth1();
    }

}