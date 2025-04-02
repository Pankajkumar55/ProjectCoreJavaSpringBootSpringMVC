package com.forEachLoop_1__23_7_2024;

public class ClassC {
    public static void main(String[] args) {
        new ClassC().meth1(20);
        System.out.println("end");

    }

    void meth1(int b) {
        int a = 10;
        while (a <= 20) {
            if (a == 15) {
                while (b <= 30) {
                    if (b == 25) {

                    }
                    System.out.println("b value : " + b);
                    b++;
                }
            }
        }
        System.out.println("a value : " + a);
        a++;

    }
}
