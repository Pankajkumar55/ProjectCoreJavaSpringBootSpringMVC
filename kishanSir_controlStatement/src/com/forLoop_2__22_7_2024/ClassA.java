package com.forLoop_2__22_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.display();
    }

    void display() {
        int a = 10;
        for (int k = (a++) + (++a) + (++a); k > 10; k++) {
            System.out.println(k);
            break;
        }

    }
}
