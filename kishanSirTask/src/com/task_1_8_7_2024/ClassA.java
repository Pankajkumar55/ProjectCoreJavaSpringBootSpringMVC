package com.task_1_8_7_2024;


public class ClassA {
    ClassA() {
        System.out.println("Division : " + (100 / 2));
    }

    ClassA(int a) {
        System.out.println("Multiplicatio : " + (a * 2));
    }

    public static void main(String[] args) {
        new ClassA(10).meth1(1, 2, 3);
    }

    void meth1(int a, int b, int c) {
        System.out.println("Addition : " + (a + b + c));
        new ClassA().meth2(20, 15);
    }

    void meth2(int a, int b) {
        System.out.println("Substraction : " + (a - b));
    }
}