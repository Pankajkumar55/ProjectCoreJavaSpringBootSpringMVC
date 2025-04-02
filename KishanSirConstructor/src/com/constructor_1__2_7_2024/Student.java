package com.constructor_1__2_7_2024;

public class Student {
    public Student() {
        System.out.println("Unknown");
    }

    public Student(String s) {
        System.out.println("Name of Student : " + s);
    }

    public static void main(String[] args) {
        new Student("pankaj");
    }
}
