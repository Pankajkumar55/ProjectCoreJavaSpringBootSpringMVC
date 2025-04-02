package com.staticKeyword_2__10_7_2024;

public class ClassJ {
    static {
        System.out.println(x);
        ClassJ.x = x + 20;
    }    static int x = m1();

    public static void main(String[] args) {
        System.out.println(ClassD.x);
    }

    static int m1() {
        System.out.println(ClassJ.x);
        return m2();
    }

    static int m2() {
        System.out.println(ClassJ.x);
        return 100;
    }


}
