package com.staticKeyword_1__9_7_2024;

public class ClassA {
    static int y;
    int x;

    ClassA() {
        x++;
        y++;

        System.out.println("instance variable : " + x);
        System.out.println("static varibale : " + y);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        new ClassA();
        new ClassA();
        new ClassA();
    }
}
