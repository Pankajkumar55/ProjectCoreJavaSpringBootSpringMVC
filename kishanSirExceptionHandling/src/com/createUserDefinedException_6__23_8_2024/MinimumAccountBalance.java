package com.createUserDefinedException_6__23_8_2024;

public class MinimumAccountBalance extends Exception {

    String msg;

    public MinimumAccountBalance(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }

}