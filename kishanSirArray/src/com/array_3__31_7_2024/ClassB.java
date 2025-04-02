package com.array_3__31_7_2024;

import java.util.Arrays;

public class ClassB {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1(new int[]{10, 20, 30, 40, 50}, new String[]{"pankaj,rohit", "prabhujee", "suraj"});


    }

    char[] meth1(int num[], String names[]) {

        // Task 1 : print all the elements present in num array in a reverse order

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }


        // Task 2 : just print the elements in names array
        System.out.println();
        System.out.print(Arrays.toString(names));

        return null;
    }
}
