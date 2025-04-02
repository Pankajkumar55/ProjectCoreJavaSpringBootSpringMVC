package com.polymorphism_overridding_10__13_8_2024;

public class ClassA {

    static void meth5() // overridden method
    {
        System.out.println("Class A static meth5()");
    }

    int meth1() // overridden method
    {
        System.out.println("ClassA meth()");
        return 20;
    }

    void meth2(int i) // overridden method
    {
        System.out.println("ClassA meth2()");
    }

    void meth3(int i, String s) // overridden method
    {
        System.out.println("ClassA meth3()");
    }

    protected void meth4(StringBuffer sb) // overridden method
    {
        System.out.println("ClassA meth4()");
    }

    ClassA meth6() // overridden method
    {
        System.out.println("ClassA meth()");
        return this;
    }

}
