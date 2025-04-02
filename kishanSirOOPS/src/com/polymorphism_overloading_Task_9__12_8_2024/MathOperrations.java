package com.polymorphism_overloading_Task_9__12_8_2024;

public class MathOperrations {
    public static void main(String[] args) {
        MathOperrations mobj = new MathOperrations();

        System.out.println("Sum of 5 and 7 : " + mobj.addNumbers(5, 7));
        System.out.println("Sum of 3.5 and 2.5 : " + mobj.addNumbers(3.5d, 2.5d));
        System.out.println("Concatenation : " + mobj.addNumbers("Hello", " java"));
        System.out.println("Sum of all digits : " + mobj.addNumbers(new int[]{1, 2, 3, 4, 5}));
    }

    int addNumbers(int a, int b) {
        return a + b;
    }

    double addNumbers(double a, double b) {
        return a + b;
    }

    String addNumbers(String a, String b) {
        return a + b;
    }

    int addNumbers(int a[]) {
        int add = 0;
        for (int i = 0; i < a.length; i++) {
            add += +a[i];
        }
        return add;
    }

}
