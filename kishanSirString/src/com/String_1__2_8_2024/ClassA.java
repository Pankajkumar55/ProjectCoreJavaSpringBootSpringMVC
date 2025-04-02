package com.String_1__2_8_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth2();
    }

    void meth() {
        System.out.println("Implementing String Handling\n");

        String s1 = "java";
        String s2 = new String("Java");

        char arr[] = {'j', 'a', 'v', 'a'};

        String s3 = new String(arr);
        String s4 = new String(arr, 2, 1);

        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);
        System.out.println("s3 :" + s3);
        System.out.println("s4 :" + s4);

    }

    void meth2() {
        System.out.println("Sting class is Immutable\n");
        String s = "java";

        System.out.println("Before changing the value :" + s);


        //System.out.println(s.concat(" is awesome"));

        s = s.concat(" is awesome");

        System.out.println("After changing the value : " + s);

    }
}
