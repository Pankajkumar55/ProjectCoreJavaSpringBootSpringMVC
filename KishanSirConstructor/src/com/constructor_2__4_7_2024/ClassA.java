package com.constructor_2__4_7_2024;

public class ClassA {

    int a = 10;

    ClassA() {
        System.out.println("Hi");

    }

    ClassA(int a) {
        System.out.println("java is awesome");
    }

    ClassA(int a, int b, String s) {
        System.out.println(a + b);
        System.out.println(s);

    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.a = 10;

        ClassA a2 = new ClassA(50);
        a2.a = 30;
        System.out.println("Java" + a.testMethod1() + " " + (a.a + a2.a - 30));

        ClassA a3 = new ClassA();

        System.out.println("Value of a3 : " + a3.a);

    }

    public String testMethod1() {
        new ClassA(100, 200, "Java");
        System.out.println(40);
        return new ClassA().testMethod3(new ClassA(50).testMehtod2()) + new ClassA().testMethod4("hi");
    }

    public int testMehtod2() {
        System.out.println(50);
        return 10 + 15;

    }

    public String testMethod3(int a) {
        System.out.println(18);
        return "is";

    }

    public String testMethod4(String s) {
        System.out.println(88);
        return "Good";

    }

}
