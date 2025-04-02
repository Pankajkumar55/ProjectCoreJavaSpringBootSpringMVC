package com.logical_Question_26_8_2024;

import java.util.Scanner;

public class Q7_CheckStringIsPalindroneOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String number");

        String name = sc.next();
        char n[] = name.toCharArray();

        String revName = "";

        for (int i = n.length - 1; i >= 0; i--) {
            revName += n[i];

        }
        if (revName.equalsIgnoreCase(name))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
