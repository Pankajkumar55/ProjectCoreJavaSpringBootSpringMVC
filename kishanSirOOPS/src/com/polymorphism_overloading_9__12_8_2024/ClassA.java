package com.polymorphism_overloading_9__12_8_2024;

public class ClassA {
    static int meth1(int i) {
        System.out.println(20);
        return i;
    }

    static protected void meth1(String s) {
        System.out.println(10);
    }

    private void meth1(float f) {
        System.out.println(10);
    }

    private void meth1(int n, String name) {
        System.out.println(10);
    }

    private void meth1(String x, String s) {
        System.out.println(10);
    }

    private void meth1(byte b) {
        System.out.println(10);
    }

}
