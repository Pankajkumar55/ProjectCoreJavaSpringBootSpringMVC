package com.constructor_1__2_7_2024;

public class ClassJ {
    ClassJ() {
        System.out.println(10);
    }

    ClassJ(int a, String s) {
        System.out.println(a);
        System.out.println(s);
    }

    ClassJ(String s, int x) {
        System.out.println(s);
        System.out.println((x * 2) + 100);
    }

    public static void main(String[] args) {
        int result = new ClassJ().calculate(new ClassJ(new ClassJ().evaluate(6), "hi").compute(10, new ClassJ().proces(8, 4))
                + new ClassJ("hi", 20).analyze(5, 3, new ClassJ().evaluate(6)));

        System.out.println("Final result : " + result);
    }

    int calculate(int x) {
        System.out.println("Inside calculate : " + x);
        return x * 3;
    }

    int compute(int a, int b) {
        System.out.println("Inside compute : " + a + "," + b);
        return a + b;
    }

    int proces(int m, int n) {
        System.out.println("Inside process : " + m + "," + n);
        return m + n;
    }

    int analyze(int p, int q, int r) {
        System.out.println("Inside analyze : " + p + "," + q + "," + r);
        return p * q + r;
    }

    int evaluate(int x) {
        System.out.println("Inside evaluate : " + x);
        return x / 2;

    }
}
