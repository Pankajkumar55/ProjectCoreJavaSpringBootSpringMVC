package com.thisKeyword_1__27_7_2024;

public class ClassA {
    static int y = 20;
    int x = 10; //Instance variable

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        int x = 100;
        int y = 200;
        System.out.println("Instance variable x : " + new ClassA().x);
        System.out.println("instance variable x : " + this.x);
        System.out.println("local varibale : " + x);
        System.out.println("local variable : " + y);
        System.out.println("static varibale : " + ClassA.y);
    }
}
