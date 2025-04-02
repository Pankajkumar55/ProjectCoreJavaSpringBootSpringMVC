package com.iterationSatements_1__19_7_2024;

public class ClassA {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.meth1(1);
        a.meth2(1);
        a.meth3(1);
        a.meth4(1);
        a.meth5(1);
        a.meth6(1);
    }

    void meth1(int i) {
        System.out.println("----------meth1()------------");
        while (i <= 5) {
            System.out.println("i value : " + i);
            i++;
        }
        System.out.println("meth1() called");
    }

    void meth2(int i) {
        System.out.println("----------meth2()------------");
        while (i <= 10) {
            System.out.println(" i value : " + ++i);
            i++;
        }
        System.out.println("meth2() called");
    }

    void meth3(int i) {

        System.out.println("----------meth3()------------");
        while (i <= 10) // 13<=10
        {
            System.out.println("i value : " + i++ + " " + ++i);
            i++;
        }
        System.out.println("meth3() called");

    }

    void meth4(int i) {

        System.out.println("----------meth4()------------");
        while (i <= 5)
            // int x=50 // C.E we should not write any declarative statements in this line

            System.out.println("i value : " + i);
        i++;
        System.out.println("meth4() called");

    }

    void meth5(int i) // Infinite Loop
    {
        System.out.println("----------meth5()------------");
        while (true) {
            System.out.println("i value : " + i);
            i++;
            break;

        }
        System.out.println("meth5() called");
    }

    void meth6(int i) {
        System.out.println("---------meth6()-------------");
        do {
            System.out.println("i value : " + i);
            i++;
        } while (i <= 5);
        System.out.println("meth6() called");

    }
}
