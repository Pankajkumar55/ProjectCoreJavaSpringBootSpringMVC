package com.thisKeyword_1__27_7_2024;

public class ClassB {
    static void meth1() {
        System.out.println("meth1() called");
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth3();

    }

    void meth2() {
        this.meth1(); // we can call a static method with the help of 'this' (But it is NOT recommended)
        System.out.println("meth2() called");
    }

    void meth3() {
        meth2(); // we can call a static method with the help of 'this'(But it is NOT recommended)
        System.out.println("meth3() called");

    }

}
