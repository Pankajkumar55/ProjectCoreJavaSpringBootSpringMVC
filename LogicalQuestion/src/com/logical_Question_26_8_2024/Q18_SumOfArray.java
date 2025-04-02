package com.logical_Question_26_8_2024;

import java.util.Scanner;

public class Q18_SumOfArray {
    public static void main(String[] args) {
        System.out.println("Enter your size of array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter your number");
        int add = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
            add += arr[i];

        }

        System.out.println("Entered by you");
        for (int c : arr) {
            System.out.println(c);
        }
        System.out.println("sum of all digits : " + add);

    }

}
