package com.staticKeyword_2__10_7_2024;

public class ClassD {
    static int x = 10;

    public static void main(String[] args) {
        ClassD d = new ClassD();
        ClassD d2 = new ClassD();

        d.x = 20;
        System.out.print(x + " ");
        System.out.println(d2.x);


    }
} 