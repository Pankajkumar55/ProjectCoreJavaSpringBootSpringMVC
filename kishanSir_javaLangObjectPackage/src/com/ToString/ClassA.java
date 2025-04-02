package com.ToString;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA a2 = new ClassA();
        ClassB b = new ClassB();

        System.out.println("toString() :" + a.toString());
        System.out.println("toString() :" + b.toString());

    }

}


/*
 
 
toString() : it is going to convert an abject in to a String format



---------------Internal implemention toString ()-------------------

public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

*/
