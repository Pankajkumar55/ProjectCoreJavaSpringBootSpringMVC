package com.staticKeyword_1__9_7_2024;

public class StaticBlockD {

    static int x = StaticBlockD.meth1();

    static {
        System.out.println("static block ");
    }

    static {
        System.out.println("static block called  value of x : " + x);
    }

    static int meth1() {
        System.out.println("meth1 () called");
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("main() called");
        System.out.println("====>" + (StaticBlockD.meth1() - 99));
    }
}
