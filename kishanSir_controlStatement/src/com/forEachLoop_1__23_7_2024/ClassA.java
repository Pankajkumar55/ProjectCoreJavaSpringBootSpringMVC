package com.forEachLoop_1__23_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        System.out.println("meth1() called");

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);

        System.out.println("\nReteriving the data by using for loop");
        for (int i = 0; i <= 8; i++) {
            System.out.println("By for loop :" + arr[i]);
        }
        System.out.println("\nReterving the data in reverse order");
        for (int i = 8; i >= 0; i--) {
            System.out.println("by for reverse for loop :" + arr);
        }

        System.out.println("Using forEachLoop ");
        for (int j : arr) {
            System.out.println("ForEachLoop : " + j);
        }

		/*

		 for loop :
	whenever we are trying to retrieve the data from an array by using for loop we can retrieve the data both in forward and
	then backward directions, because for loop uses index positions to retireve the data from an array

	for each :
	whenever we are trying to retrieve the data from an array by using for-each loop we can retrieve the data only in forward
	directions because for each loop will be working on streaming data( streaming data means it will fetch data line by line from an array) it will not be working on index positions of an array

		 */

    }

    void meth() {


    }
}
