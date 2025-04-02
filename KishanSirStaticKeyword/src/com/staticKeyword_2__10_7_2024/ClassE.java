package com.staticKeyword_2__10_7_2024;

public class ClassE {
    static int x = 10;
    static int y = 20;

    static {
        System.out.println("-------Test11 SB1 called-------");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    static {
        System.out.println("----Test11 SB2 called----");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    {
        System.out.println("Instance block ");
    }

    static void m1() {
        int x = 100;
        System.out.println("static method callled");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    public static void main(String[] args) {
        m1();
    }
}
