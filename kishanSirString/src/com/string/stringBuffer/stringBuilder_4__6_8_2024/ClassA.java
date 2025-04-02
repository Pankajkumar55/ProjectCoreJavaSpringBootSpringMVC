package com.string.stringBuffer.stringBuilder_4__6_8_2024;

public class ClassA {

    public static void main(String[] args) {
        String s = "Pankaj";
        String s1 = "kumar";


        StringBuffer s11 = new StringBuffer("Pankaj");
        StringBuffer s111 = new StringBuffer("Kumar");

        int a = 1, b = 2;
        String c = "3";
        System.out.println(a + b + c);


    }

    void meth3() {
        System.out.println("meth3() called");
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity : " + sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println("length() : " + sb.length());
        // (currentcapacity+1)*1
        System.out.println("capacity() : " + sb.capacity());

        System.out.println("length");

    }
}
