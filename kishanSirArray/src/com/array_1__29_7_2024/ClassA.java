package com.array_1__29_7_2024;

import java.util.Arrays;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("Implementing array");

        int arr1[];
        arr1 = new int[5];

        int arr2[] = new int[3];

        int arr3[] = {11, 22, 33, 44};

        int arr4[] = new int[]{100, 200, 300, 400, 500, 600};

        String s = "Java";

        System.out.println("\narr1 length : " + arr1.length);
        System.out.println("arr2 length : " + arr2.length);
        System.out.println("arr3 length : " + arr3.length);
        System.out.println("arr4 length : " + arr4.length);
        System.out.println("s length : " + s.length());

        System.out.println("\narr1 : " + arr1);
        System.out.println("arr2 : " + arr2);
        System.out.println("arr3 : " + arr3); // we will be getting the implementation of toString()
        System.out.println("arr4 : " + arr4);

        // If we want to view the elements which are present in out Array we need to use
        // Arrays class
        System.out.println("\narr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("arr4 : " + Arrays.toString(arr4));

        // Index positions of an array is used to pass the values into an array and
        // retrieve the values from the array

        arr1[1] = 25;
        arr1[arr1.length - 2] = 45;
        System.out.println("\narr1 : " + Arrays.toString(arr1));

        System.out.println("---------------------------");
        System.out.println(arr1[1]);
        System.out.println(arr1[arr2.length]);
        System.out.println(arr3[arr3.length - 1]);
        System.out.println(arr3[arr1.length - 2]);
        System.out.println(arr4[arr4.length - 3]);
        //System.out.println(arr4[arr4.length]); // ArrayIndexOutOfBoundsException

    }
}
