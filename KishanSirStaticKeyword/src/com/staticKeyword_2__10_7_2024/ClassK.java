package com.staticKeyword_2__10_7_2024;

public class ClassK {
    static int a = 0;
    int b = 0;

    ClassK() {
        a++;
        b++;
        System.out.println("static variable ====>" + a);
        System.out.println("Insatance variable ===>" + b);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        new ClassK();
        new ClassK();
        new ClassK();
        System.out.println("###############################");
        new ClassK().display();
    }

    void display() {
        System.out.println("*****Accessing static variable******");
        System.out.println(ClassK.a);
        System.out.println(a);
        System.out.println(new ClassK().a);

    }
}
