package com.equals;

public class ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        System.out.println(a.equals(new ClassA()));
        System.out.println(a.equals(a));

        System.out.println(b.equals(new ClassB()));
        System.out.println(b.equals(a));
        System.out.println(a.getClass());
    }

    void meth2() {

    }
}

