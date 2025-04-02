package com.finalize;

public class ClassA {


    public static void main(String[] args) {

        ClassA c = new ClassA();
        ClassA c2 = new ClassA();

        c.meth1();

        c = null;


        //c.meth1(); // It generated an NullpointerException

        System.gc(); // calling garbage collector manually
    }

    void meth1() {
        System.out.println("java is awesome!!!");
    }

    protected void finalize() {
        System.out.println("garbage has been collected");
    }
}

/*
finalize():
-----------
1) finalize() is called internally by the garbage collector
2) Garbage collector is going to call finalize() if there is an object eligible for destruction

*/