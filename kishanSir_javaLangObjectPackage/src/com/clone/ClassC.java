package com.clone;

public class ClassC {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClassC cobj = new ClassC();
        cobj.meth1();
    }

    void meth1() throws CloneNotSupportedException {

        System.out.println("Implementing object cloning\n");
        ClassA aobj = new ClassA();
        System.out.println("aobj : x " + aobj.x + " aobj : y " + aobj.y);

        ClassA aobj2 = aobj;
        aobj2.y = 500;
        System.out.println("aobj : x " + aobj.x + " aobj : y " + aobj.y);

        System.out.println("aobj : " + (aobj.y == aobj2.y)); // check object Reference in memory
        System.out.println("\ncall clone method ");

        ClassB bobj = new ClassB();
        System.out.println("bobj : a " + bobj.a + " aobj : b " + bobj.b);
        ClassB bobj2 = bobj.createClone();

        bobj2.b = 500;

        System.out.println("bobj : a " + bobj.a + " bobj : b " + bobj2.b);
        System.out.println("bobj : " + (bobj.b == bobj2.b)); // check object refrence in memory

    }
}