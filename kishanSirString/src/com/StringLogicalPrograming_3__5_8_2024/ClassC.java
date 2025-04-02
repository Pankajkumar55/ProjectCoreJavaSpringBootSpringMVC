package com.StringLogicalPrograming_3__5_8_2024;

public class ClassC {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        String s = c.makeOutWorld("<<>>", "Yay");
        System.out.println(s);
    }

    public String makeOutWorld(String out, String world) {
        return out.substring(0, 2) + world + out.substring(2);
    }

}
