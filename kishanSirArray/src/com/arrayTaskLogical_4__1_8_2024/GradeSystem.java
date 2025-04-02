package com.arrayTaskLogical_4__1_8_2024;

import java.util.Scanner;

public class GradeSystem {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GradeSystem g = new GradeSystem();
        g.meth1();
    }

    void meth1() {
        System.out.println("Welcome to the student Grade Management System!");
        System.out.println("Enter the number of student");
        int sN = sc.nextInt();
        int sNumber[] = new int[sN];
        int j = 1;
        for (int i = 0; i <= sNumber.length - 1; i++, j++) {
            System.out.println("Enter the grade of " + j + " student");
            sNumber[i] = sc.nextInt();
        }


        while (true) {
            System.out.println("Menu :");
            System.out.println("1. view all grades");
            System.out.println("2. view the average grade");
            System.out.println("3. view the highest grade");
            System.out.println("4. view the lowest grade");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            int count = sc.nextInt();
            switch (count) {
                case 1: {
                    System.out.println("\nview all grades");
                    break;
                }
                case 2: {
                    System.out.println("\nview the average grade");
                    break;
                }
                case 3: {
                    System.out.println("\nview the highest grade");
                    break;
                }
                case 4: {
                    System.out.println("\nview the lowest grade");
                    break;
                }
                case 5: {

                    System.out.println("\n Exit");
                    return;

                }
                default: {
                    System.out.println("you are Enter a invalid number please Enter a valid number");
                }
            }
        }
    }
}
