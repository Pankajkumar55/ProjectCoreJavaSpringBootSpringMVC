package com.operators_1__5_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        int i = 10;
        System.out.println(i++);
        System.out.println(i++);
        i++;
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        i++;
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        ++i;
        System.out.println(i--);
        i--;
        System.out.println(--i);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);

    }
}
