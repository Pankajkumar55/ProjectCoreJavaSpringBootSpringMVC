package com.staticKeyword_1__9_7_2024;

public class StaticBlockC {
    public final static int x;

    static {

        System.out.println(" 1st static block called ");
    }


    static {
        x = 50;
        System.out.println("2nd static block called");
        System.out.println("final static variable called value of x : " + x);
    }

    public static void main(String[] args) {
        System.out.println("main () called");

        // x=60;  // C.E because final varibales are CONSTANTS

        // x=70;  // C.E because final static varibales we need to initilize
        //
        System.out.println("");
    }

}
