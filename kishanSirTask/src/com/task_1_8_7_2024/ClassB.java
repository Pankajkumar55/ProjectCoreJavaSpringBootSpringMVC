package com.task_1_8_7_2024;

public class ClassB {

    public static void main(String[] args) {
        new ClassB().meth1('A');
        new ClassB().voteEligilibityTest("pankaj", 20);
        new ClassB().examEligibility("Pankaj", 25);
        new ClassB().meth2(20);

    }

    void meth1(int i) {
        System.out.println("meth1() called");
        if (i >= 10) {
            System.out.println("if block executed ");
        } else {
            System.out.println("else block executed ");
        }

    }

    void voteEligilibityTest(String name, int age) {
        System.out.println("checking vote eligiblity test");
        if (age >= 18) {
            System.out.println(name + "yor r eligible to vote ");
        } else {
            System.out.println(name + "u r eligible to vote after " + (18 - age) + "years");
        }

    }

    void examEligibility(String name, int age) {
        System.out.println(" Checking Exam eligiblity for Exam");
        if (!(age >= 22 || age <= 35)) {
            System.out.println(name + " You are eligible for exam ");

        } else {

            System.out.println(name + " You are eligible for exam");
        }

    }

    void meth2(int i) {

        System.out.println("meth2() called");
        if (!(!(!(i <= 10)))) {
            System.out.println("hii");
        } else {
            System.out.println("hello");
        }

    }
}
