package com.StringLogicalPrograming_3__5_8_2024;

public class PalindromeOrNot {

    public static void main(String[] args) {
        PalindromeOrNot p = new PalindromeOrNot();

        System.out.println(p.meth1("PANKAJ"));
        p.meth2();


    }

    String meth1(String name) {
        System.out.println("meth1() called");
        String revName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revName = revName + name.charAt(i);
        }
        System.out.println("original value : " + name);
        System.out.println("revrse name : " + revName);

        if (name.equalsIgnoreCase(revName))
            return name + "name is palendrome ";
        else
            return name + " is not palendrome";

    }

    void meth2() {
        System.out.println("\nmeth2() called");
        String s = "";
        String name = "nitin";
        char rv[] = name.toCharArray();
        // char charName[]=name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            s = s + rv[i];
        }
        if (s.equalsIgnoreCase(name))
            System.out.println(name + " is palendrome");
        else
            System.out.println(name + " is not palendrome");
    }
}
