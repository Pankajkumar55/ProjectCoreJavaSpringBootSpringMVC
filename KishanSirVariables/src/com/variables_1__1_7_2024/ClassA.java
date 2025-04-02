package com.variables_1__1_7_2024;

public class ClassA {

    static int y = 20;  //static Varibale (or) Class
    static boolean flag; //static
    int x = 10; //Instance Variable (or) Global (or) Non-static
    int a; // Instance
    // int y=10; // C.E because of Duplicate varibale name
    // String y="java";

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
        System.out.println("----------------------");
        aobj.meth2();
        System.out.println("-----------------------");
        aobj.meth3();


    }

    void meth1() {
        int z = 30; //Local Variable
        System.out.println("meth1() called\n");

        System.out.println("Instance Varibale x : " + x); // by using indentifierName
        System.out.println("Instance Varibale x : " + new ClassA().x); // by using class object

        System.out.println("static Varibale y : " + y); // by using indentifierName
        System.out.println("static Varibale x : " + new ClassA().y); // by using class object
        System.out.println("static Varibale x : " + ClassA.y); // by using class

        System.out.println("\nLocal Variable z : " + z);  // by using inderifierName

    }

    void meth2() {
        int x = 100;
        int y = 200;
        System.out.println("meth2() callled\n");
        System.out.println("Instance Varibale x" + new ClassA().x);
        System.out.println("static Variable y" + new ClassA().y);

        // System.out.println("\nLocal Varibale z"+z);  // C.E
    }

    void meth3() {
        System.out.println("meth2() callled\n");
        int c; // local

        System.out.println("Instance Varibalea a :" + a);
        System.out.println("static Variable flag : " + ClassA.flag);
        //System.out.println("\nLocal Varibale : "+c);  // C.E
    }
}
