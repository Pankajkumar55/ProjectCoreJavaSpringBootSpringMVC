package com_ExceptionHandling_1__19_8_2024;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    public void meth1() {
        System.out.println(10);

        try {
            System.out.println("try block executed");
            System.out.println(30 / 0);

        } catch (ArithmeticException e) {
            System.out.println("catch block executed");
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }
}
