package com.controlStatement_1__16_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1('A');
        a.meth2(20);
        System.out.println("meth3() is returning : " + a.meth3(2));
        a.meth4(a.meth5() + 10);
        a.meth6(6);
        a.meth7();
        a.meth8(0);
    }

    void meth1(int i) {
        System.out.println("--------------meth1()---------------");
        if (i - 60 <= 5) {
            System.out.println("hii");
        }
        System.out.println("meth1() execution completed");
    }

    void meth2(int i) {
        System.out.println("--------------meth2()---------------");
        if (i <= 5)
            // int x=500; // C.E Because we should not write any declarative statement in
            // this line
            System.out.println("hii");
        System.out.println("meth()2 execution completed");
    }

    String meth3(int i) {
        System.out.println("--------------meth3()---------------");
        if (i <= 5)
            return "java is awesome";
        System.out.println("hi");
        return "java is oop-language";
        // System.out.println("HELLO"); // C.E Because of unreachable code
    }

    void meth4(int i) {
        System.out.println("--------------meth4() called---------");
        if (i <= 5) {
            System.out.println("if block executed");
            System.out.println("hi");
            int x = 5;
            if (x <= new ClassA().meth5()) {
                System.out.println("Hello world");
            }
        } else {
            System.out.println("else block executed");
            System.out.println("hello");
            int y = new ClassA().meth5() + 10;
            if (y >= 'A') {
                System.out.println("java is awesome");
            }
        }

    }

    int meth5() {
        System.out.println("--------------meth5() called---------");
        return 5;

    }

    void meth6(int i) {
        System.out.println("--------------meth6() called---------");
        if (i <= 5)
            System.out.println("hi");
            // System.out.println("hello world"); // C.E
        else
            System.out.println("hello");
        System.out.println("Hello world");
        System.out.println("meth6() execuation completed");

    }

    void meth7() {
        System.out.println("--------------meth7() called---------");
        if (true) {
            System.out.println("if block");
        } else {
            System.out.println("else block"); // DEAD CODE // WARNING Because of condition is only true
        }
    }

    void meth8(int i) {
        System.out.println("----------------meth8() called--------");
        if (i > 0) {
            System.out.println(i + "is a positive number");
        } else if (i < 0) {
            System.out.println(i + " is a negative number");
        } else {
            System.out.println(i + " is equal to zero");
        }
        System.out.println("meth8() execution completed");
    }
}
