package com.abstraction_interface_13__17_8_2024;

public class ClassA implements InterfaceA, InterfaceB {

    /*
     * We can't achieve multiple inheritance in java through classes because of
     * interfaces. The ambiguity problem can be r esolved in interfaces by using
     * method overidding
     */


    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    @Override
    public void meth1() {
        InterfaceA.super.meth1();
        InterfaceB.super.meth1();
    }
}
