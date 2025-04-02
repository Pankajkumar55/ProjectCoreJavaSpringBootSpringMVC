package com.typeCasting_1__11_7_2024;

public class ClassB {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.implicit();

    }

    static void show() {
        char c = 'A';
        int a = ++c;
        System.out.println(a);
        ClassB b1 = new ClassB();
        String s = b1.meth1();
        System.out.println(s);
    }

    void implicit() {
        byte b = 10;
        System.out.println("byte value is : " + b);
        short s = b;
        System.out.println("short value is : " + s);
        s++;
        int i = s++;
        System.out.println("int value is : " + i);
        System.out.println("short value is : " + s);
        long l = i;
        System.out.println("long value is : " + (--l));
        float f = l;
        System.out.println("the value is float f : " + (f + b));
        double d = (--f);
        System.out.println("the value of double is : " + d);
        show();
        if ((d == f)) {
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }

    }

    String meth1() {
        String S = "Implicit casting is done by the compiler automatically";
        return S;
    }
}
