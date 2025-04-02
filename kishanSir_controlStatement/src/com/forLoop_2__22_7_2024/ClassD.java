package com.forLoop_2__22_7_2024;

public class ClassD {
    public static void main(String[] args) {
        ClassD d = new ClassD();
        d.display();
    }

    void display() {
        for (int i = 1; i <= 5; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.println(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
