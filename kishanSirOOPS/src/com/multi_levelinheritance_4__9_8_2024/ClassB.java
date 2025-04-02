package com.multi_levelinheritance_4__9_8_2024;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1();
        b.meth2();
        b.methx();
    }

    void meth2() {
        System.out.println("meth2() called");
    }
}
