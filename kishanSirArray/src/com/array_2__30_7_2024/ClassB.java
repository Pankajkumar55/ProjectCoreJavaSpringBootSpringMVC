package com.array_2__30_7_2024;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ClassB {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ClassB b = new ClassB();

        // b.meth1();
        System.out.println("---------------------");
        // b.meth2();
        System.out.println("---------------------");
        b.ticketBooking();
        System.out.println("---------------------");
        // b.meth3();
    }

    void meth1() {
        System.out.println("meth1() called\n");
        int arr1[] = {10, 20, 30, 40, 50};

        System.out.println("arr1 : " + arr1);
        System.out.println("arr1 : " + Arrays.toString(arr1));

        System.out.println("\nReteriving the data by using for loop");
        for (int i = 0; i <= 4; i++) {

            System.out.println(arr1[i]);
        }
        System.out.println();
        System.out.println("\nReteriving the data by using for loop in reverse order");
        for (int i = arr1.length - 1; i >= 0; i--) {

            System.out.println(arr1[i]);
        }

        System.out.println("\nRetriving the data using for each loop");
        for (int x : arr1) {
            System.out.println(x + " ");
        }

    }

    void meth2() {
        System.out.println("meth2() called");
        String names[] = new String[5];
        System.out.println("Please enter " + names.length + " names");
        for (int i = 0; i <= names.length - 1; i++) {
            names[i] = sc.next();

        }
        System.out.println("Names entered by the user :" + Arrays.toString(names));

        String revNames[] = new String[names.length];
        int j = 0;
        for (int i = names.length - 1; i >= 0; i--, j++) {
            revNames[j] = names[i];
        }
        System.out.println("\nnames : " + Arrays.toString(names));
        System.out.println("revNames : " + Arrays.toString(revNames));

    }

    void ticketBooking() {

        System.out.println("Welcome which movie you want to see ? ");
        String movieNames = sc.next();
        System.out.println("How many ticket you need for " + movieNames);
        String names[] = new String[sc.nextInt()];
        System.out.println("Please enter " + names.length + " names");
        for (int i = 0; i <= names.length - 1; i++) {
            names[i] = sc.next();
        }
        System.out.println("Which row you need ?");
        String row = sc.next();
        System.out.println("Enter your seat numbers ?");
        int SeatNumbers = sc.nextInt();
        System.out.println(names.length + " tickets were booked below are the details");
        for (String s : names) {
            System.out.println(s + " " + row + " " + SeatNumbers++);
        }

    }

    void meth3() {
        System.out.println("meth3 called");
        int arr[] = new int['A'];
        System.out.println("Array length : " + arr.length);
        arr[0] = 10;
        System.out.println(arr[0]);

    }
}