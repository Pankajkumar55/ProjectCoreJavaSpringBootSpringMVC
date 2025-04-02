package com.controlStatement_1__16_7_2024;

public class ClassC {
    public static void main(String[] args) {
        new ClassC().meth1();
    }

    void meth1() {
        int x = 10;
        int y = 20;

        if (x > y) {
            if (x % 2 == 0) {
                if (x % 5 == 0) {
                    if (x % 3 == 0) {
                        System.out.println("x is greater, even, divisible by 5 and 3");
                    } else {
                        System.out.println("x is greater, even, divisible by 5 but not by 3");

                    }
                } else {
                    System.out.println("x is greater, even, not divisble by 5");
                }
            }
            System.out.println("x is greater and odd");
        } else if (y > x) {
            if (y % 2 == 0) {
                if (y % 5 == 0) {
                    if (y % 3 == 0) {
                        System.out.println("y is greater, even divisible by 5 and 3");
                    } else {
                        System.out.println("y is greater, even, divisble by 5 but not by 3");
                    }
                } else {
                    System.out.println("y is greater even not divisible by 5");

                }
            } else {
                System.out.println("y is greater and odd");
            }
        }
        System.out.println("x and y are equal");
    }
}
