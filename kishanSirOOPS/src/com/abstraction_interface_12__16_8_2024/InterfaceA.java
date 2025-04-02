package com.abstraction_interface_12__16_8_2024;

public interface InterfaceA {
    int a = 10;

    static void meth3() {
        // this.meth4() // C.E because we can't acces this keyword inside a static area
    }

    public static void main(String[] args) {
        System.out.println("Interface A main()");
        InterfaceA.meth3();
    }

    void meth1();

    default void meth2() {
        System.out.println("Interface A default method");
    }

    private void meth4() {
        System.out.println("Interface A private method");
    }
}
