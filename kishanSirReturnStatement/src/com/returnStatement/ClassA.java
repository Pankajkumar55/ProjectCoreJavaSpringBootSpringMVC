package com.returnStatement;

public class ClassA {
    public static void main(String[] args) {

        System.out.println("Start");
        ClassA a = new ClassA();
        a.meth1();
        System.out.println("----------------------");
        System.out.println("meth()2 is returning : " + a.meth2());
        System.out.println("----------------------");
        System.out.println("meth()3 is returning : " + a.meth3('a'));
        System.out.println("----------------------");
        System.out.println("meth()4 is returning : " + a.meth4(100));
        System.out.println("----------------------");
        a.meth5();

    }

    void meth1() {
        System.out.println("meth1() called");
        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        return;
    }

    int meth2() {
        System.out.println("meth2() called");
        return 100;
        // System.out.println("Hello world"); //C.E because of unreachable code

    }

    int meth3(int a) {
        System.out.println("meth3() called");
        System.out.println("int & char both are compatable datatypes");
        return 'A'; // ASCII value for 'A' is 65
    }

    String meth4(int i) {
        System.out.println("meth4 called");
        if (i <= 50) {
            System.out.println("if block executed");

            return "java is awesome";
            // System.out.println("hi"); // C.E because of unreachble code

        } else {
            System.out.println("else block is executed");
            return "java is amazing";
            // System.out.println("Hello "); // C.E bacause of unreachble code

        }

    }

    void meth5() {

        System.out.println("meth5 () caleed");
        return;

    }

}
