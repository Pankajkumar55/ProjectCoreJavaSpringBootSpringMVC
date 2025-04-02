package com.singleInheritance_understandingConstructor_7__10_8_2024;

public class ClassA extends ClassAA {
    ClassA() {

        this.meth1();
        System.out.println("Class A Default Constructor");
    }

    ClassA(int a) {
        this.meth1();
        System.out.println("Class A parametrized Consturctor : " + a);
    }

    void meth1() {

        System.out.println("Class A method");
    }
}
