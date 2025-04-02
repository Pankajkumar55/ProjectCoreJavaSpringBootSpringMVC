package com.wrapperClass_1__15_7_2024;

public class ClassA {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.autoBoxing();
        System.out.println("=====================");
        a.autoUnboxing();

    }

    void autoBoxing() {
        System.out.println("Performing Auto-Boxing");

        int i = 10;
        Integer ival1 = i; // 1st way

        Integer ival2 = new Integer(i); // 2nd way
        // The constructor Integer (int) has been deprecated since version 9 and marked
        // for removal

        Integer ival3 = Integer.valueOf(i); // 3rd way

        System.out.println("PDT i : " + i);
        System.out.println("WCO ival1 : " + ival1);
        System.out.println("WCO ival2: " + ival2);
        System.out.println("int Range : " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println("WCO ival3 : " + ival3 + "\n");

        char c = 'A';
        Character cval = Character.valueOf(c);
        System.out.println("PDT c : " + c);
        System.out.println("WCO cval : " + cval + "\n");

        byte b = 50;
        Byte bval = new Byte(b);
        System.out.println("PDT b : " + b);
        System.out.println("WCO bval : " + bval);
        System.out.println("byte Range : " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

    }

    void autoUnboxing() {
        System.out.println("Performing autoUnboxing\n");

        Integer ival = new Integer(250);
        int i1 = ival; // 1st way
        int i2 = ival.intValue(); // 2nd way

        System.out.println("Integer WCO : " + ival);
        System.out.println("int PDT i1 : " + i1);
        System.out.println("int PDT i2 : " + i2 + "\n");

        Character cval = new Character('x');
        char c = cval.charValue();
        System.out.println("Character WCO : " + cval);
        System.out.println("char PDT c : " + c);

    }
}
