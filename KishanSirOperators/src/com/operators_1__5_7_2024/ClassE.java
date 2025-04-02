package com.operators_1__5_7_2024;

public class ClassE {
    public static void main(String[] args) {
        new ClassE().meth1();
    }

    void meth1() {
        int x = 10;
        System.out.println("Befor x : " + x);
        x = x++;
        System.out.println("After  x : " + x + "\n");

        int y = 20;
        System.out.println("Befor y : " + y);
        int z = y++;
        System.out.println("After y : " + y);
        System.out.println("z value : " + z + "\n");

        int i = 50;
        System.out.println("Befor i : " + i);
        i = i++ + ++i;
        System.out.println("After i : " + i + "\n");

        int k = 100;
        System.out.println("Befor k : " + k);
        k = k++ + 10;
        System.out.println("After k : " + k + "\n");

        int m = 100;
        System.out.println("Befor m : " + m);
        m = ++m + 10;
        System.out.println("After m : " + m + "\n");

        System.out.println("Sum : " + (x + y + z + i + k + m));
    }
}
