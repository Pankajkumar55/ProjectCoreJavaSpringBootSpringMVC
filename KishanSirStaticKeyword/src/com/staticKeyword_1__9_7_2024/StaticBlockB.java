package com.staticKeyword_1__9_7_2024;

public class StaticBlockB {
    static {
        System.out.println("1st static block");
    }

    static {
        System.out.println("2nd static block ");
    }

    public static void main(String[] args) {
        System.out.println("main () called");
    }
}
