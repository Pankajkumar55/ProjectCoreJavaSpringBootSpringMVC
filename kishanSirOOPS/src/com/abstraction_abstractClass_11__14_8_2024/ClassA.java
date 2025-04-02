package com.abstraction_abstractClass_11__14_8_2024;

public abstract class ClassA {
    ClassA() {
        System.out.println("Class A default constructor called");
    }

    static void meth3() {
        // this.meth2(); // C.E beacuse we can't use this keyword inside static area
    }

    public static void main(String[] args) {
        System.out.println("Class A main() called");
        ClassA.meth3();
    }

    abstract void meth1();

    void meth2() {
        System.out.println("meth2() called");
    }
}
