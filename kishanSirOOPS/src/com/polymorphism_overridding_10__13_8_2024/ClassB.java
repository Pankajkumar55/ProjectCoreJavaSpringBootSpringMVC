package com.polymorphism_overridding_10__13_8_2024;

public class ClassB extends ClassA {

    static void meth5() {
        System.out.println(50);
    }

    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        aobj1.meth1();
        System.out.println("------------------------");

        ClassA aobj2 = new ClassB();
        aobj2.meth1();
        aobj2.meth2(1000);
        aobj2.meth3(100, "String");
        aobj2.meth4(new StringBuffer("java"));
        aobj2.meth5();
        aobj2.meth6();

    }

    int meth1() { // overridding method
        System.out.println(10);
        return 10;
    }

    void meth2(int x) {
        System.out.println(20);
    }

    void meth3(int x, String msg) {
        System.out.println(30);
    }

    public void meth4(StringBuffer sb) {
        System.out.println(40);
    }

    ClassB meth6() // overridden method
    {
        System.out.println(60);
        return this;
    }
}
