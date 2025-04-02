package com.logical_Question_26_8_2024;

import java.util.Scanner;

public class Q1_reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] name = sc.nextLine().toCharArray();
        String revName = "";
        for (int i = name.length - 1; i >= 0; i--) {
            revName += name[i];

        }
        System.out.println(revName);
    }
}
