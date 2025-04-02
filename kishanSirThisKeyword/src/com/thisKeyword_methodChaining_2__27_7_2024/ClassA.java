package com.thisKeyword_methodChaining_2__27_7_2024;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1().meth2().meth3(); // methodChaining
    }

    ClassA meth1() {
        System.out.println(10);
        return new ClassA();
    }

    ClassA meth2() {
        System.out.println(20);
        return new ClassA();
    }

    ClassA meth3() {
        System.out.println(30);
        return new ClassA();
    }
}
