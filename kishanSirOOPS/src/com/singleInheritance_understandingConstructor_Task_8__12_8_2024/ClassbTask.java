package com.singleInheritance_understandingConstructor_Task_8__12_8_2024;

public class ClassbTask extends ClassaTask {
    ClassbTask() {
        this(show(50));
        for (int i = 1; ; i++) {
            super.meth4();
            break;
        }
        System.out.println("hi");
        System.out.println(show(50));

    }

    ClassbTask(int a) {
        System.out.println("===>" + (a++ + show(50)));
    }

    static int show(int a) {
        System.out.println(a + a);
        return a + a++;
    }

    public static void main(String[] args) {
        new ClassbTask().display();
    }

    void display() {
        System.out.println("hi");
        super.meth4();

    }
}
