package com.getClass;


public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA a2 = new ClassA();
        ClassB b = new ClassB();


        System.out.println("getClass() :" + a.getClass());
        System.out.println("getClass() :" + a2.getClass());
        System.out.println("getClass() :" + b.getClass());


    }

}

/*

getClass() : It provides fully qualified ClassName
-----------

 

*/
