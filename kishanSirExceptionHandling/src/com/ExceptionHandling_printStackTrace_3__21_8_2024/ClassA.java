package com.ExceptionHandling_printStackTrace_3__21_8_2024;

import java.io.FileInputStream;
import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) throws Exception {
        ClassA a = new ClassA();
        a.meth1();
        a.meth2();

    }

    void meth1() {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];
        arr[1] = "NareshIt";
        arr[3] = "Kishan";

        System.out.println(10);

        try {
            System.out.println("try block executed");
            System.out.println("Enter a number");
            System.out.println("===>" + 20 / sc.nextInt()); // It generates ArithmeticException
            System.out.println("===>" + arr[2].toUpperCase()); // It generates NullPointerExecption
            System.out.println("Hello world");

        }
        /*
         * // System.out.println("Hello world"); // C.E
         *
         * catch (ArithmeticException e) {
         * System.out.println("1st catch block executed"); e.printStackTrace();
         *
         * } catch (NullPointerException e) {
         * System.out.println("2nd catch block executed"); e.printStackTrace(); }
         * //System.out.println("hyyyy"); // C.E
         *
         */ catch (ArithmeticException | NullPointerException e) {
            System.out.println("catch block executed");
            e.printStackTrace();
        } finally {
            System.out.println("finally block executed");
            System.out.println(30);

        }

    }

    void meth2() throws Exception {
        System.out.println("meth2() called");
        try (FileInputStream fis = new FileInputStream("E:\\KishanSir\\file1")) {
            System.out.println("Connection created");
        }
    }
}
