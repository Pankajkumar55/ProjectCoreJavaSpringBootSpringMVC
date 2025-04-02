package com.encapsulationRevison_2__8_8_2024;

import java.util.Scanner;

public class ClassB {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassA a = new ClassA();


        System.out.println("Enter Employe Name : ");
        a.setEmpName(sc.next());

        System.out.println("Enter your Id");
        a.setEmpId(sc.nextInt());

        System.out.println("Enter your Designation");
        a.setEmpDesignation(sc.next());

        System.out.println("Enter your sallary");
        a.setEmpSallary(sc.nextDouble());


        System.out.println("Name : " + a.getEmpName());
        System.out.println("Id : " + a.getEmpId());
        System.out.println("Company Name : " + a.getCompanyName());
        System.out.println("Designation : " + a.getEmpDesignation());
        System.out.println("Sallary" + a.getEmpSallary());


    }

}
