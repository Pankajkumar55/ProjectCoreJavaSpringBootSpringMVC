package com.array_2__30_7_2024;

import java.util.Scanner;

public class Test {

    static int acTicket = 500;
    static int nonAcTicket = 400;

    // static String busName="volvo";
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Test t = new Test();
        t.meth1();
    }

    void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to bus ticket booking system");

        System.out.println("Enter bus Name");
        String busName = sc.next();
        System.out.println("How many tickets you want");
        String personName[] = new String[sc.nextInt()];
        int personAge[] = new int[personName.length];
        String ticketType[] = new String[personName.length];
        if (personName.length > 0) {
            int j = 1;
            for (int i = 0; i <= personName.length - 1; i++, j++) {
                System.out.println("Enter " + j + " Person Name : ");
                personName[i] = sc.next();
                System.out.println("Enter " + j + " Person Age : ");
                personAge[i] = sc.nextInt();

                System.out.println("");

            }
            System.out.println("(Your ticket Deatails)");
            int seatNumber = 5;
            for (int p = 0; p <= personName.length - 1; p++, seatNumber++) {
                System.out.println(busName + " " + personName[p] + " " + personAge[p] + " Seat No=>" + seatNumber);

            }


        } else {
            System.out.println("Bye Bye see you next time");
        }


    }
}
