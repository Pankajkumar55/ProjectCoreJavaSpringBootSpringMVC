package com.forEachLoop_1__23_7_2024;

public class ClassB {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1();
    }

    void meth1() {
        System.out.println("meth1 called");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // break;
                // continue;
                return;
            }
            System.out.println("i value : " + i);
        }
        System.out.println("compiler came out from loop");
    }
}
