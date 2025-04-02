package com.forLoop_2__22_7_2024;

public class ClassB {

    public static void main(String[] args) {
        ClassB b = new ClassB();
        // b.meth1(5);
        b.meth2(2, 5);
        // b.meth3(1, 100);
        b.display();
    }

    void meth1(int num) {
        for (int b = 1; b <= 10; b++) {
            System.out.println(num + "*" + b + " = " + (num * b));
        }
    }

    void meth2(int num1, int num2) {
        for (; num1 <= num2; num1++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(num1 + "*" + b + " = " + (num1 * b));
            }
            System.out.println("------------");
        }
    }

    void meth3(int num1, int num2) {
        int count = 0;
        for (; num1 <= num2; num1++) {
            if (num1 % 2 == 0) {
                System.out.println("even number : " + num1);
                count++;
            }
        }
        System.out.println("counting number : " + count);

    }

    void display() {
        int a = 10;
        for (int k = (a++) + (++a) + (++a); k > 10; k++) {
            System.out.println(k);
            break;
        }
    }
}
