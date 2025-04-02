package com.staticKeyword_2__10_7_2024;

public class ClassC {
    static {
        int x = 30;
        System.out.println(x + " ");
    }

    int x = 10;

    public static void main(String[] args) {
        //	System.out.println(x); // C.E because we can't call instance variable directly with the help of variable inside a static method

    }
}
