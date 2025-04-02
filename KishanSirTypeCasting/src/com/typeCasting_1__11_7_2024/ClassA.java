package com.typeCasting_1__11_7_2024;

public class ClassA {
    public static void main(String[] args) {

    }

    void implicit() {
        System.out.println("Performing Implicit TypeCasting\n");

        byte b1 = 50;
        int i1 = b1;
        float f1 = b1;
        System.out.println("B1 : " + b1);
        System.out.println("i1 : " + i1);
        System.out.println("f1 : " + f1);

        byte c1 = 'A';
        int i2 = c1;

        System.out.println("\nc1 : " + c1);
        System.out.println("i2 : " + ++i2 + 1);
        System.out.println("i2 : " + (++i2 + 1));

        char c2 = ' ';
        int i3 = c2;
        System.out.println("\nc2 : " + c2);
        System.out.println("i3 : " + i3);


    }

    void explicit() {
        System.out.println("Performing explicit TypeCasting ");

        int i1 = 10;
        byte b1 = (byte) i1;
        System.out.println("i1 : " + i1);
        System.out.println("b1 : " + b1);

        int i2 = 500;
        byte b2 = (byte) i2;  // byte range : -128 to 127

		/*
		  [minimumRange+ (result-maximumRange -1]
		  128+(500-127-1) ===> -128+(500-128) ===> -128+372 ===> 244
		  -128+(244-127-1) ===> -128+(244-128) ===> -128+116 ===>

		 */

        System.out.println("\ni2 : " + i2);
        System.out.println("b2 : " + b2);

        float f = 10.9999f;
        byte b3 = (byte) f;
        System.out.println("\nf : " + f);
        System.out.println("b3 : " + b3);


    }

    void meth1(byte b) {
        System.out.println("meth1() called");
        System.out.println("b value " + b);
    }
}
