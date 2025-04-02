package com.ExceptionHandling_throws_5__22_8_2024;

import java.io.FileInputStream;

public class ClassA {

    int avl_amt = 5000;

    public static void main(String[] args) throws Exception {
        ClassA a = new ClassA();
        a.fileOperations();
        //a.transaction(10000);
        System.out.println("main method called");


    }

    void transaction(int wd_amt) throws Exception {
        if (avl_amt >= wd_amt) {
            System.out.println("Transcation succesfull ");
            System.out.println("take your ATM card");
        } else {
            System.out.println("Transaction failed");
            throw new Exception("inssufficent Balance");

        }

    }

    void fileOperations() throws Exception {
        System.out.println("implenting throws keyword");
        FileInputStream fis = new FileInputStream("E:\\TestFile.txt");
        System.out.println("Connection created");
        fis.close();
    }
}