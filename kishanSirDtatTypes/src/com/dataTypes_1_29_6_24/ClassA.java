package com.dataTypes_1_29_6_24;

public class ClassA {
    int a;
    byte b;
    short s;
    long l;

    float f;
    double d;

    char c;
    boolean flag;

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.meth1();
        a.meth2();

    }

    void meth1() {
        System.out.println("Printing default values of datatype\n");
        System.out.println("int default value" + a);
        System.out.println("byte default value" + b);
        System.out.println("short default value" + s);
        System.out.println("long default value" + l);

        System.out.println("float default value" + f);
        System.out.println("double default value" + d);

        System.out.println("char default value" + c);  //Default value is char :  \u0000 which is not printeble
        System.out.println("boolean default value" + flag);

    }

    void meth2() {
        System.out.println("\nmeth() called");
        int i1 = 100;
        int i2 = 100;
        int i3 = i1 + i2;
        System.out.println("i3 : " + i3);

        byte b1 = 10;
        byte b2 = 10;
        byte b3 = (byte) (b1 + b2); // 10+10=20 ---> int

		/*

		 1) Every number in java is by default considered as int

		 2) Arithmetical operations will be giving you the result in either int or long

		 3) Every decimal value in java is by default considered as double

		 */

        float f = 10.9f;
        System.out.println("f : " + f);

        long x = 2147483648l;
    }
}