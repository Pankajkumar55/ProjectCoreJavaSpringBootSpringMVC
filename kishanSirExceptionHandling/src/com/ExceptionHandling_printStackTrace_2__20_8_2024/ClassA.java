package com.ExceptionHandling_printStackTrace_2__20_8_2024;

import java.util.Scanner;

public class ClassA {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();

    }

    void meth1() {
        System.out.println(10);

        try {
            System.out.println("try block executed");
            System.out.println("Enter a number : ");
            System.out.println(10 / sc.nextInt());
        } catch (ArithmeticException eobj) {
            System.out.println("Catch block executed");
            //	System.out.println(eobj.getMessage()); // REASON OF THE EXECPTION
            System.out.println(eobj.toString()); // NAME AND REASON OF THE EXECPTION
            //	eobj.printStackTrace(); // *** IT PRINTS FULL INFO ABOUT THE EXECPTION*** }
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);

    }
}