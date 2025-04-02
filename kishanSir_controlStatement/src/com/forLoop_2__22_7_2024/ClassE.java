package com.forLoop_2__22_7_2024;

public class ClassE {
    public static void main(String[] args) {
        ClassE e = new ClassE();
        e.display1();
    }

    void display1() {
        int a = 10;
        for (int k = (a++ + new ClassE().meth1(5)) + (++a + 3) + (++a + 3); k > 10; k++) {
            System.out.println(k + 6);
            break;
        }

    }

    int meth1(int a) {
        return new ClassE().meth2(10 + 1, 15 - 3) + (a * 2);
    }

    int meth2(int a, int b) {
        return a + b;
    }

}
