package com.encapsulation_1__8_8_2024;

import java.util.Scanner;

public class ClassB {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1();
    }

    void meth1() {
        System.out.println("meth1() called");
        ClassA a = new ClassA();

        System.out.println("Enter your name");
        //a.studentName=sc.next();  // C.E because of accessing a private variable
        a.setStudentName("Pankaj");

        a.setStudentId(1);

        a.setStudentCourse("BCA");

        System.out.println("\nDeatils Enter by the Users");

        System.out.println("Name : " + a.getStudentName());
        System.out.println("ID : " + a.getStudentId());
        System.out.println("Course : " + a.getStudentCourse());


    }
}
