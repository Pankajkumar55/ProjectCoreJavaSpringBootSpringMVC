package com.operators_1__5_7_2024;

public class ClassC {
    public static void main(String[] args) {
        System.out.println("Start");
        new ClassC().meth2();
        System.out.println("Java is awesome ");
    }

    int meth1() {
        int a = 10;
        a++;
        System.out.println(a++);
        a++;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a++);
        a--;
        System.out.println(--a);
        a = a++ + 3;
        System.out.println("a value ----> " + a);

        System.out.println(a++);
        --a;
        System.out.println(--a);
        System.out.println(a--);
        a = a-- + 3;
        return a++ + ++a;

    }

    void meth2() {
        int a = 10;
        int x = new ClassC().meth1() + a++;
        System.out.println(x++ + a++);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(x);

    }
}
