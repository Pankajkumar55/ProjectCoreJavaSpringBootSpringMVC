package com.Single_inheritance_3__9_8_2024;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();  // 1st point (Has-A-Realtion)
        aobj.meth1();
        //aobj.meth2/(); // C.E

        ClassA aobj2 = new ClassB();  //2nd point
        aobj2.meth1();
        //aobj.meth2()  // C.E

        ClassB bobj = new ClassB();  // 3rd point (Is-A-Realtion)
        bobj.meth1();
        bobj.meth2();

        //ClassB bobj2=new ClassA(); //C.E

    }

    void meth2() {
        System.out.println("meth2() called");
    }
}
