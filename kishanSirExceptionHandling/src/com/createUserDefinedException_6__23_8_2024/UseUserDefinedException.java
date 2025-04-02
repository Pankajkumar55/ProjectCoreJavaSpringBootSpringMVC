package com.createUserDefinedException_6__23_8_2024;

import java.util.Scanner;

public class UseUserDefinedException {
    public static double currentBalance = 100;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your withdraw balance : ");
        double withdrarBalance = sc.nextDouble();

        try {

            if (currentBalance > withdrarBalance) {
                System.out.println("transaction succesfull");
                System.out.println("take your money");
            } else {
                System.out.println("transaction failed");
                throw new MinimumAccountBalance("Insufficient funds ! avilabe balance is " + currentBalance);
            }
        } catch (MinimumAccountBalance m) {
            System.out.println("hi");
            m.printStackTrace();
        } finally {
            sc.close();
        }

    }
}