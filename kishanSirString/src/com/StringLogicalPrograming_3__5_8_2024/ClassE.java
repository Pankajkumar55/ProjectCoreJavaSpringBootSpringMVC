package com.StringLogicalPrograming_3__5_8_2024;

public class ClassE {
    public static void main(String[] args) {
        ClassE e = new ClassE();
        e.purposl();
        e.meth2();
    }

    void purposl() {
        String letter = "i love you i love you love Love l l";
        String arr[] = letter.split(" ");
        int count = 0;
        for (String s : arr) {
            if (s.equalsIgnoreCase("love")) {
                count++;
            }
        }
        System.out.println("love is repeated : " + count);
    }

    void meth2() {
        String letter = "i love you i love you love Love l l";
        String arr[] = letter.split("");
        int count = 0;
        for (String s : arr) {
            if (s.equalsIgnoreCase("l")) {
                count++;
            }
        }
        System.out.println("l is repeated : " + count);
    }
}
