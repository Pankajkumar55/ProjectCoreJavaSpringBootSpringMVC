package com.StringLogicalPrograming_3__5_8_2024;

public class ClassD {

    public static void main(String[] args) {
        ClassD d = new ClassD();
        d.checkName("pankap");
    }

    public void checkName(String name) {
        if (name.substring(0, 1).equals(name.substring(name.length() - 1))) {
            System.out.println("first and last char is same");

        } else
            System.out.println("first and last char is not same");
    }

}
