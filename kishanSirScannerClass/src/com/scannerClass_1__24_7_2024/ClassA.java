package com.scannerClass_1__24_7_2024;

import java.util.Scanner;

public class ClassA {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassA c = new ClassA();
        // c.meth1();
        c.checkVoteEligibility();
        int p = sc.nextInt();
    }

    void meth1() {
        System.out.println("meth1() called");

        System.out.println("Enter your first number : ");
        int x = sc.nextInt();
        System.out.println("x value : " + x + "\n");

        System.out.println("Enter your second number : ");
        int y = sc.nextInt();
        System.out.println("y value : " + y + "\n");

        int z = x + y;
        System.out.println("value of z : " + z);
    }

    void checkVoteEligibility() {
        System.out.println("checking the vote Eligibity\n");
        System.out.println("Enter your name : ");
        String name = sc.next();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("you are eligible to voting");
        else if (age >= 100)
            System.out.println("you are dead");
        else
            System.out.println("you are eligible after " + (18 - age) + " year");

    }
}
