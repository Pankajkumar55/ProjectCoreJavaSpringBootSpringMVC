package com.staticKeyword_2__10_7_2024;

public class ClassL {
    static int e;    //1
    int c;            //0

    ClassL() {
        System.out.println(++c);
        System.out.println(++e);
    }

    public static void main(String[] args) {
        int a = 34;  //
        int b = 21;


        new ClassL().c -= a++ + ++b;  //c=35+22
        int d = --a + --b + new ClassL().c--;  //34+21+1  =56
        e = a + +b + +new ClassL().c + d--;  //34+21+
        int f = -a + b-- + -new ClassL().c - d++;  //***// ==>
        int sum = a + b + new ClassL().c + d + e + f;
        System.out.println("sum : " + sum);

    }
}
