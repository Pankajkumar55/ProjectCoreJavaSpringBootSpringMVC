package com.StringLogicalPrograming_3__5_8_2024;

import java.util.Scanner;

public class ClassA {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassA a = new ClassA();
        String s = a.helloName("Pankaj");
        System.out.println(a.helloName(s));


    }

    String helloName(String name) {
        return "Hello ".concat(name).concat(" !");

    }
}
