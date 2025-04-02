package com.constructor_1__2_7_2024;

public class Programming {
    public Programming() {
        System.out.println("i love programming");
    }

    public Programming(String s) {
        System.out.println("I love " + s);
    }


    public static void main(String[] args) {
        new Programming();
        new Programming("java");
    }
}
