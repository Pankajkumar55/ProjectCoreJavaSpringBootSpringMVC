package com.staticKeyword_1__9_7_2024;

public class ClassB {
    static int y = 10;
    int x = 10;

    static void meth2() {
        System.out.println("meth2 () called\n");
        System.out.println("Instance variable : " + new ClassB().x);
        System.out.println("static variable : " + y);
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1();
        meth2();   // by using idnetifierName
        b.meth2(); // by using class object
        ClassB.meth2(); // by using class name *** (Recomanded Approach)
    }

    void meth1() {   //Instance (or) Global (or) Non-static method

        System.out.println("meth1 () called\n");
        System.out.println("Instance variable : " + x);
        System.out.println("static variable : " + y);

    }
}	
