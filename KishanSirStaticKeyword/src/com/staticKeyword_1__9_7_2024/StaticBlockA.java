package com.staticKeyword_1__9_7_2024;

public class StaticBlockA {

    static {
        System.out.println("Heloo world");

    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        StaticBlockA a = new StaticBlockA();

    }

}
