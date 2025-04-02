package com.StringLogicalPrograming_3__5_8_2024;

public class CassB {
    public static void main(String[] args) {
        CassB b = new CassB();
        String s = b.makeAbba("Hi", "Bye");
        System.out.println(s);
    }

    String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
