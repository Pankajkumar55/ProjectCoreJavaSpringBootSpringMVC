package com.abstraction_interface_12__16_8_2024;

public class ClassA extends ClassB implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        InterfaceA aobj = new ClassA();
        aobj.meth1();
        aobj.meth2();

        InterfaceB bobj = new ClassA();
        bobj.msg(100, "java is awesome");

        new ClassA().display();
    }

    public void meth1() {
        System.out.println("Interface A abstract method overridden");
    }

    public void msg(int i, String s) {
        System.out.println("\nInterface B abstract method overridden");
        System.out.println("i : " + i);
        System.out.println("s : " + s);
    }
}
