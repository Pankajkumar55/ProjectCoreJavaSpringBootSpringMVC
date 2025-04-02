package com.task_2__15_7_2024;

public class ClassA {
    static int sVar;
    int iVar;

    ClassA() {
        System.out.println("Default constructor called ");

    }

    ClassA(int a) {
        System.out.println("Parametrized Constructor called ");
    }

    int pMethod(int i) {
        int lVar = 50;
        System.out.println("Parametrized method");
        System.out.println("i : " + i);
        ClassA aObj = new ClassA();
        System.out.println("HashCode method : " + aObj.hashCode());
        System.out.println("toStrint method : " + aObj.toString());
        System.out.println("getClass method : " + aObj.getClass());
        System.out.println("equals method : " + aObj.equals(new ClassA(20)));

        System.out.println("Increment operator : " + ++sVar);
        System.out.println("Decrement operator : " + --sVar);
        System.out.println("Arithmetic operator :" + (sVar + 10));
        System.out.println("Realational operator : " + (sVar));

        return i;
    }

    void nonPMethod() {
        System.out.println("Non-Parametrized method");
    }


}
