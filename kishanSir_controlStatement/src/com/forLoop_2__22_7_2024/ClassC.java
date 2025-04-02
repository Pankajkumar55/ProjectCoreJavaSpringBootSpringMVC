package com.forLoop_2__22_7_2024;

public class ClassC {

    public static void main(String[] args) {

        ClassC c = new ClassC();
        // c.meth1();
        c.meth2();
    }

    void meth1() {
        int fact = 1;
        int factOfNo = 5; // Number taken for factorial
        for (int i = 1; i <= factOfNo; i++)

            fact = fact * i;

        System.out.println(fact);
    }

    void meth2() {
        int sTable = 1;
        int eTable = 10;
        int sum = 0;
        int totalsum = 0;

        for (; sTable <= eTable; sTable++) {
            for (int b = 1; b <= 10; b++) {
                int table = sTable * b;
                System.out.println(table);

                sum = sum + table;

            }
            System.out.println("Sum of table : " + sum);

            totalsum = totalsum + sum;

            System.out.println("total sum of start table : " + totalsum);
            sum = 0;
        }
    }
}
