package com.logical_Question_26_8_2024;

public class Q8_removeWhiteSpace {

    public static void main(String[] args) {
        Q8_removeWhiteSpace r = new Q8_removeWhiteSpace();
        r.meth2();
        r.meth3();
    }

    void meth1() {

        // 1st way
        String name = " pa n ka   j";

        String rmvSpace = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                rmvSpace += ch;
            }
        }
        System.out.println(rmvSpace);

    }

    void meth2() {
        // 2nd way
        String name = " pa n ka   j";
        String rmvSpace = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isWhitespace(c)) {
                rmvSpace += c;
            }
        }
        System.out.println(rmvSpace);

    }

    void meth3() {
        // 3rd way
        String name = " pa n ka   j";
        System.out.println(name.replace(" ", ""));
    }
}
