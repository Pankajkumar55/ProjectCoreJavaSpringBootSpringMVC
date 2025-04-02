package com.thisKeyword_3__27_7_2024;

public class ClassA {
    ClassA() {
        this(100);
        this.meth1();
        System.out.println("Default constructor");
        new ClassA(100);
    }

    ClassA(int x) {
        System.out.println("Parametrized constructor");
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        System.out.println("hiii");
    }
}
