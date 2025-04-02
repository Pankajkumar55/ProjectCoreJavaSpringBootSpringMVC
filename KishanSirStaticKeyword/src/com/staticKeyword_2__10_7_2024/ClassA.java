package com.staticKeyword_2__10_7_2024;

public class ClassA {

    static int j = 20;

    static {
        int x = 10;
        System.out.println(x + " ");
        meth1();

    }

    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);

    }

    static void meth1() {
        System.out.println(j);
    }
}
