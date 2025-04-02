package com.encapsulationRevison_2__8_8_2024;

import java.util.Scanner;

public class ClassC {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassC r = new ClassC();
        r.meth1();
    }

    void meth1() {

        System.out.println("-----simple interest-----");
        System.out.println("Enter amount : ");
        float principle = sc.nextFloat();

        System.out.println("Enter time : ");
        float time = sc.nextFloat();

        System.out.println("Enter rate : ");
        float rate = sc.nextFloat();

        float result = (principle * rate * time) / 100;

        System.out.println("simple interest : " + result);


    }
}
