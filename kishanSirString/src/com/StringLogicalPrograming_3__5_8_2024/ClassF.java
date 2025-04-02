package com.StringLogicalPrograming_3__5_8_2024;

public class ClassF {
    public static void main(String[] args) {
        ClassF f = new ClassF();
        String s = f.doubleChar("KishanSir");
        System.out.println(s);
    }

    public String doubleChar(String str) {

        String str2[] = str.trim().split("");
        String sAdd = "";
        for (int i = 0; i <= str2.length - 1; i++) {
            sAdd = sAdd + str2[i] + str2[i];
        }
        return sAdd;

    }
}
