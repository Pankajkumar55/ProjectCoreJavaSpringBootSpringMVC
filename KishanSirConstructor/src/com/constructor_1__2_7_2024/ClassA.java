package com.constructor_1__2_7_2024;

public class ClassA {
    ClassA() {
        System.out.println("ClassA Non-Parametrized consturctor called ");
        new ClassA(100);
    }

    public ClassA(int x) {
        System.out.println("ClassA Parametrized constructor called : " + x);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
        new ClassA(500);
        new ClassA(10).meth1();

    }

    void meth1() {
        System.out.println("meth1() called");
        new ClassA(1000);
    }
}
