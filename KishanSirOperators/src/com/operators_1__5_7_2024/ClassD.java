package com.operators_1__5_7_2024;

public class ClassD {

    public static void main(String[] args) {
        int a = 34; // a =34
        int b = 21; // b =21

        int c = a++ + ++b;
        System.out.println("C value :" + c); //c= 34+22=56

        int d = --a + --b + c--;
        System.out.println("d value :" + d); // d = 34+21+56 =111

        int e = a + +b + +c + d--;
        System.out.println("e value :" + e); // e = 34+21+55+111=211

        int f = -a + b-- + -c - d++;
        System.out.println("f value :" + f); // f = 34+21+55+211 = 321

        int sum = a + b + c + d + e + f;
        System.out.println("sum value :" + sum);

    }
}