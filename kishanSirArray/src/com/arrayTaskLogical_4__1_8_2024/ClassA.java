package com.arrayTaskLogical_4__1_8_2024;

import java.util.Arrays;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        int result[] = a.meth1();
        System.out.println(Arrays.toString(result));


    }

    int[] meth1() {
        int arr[] = {5, 3, 5};


        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 3) {
                arr[i] = 0;
            }

        }
        return arr;

    }
}

