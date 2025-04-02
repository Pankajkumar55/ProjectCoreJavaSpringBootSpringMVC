package com.array_3__31_7_2024;

import java.util.Arrays;

public class ClassC {
    public static void main(String[] args) {

        ClassC c = new ClassC();
        c.meth1(new int[]{1, 2, 3, 4, 5}, new char[]{'A', 'B', 'C', 'D', 'E'});


    }

    String meth1(int arr1[], char arr2[]) {
        // Task1 : Pass all the elements which are present in arr1 in a reverse order in
        // another array and print both the arrays

        int revAnotherArray[] = new int[arr1.length];
        int j = 0;
        for (int i = arr1.length - 1; i >= 0; i--, j++) {
            revAnotherArray[j] = arr1[i];

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(revAnotherArray));
        System.out.println();


        // Task2 : Print all the elements which are present in arr2 by using
        // for loop (in both direction ) & by using for-each loop (one direction)
        for (int i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("By using for-each loop");
        for (char c : arr2)
            System.out.print(c + " ");

		/*
		  Task3 : You need to implement this task3 in main() if the length of an array
		  which is returned by meth1() is even the retrieve the first half of the
		  elements

		  if the length of an array which is returned by meth1() is odd the reterive only
		  the last two elements of the array

		  Note : the length of the arr2 which is returned by meth1() should be atlest 2.

		 *
		 */
        return "pankaj";
    }
}
