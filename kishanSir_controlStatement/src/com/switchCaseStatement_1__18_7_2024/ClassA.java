package com.switchCaseStatement_1__18_7_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1("pankaj", 17, 3);

    }

    void meth1(String name, int age, int no_of_wheels) {
        System.out.println("implementing switch case ");

        final int i = 10; // Final variables are CONSTANT
        // i++ // C.E
        byte b = 40;
        switch (b + 25) {
            // System.out.println("hello world"); // C.E

            default:
                System.out.println("defualt case got triggered");
            case i:
                System.out.println("case 10 executed");
                break;
            case 20:
                System.out.println("case 20 executed");
                break;
            case 'A':
                System.out.println("case 65 executed");
                if (age >= 18) {
                    System.out.println("You are eligible for lisence");
                    switch (no_of_wheels) {
                        case 2:
                            System.out.println(name + " your are eligible for " + (no_of_wheels) + " wheeler license "
                                    + "please pay" + (new ClassA().fees() - 500));
                            break;
                        case 3, 4:
                            System.out.println(name + " your are eligible for " + (no_of_wheels) + " wheeler license "
                                    + "please pay" + (new ClassA().fees()));
                            break;
                        case 6, 8, 10:
                            System.out.println(name + " your are eligible for " + (no_of_wheels) + " wheeler license "
                                    + "please pay" + (new ClassA().fees() + 500));
                    }
                } else
                    System.out.println("You are eligible for license after " + (18 - age) + " Years");
                break;
            case 30:
                System.out.println("case 30 executed");
                break;
            case 40:
                System.out.println("case 40 executed");
                break;
            case 50:
                System.out.println("case 50 executed");
                break;
        }
    }

    int fees() {
        return 1500;
    }
}
