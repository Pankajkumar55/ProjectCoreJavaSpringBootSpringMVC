package com.array_3__31_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
