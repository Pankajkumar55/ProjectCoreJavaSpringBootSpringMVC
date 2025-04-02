package com.shap.AnonymousInnerClass;

public class Main extends Child {
    // public void m1() {
    // System.out.println("Hey m1");
    // }

    public static void main(String[] args) {
        Main main = new Main() {
            public void m1() {
                System.out.println("Hey m1");
            }
        };
        main.m1();
        main.m2();
        main.m3();
        main.m4();
    }

}
